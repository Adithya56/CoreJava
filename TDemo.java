
package Java_Practice;

class Counter implements Runnable {
	int count;

	public synchronized void increment() {
		count++;
	}

	public void run() {
		for (int i = 1; i <= 1000; i++) {
			increment();
		}
	}
}

public class TDemo {
	public static void main(String args[]) throws InterruptedException {
		Counter c = new Counter();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(c.count);
	}
}

/*
 * package Java_Practice;
 * 
 * class ATest extends BTest implements Runnable { int c = 0;
 * 
 * public void run() { for (int i = 0; i < 10; i++) { try { Thread.sleep(500); } catch (InterruptedException e) {
 * e.printStackTrace(); } c++; System.out.println(Thread.currentThread().getName() + " " + c); } }
 * 
 * }
 * 
 * class BTest extends Thread { int c = 0;
 * 
 * public void run() { for (int i = 10; i < 20; i++) { try { Thread.sleep(500); } catch (InterruptedException e) {
 * e.printStackTrace(); } c++; System.out.println(Thread.currentThread().getName() + c); } }
 * 
 * }
 * 
 * public class TDemo { public static void main(String args[]) throws InterruptedException { ATest a = new ATest();
 * Thread c = new Thread(a); BTest b = new BTest(); c.start(); b.start(); c.join(); b.join();
 * System.out.println("Completed.."); }
 * 
 * }
 */
