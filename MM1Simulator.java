
import java.io.*;

public class MM1Simulator {

	public static void main(String[] args) throws IOException {

		double lambda = 0.1;
		double mu = 1;
		double length = 10000;

		double theoriticalVal = 1 / (mu - lambda);

		Queue c1 = new Queue(lambda, mu, length);
		File file = new File("/users/varsha/Downloads/g.txt");
		PrintWriter out;

		try {
			out = new PrintWriter(file);

			c1.run(out);

			String content =

			+lambda + "\t" + theoriticalVal + "\t" + Queue.tq + "\n";

			// File file1 = new File("/users/varsha/Downloads/g.txt");
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		lambda = 0.2;
		Queue c2 = new Queue(0.2, 1, 10000);
		theoriticalVal = 1 / (mu - lambda);

		file = new File("logs/mm1/sim2_log.txt");
		try {
			out = new PrintWriter(file);

			c2.run(out);

			String content =

			+lambda + "\t" + theoriticalVal + "\t" + Queue.tq + "\n";

			File file1 = new File("/users/varsha/Downloads/g.txt");
			// if file doesnt exists, then create it
			if (!file1.exists()) {
				file1.createNewFile();
			}

			FileWriter fw = new FileWriter(file1.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		lambda = 0.3;
		Queue c3 = new Queue(0.3, 1, 10000);
		theoriticalVal = 1 / (mu - lambda);

		file = new File("logs/mm1/sim3_log.txt");
		try {
			out = new PrintWriter(file);
			c3.run(out);
			String content =

			+lambda + "\t" + theoriticalVal + "\t" + Queue.tq + "\n";

			File file1 = new File("/users/varsha/Downloads/g.txt");
			// if file doesnt exists, then create it
			if (!file1.exists()) {
				file1.createNewFile();
			}

			FileWriter fw = new FileWriter(file1.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// ts = 0.02;
		lambda = 0.4;
		Queue c4 = new Queue(0.4, 1, 10000);
		theoriticalVal = 1 / (mu - lambda);

		file = new File("logs/mm1/sim4_log.txt");
		try {
			out = new PrintWriter(file);

			c4.run(out);

			String content =

			+lambda + "\t" + theoriticalVal + "\t" + Queue.tq + "\n";

			File file1 = new File("/users/varsha/Downloads/g.txt");
			// if file doesnt exists, then create it
			if (!file1.exists()) {
				file1.createNewFile();
			}

			FileWriter fw = new FileWriter(file1.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		lambda = 0.5;
		Queue c5 = new Queue(0.5, 1, 10000);
		theoriticalVal = 1 / (mu - lambda);

		file = new File("logs/mm1/sim4_log.txt");
		try {
			out = new PrintWriter(file);

			c5.run(out);

			String content =

			+lambda + "\t" + theoriticalVal + "\t" + Queue.tq + "\n";

			File file1 = new File("/users/varsha/Downloads/g.txt");
			// if file doesnt exists, then create it
			if (!file1.exists()) {
				file1.createNewFile();
			}

			FileWriter fw = new FileWriter(file1.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		lambda = 0.6;
		Queue c6 = new Queue(0.6, 1, 10000);
		theoriticalVal = 1 / (mu - lambda);

		file = new File("logs/mm1/sim4_log.txt");
		try {
			out = new PrintWriter(file);

			c6.run(out);

			String content =

			+lambda + "\t" + theoriticalVal + "\t" + Queue.tq + "\n";

			File file1 = new File("/users/varsha/Downloads/g.txt");
			// if file doesnt exists, then create it
			if (!file1.exists()) {
				file1.createNewFile();
			}

			FileWriter fw = new FileWriter(file1.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		lambda = 0.7;
		Queue c7 = new Queue(0.7, 1, 10000);
		theoriticalVal = 1 / (mu - lambda);

		file = new File("logs/mm1/sim4_log.txt");
		try {
			out = new PrintWriter(file);

			c7.run(out);

			String content =

			+lambda + "\t" + theoriticalVal + "\t" + Queue.tq + "\n";

			File file1 = new File("/users/varsha/Downloads/g.txt");
			// if file doesnt exists, then create it
			if (!file1.exists()) {
				file1.createNewFile();
			}

			FileWriter fw = new FileWriter(file1.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		lambda = 0.8;
		Queue c8 = new Queue(0.8, 1, 100000);
		theoriticalVal = 1 / (mu - lambda);

		file = new File("logs/mm1/sim4_log.txt");
		try {
			out = new PrintWriter(file);

			c8.run(out);

			String content =

			+lambda + "\t" + theoriticalVal + "\t" + Queue.tq + "\n";

			File file1 = new File("/users/varsha/Downloads/g.txt");
			// if file doesnt exists, then create it
			if (!file1.exists()) {
				file1.createNewFile();
			}

			FileWriter fw = new FileWriter(file1.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		lambda = 0.9;
		Queue c9 = new Queue(0.9, 1, 10000);
		theoriticalVal = 1 / (mu - lambda);

		file = new File("logs/mm1/sim4_log.txt");
		try {
			out = new PrintWriter(file);

			c9.run(out);

			String content =

			+lambda + "\t" + theoriticalVal + "\t" + Queue.tq + "\n";

			File file1 = new File("/users/varsha/Downloads/g.txt");
			// if file doesnt exists, then create it
			if (!file1.exists()) {
				file1.createNewFile();
			}

			FileWriter fw = new FileWriter(file1.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
			System.out.println("Data are written to file");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
