

import java.util.*;
import java.util.Random;
import java.io.*;

public class Queue {

	public static final int ARRIVAL = 0;
	public static final int DEPARTURES = 1;

	LinkedList<Helper> schedule;
	double clock, endTime, nextArrival, nextDeparture, lambda, ts;

	ArrayList<Double> verifyVal;
	int testCheck;

	public static double Tq, Tw, Ts, tq;
	int w, q;
	int requests, serviced;

	public Queue(double lambda, double ts, double endTime) {
		this.lambda = lambda;
		this.ts = ts;
		this.endTime = endTime;

		verifyVal = new ArrayList<Double>();
		double n = 0;
		while (n < 2 * endTime) {
			testCheck++;
			n += exponential(lambda);
			verifyVal.add(n);
		}

		clock = 0;
		schedule = new LinkedList<Helper>();
		nextArrival = exponential(lambda);
		nextDeparture = Double.POSITIVE_INFINITY;

		Tq = 0;
		Tw = 0;
		Ts = 0;
		w = 0;
		q = 0;
		requests = 0;
		serviced = 0;
	}

	public void arrivalEvent(double time) {
		if (schedule.isEmpty()) { 
			scheduleDeparture(time);
		} else { 
			schedule.add(new Helper(time, ARRIVAL));
		}
		nextArrival += exponential(lambda); 
	}

	
	public void departureEvent() {
		schedule.remove(); 
		if (!schedule.isEmpty()) { 
									
			Helper next = schedule.remove();
			scheduleDeparture(next.getTime());
		} else {
			nextDeparture = Double.POSITIVE_INFINITY; 
														
			nextArrival += exponential(lambda);
		}
	}


	public void scheduleDeparture(double arrivalTime) {
		nextDeparture = clock + exponential(1 / ts);
		schedule.addFirst(new Helper(nextDeparture, DEPARTURES));
		serviced++;
		Tq += (nextDeparture - arrivalTime);
		Tw += (clock - arrivalTime);
		Ts += (nextDeparture - clock);

	}

	
	public void valueCheck(PrintWriter out) {
		int cur_q = schedule.size();
		int cur_w = (cur_q > 0) ? (schedule.size() - 1) : 0;
		w += cur_w;
		q += cur_q;
		verifyVal.remove(0);
	

	}

	public static double exponential(double lambda) {
		Random r = new Random();
		double x = Math.log(1 - r.nextDouble()) / (-lambda);
		return x;
	}

	public void run(PrintWriter out) {
		while (clock < 2 * endTime) {
			if (verifyVal.get(0) < nextArrival
					&& verifyVal.get(0) < nextDeparture) {
				clock = verifyVal.get(0);
				
				valueCheck(out);
			} else if (nextArrival <= nextDeparture) {

				clock = nextArrival;
			
				arrivalEvent(nextArrival);
				requests++;
			} else {
				clock = nextDeparture;
				
				departureEvent();
			}
		}

		printStats(out);
		out.close();
	}

	public void printStats(PrintWriter out) {
		tq = Tq / serviced;

	}

public class Helper {
    private double duration;
    private int type; 

    public Helper(double t, int e) {
        this.duration = t;
        this.type = e;
    }

    public double getTime() {
        return duration;
    }

    public int getType() {
        return type;
    }

}
}