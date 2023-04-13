package Java_Practice;

class First_T {
	int x = 40;

	public synchronized void print(int x) {

		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " + Thread.currentThread().getName());
		}

		/*
		 * if (this.x - x >= 10) { System.out.println("Shared x=" + this.x + " can be updated by: " +
		 * Thread.currentThread().getName() + " because x value is " + x + " which is greater than 10"); this.x = this.x
		 * - x; System.out.println("Updated shared variable x is : " + this.x); } else { System.out.println("Shared x="
		 * + this.x + " cannot be updated by: " + Thread.currentThread().getName() + " because x value is " + x +
		 * " which is less than 10"); }
		 */
	}
}

public class SynchronizedDemo extends Thread {
	First_T f = new First_T();

	/*
	 * public SynchronizedDemo(First_T f) { this.f = f; }
	 */

	public void run() {
		f.print(15);
		f.print(20);
	}

	public static void main(String[] args) {
		SynchronizedDemo s = new SynchronizedDemo();
		SynchronizedDemo s1 = new SynchronizedDemo();
		s.start();
		s1.start();
	}

}
