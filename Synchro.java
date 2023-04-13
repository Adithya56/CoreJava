package Java_Practice;

class Syn extends Thread {
	int x = 0;

	public void run() {
		print();

	}

	public synchronized void print() {
		for (int i = 0; i < 5; i++) {
			x++;
			System.out.println(i + " " + Thread.currentThread().getName());
			System.out.println(x + " " + Thread.currentThread());
		}
	}
}

public class Synchro {

	public static void main(String[] args) {
		Syn a = new Syn();
		Syn b = new Syn();
		a.start();
		b.start();
	}

}
