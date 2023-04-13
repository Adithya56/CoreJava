public class CharachterHolder {
	char c;

	public synchronized char readChar() {

		if (c == '\u0000') {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		notify();
		return c;
	}

	public synchronized void writeChar(char c) throws InterruptedException {

		this.c = c;
		Thread.sleep(100);
		System.out.println("Written charachter: " + this.c);
		notify();
		c = '\u0000';
		wait();

	}

	public static void main(String args[]) throws InterruptedException {
		CharachterHolder ref = new CharachterHolder();
		AlphabetGenerator ag = new AlphabetGenerator(ref);
		AlphabetReader ar = new AlphabetReader(ref);

		ar.start();
		ag.start();
	}
}

class AlphabetGenerator extends Thread {
	CharachterHolder c;

	AlphabetGenerator(CharachterHolder c) {
		this.c = c;
	}

	public void run() {
		try {
			for (int i = 97; i < 123; i++) {
				c.writeChar((char) i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

class AlphabetReader extends Thread {
	CharachterHolder d;

	AlphabetReader(CharachterHolder c) {
		this.d = c;
	}

	public void run() {
		for (int j = 1; j < 27; j++) {

			System.out.println("Read charachter is: " + d.readChar());
		}

	}
}
