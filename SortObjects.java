package Java_Practice;

import java.util.ArrayList;
import java.util.Collections;

// class Passenger {
//
// }

class Passenger implements Comparable<Passenger> {
	private String name;
	private byte age;
	private char gender;

	Passenger(String n, byte a, char g) {
		this.name = n;
		this.age = a;
		this.gender = g;
	}

	public String getName() {
		return name;
	}

	public byte getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public int compareTo(Passenger l) {
		if (this.getAge() > l.getAge()) {
			return 1;
		} else if (this.getAge() < l.getAge()) {
			return -1;
		} else
			return 0;
	}

	public String toString() {
		return this.getName() + " " + this.getAge();
	}
}

public class SortObjects {

	public static void main(String[] args) {
		Passenger a1 = new Passenger("Adithya", (byte) 20, 'M');
		Passenger a2 = new Passenger("Adithya1", (byte) 24, 'M');
		Passenger a3 = new Passenger("Adithya2", (byte) 10, 'M');
		Passenger a4 = new Passenger("Adithya3", (byte) 19, 'M');
		Passenger a5 = new Passenger("Adithya4", (byte) 2, 'M');
		ArrayList<Passenger> pl = new ArrayList<Passenger>();
		pl.add(a1);
		pl.add(a2);
		pl.add(a3);
		pl.add(a4);
		pl.add(a5);
		for (Passenger p : pl) {
			System.out.println(p.getName() + "==>" + p.getAge());
		}
		System.out.println(pl);
		System.out.println("--------------------------");
		Collections.sort(pl);
		System.out.println(pl);
		for (Passenger p : pl) {
			System.out.println(p.getName() + "==>" + p.getAge());
		}

		// Collections.sort(pl, new Comparator<Passenger>() {
		// public int compare(Passenger p1, Passenger p2) {
		// System.out.println(p1.getAge() + " " + p2.getAge());
		// if (p1.getAge() > p2.getAge())
		// return 1;
		// if (p1.getAge() < p2.getAge())
		// return -1;
		// else
		// return 0;
		// }
		//
		// });
		// for (Passenger p : pl) {
		// System.out.println(p);
		// }

	}

}
