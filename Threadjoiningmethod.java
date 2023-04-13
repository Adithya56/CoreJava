package Java_Practice;

class Exam extends Thread {
	public void run() {
		System.out.println("Exam are finished");
	}
}

class Result extends Thread {
	public void run() {
		System.out.println("Results are released");
	}
}

public class Threadjoiningmethod {
	public static void main(String args[]) {
		Exam th1 = new Exam();
		Result th2 = new Result();

		th1.start();
		for (int i = 0; i < 20; i++)
			System.out.println("hii");
		try {
			th1.join();

		} catch (Exception e) {
			System.out.println(e);
		}
		th2.start();
		try {
			th2.join();

		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("100% pass");
	}
}