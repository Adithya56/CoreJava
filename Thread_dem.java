package Java_Practice;

class Alpha extends Thread {
	public void run() {
		print();
		print();
	}

	synchronized public void print() {
		for (int i = 0; i <= 4; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) { // TODO Auto-generated catch block e.printStackTrace(); }
				System.out.println(Thread.currentThread().getName() + " " + i);
			}

		}
	}
}

public class Thread_dem {

	public static void main(String[] args) { // TODO Auto-generated method stub Alpha t1 = new Alpha(); Alpha t2 =
												// new
		Alpha t1 = new Alpha();
		Alpha t2 = new Alpha();
		t1.start();
		t2.start();

	}

}

// class table extends Thread {
// public void run() {
// for (int i = 1; i < 10; i++) {
// System.out.println("13 * " + i + "=" + 13 * i);
// }
// }
//
// public class Thread_dem {
//
// public static void main(String[] args) {
// // TODO Auto-generated method stub
// table x=new table();
// table y=new table();
//
// x.start();
// y.start();
// }
//
// }