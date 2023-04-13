package Java_Practice;

interface A {
	public void Deposit();
}

interface B extends A {
	public void Deposit2();
}

class C implements B {
	public void Deposit() {
		System.out.println("it A");
	}

	public void Deposit2() {
		System.out.println("it B");
	}
}

class D implements A {
	public void Deposit() {
		System.out.println("it A");
	}

}

/*
 * public class DownCast { public void Interest(A a) { if (a instanceof A) { a.Deposit(); } else if (a instanceof B) { B
 * b = (B) a; b.Deposit2(); } else if (a instanceof C) { C c = (C) a; c.Deposit3(); } }
 */
public class DownCast {
	public static void main(String[] args) {
		// B b = new B();
		C c = new C();
		D d = new D();
		A it1;
		B it2;
		it1 = c;
		c.Deposit2();
		// it1 = d;
		it2 = c;
		// it1.Deposit();
		it2.Deposit2();
		/*
		 * it2 = d; it2.Deposit();
		 */

		// A a = new A();
		// A a1 = new B();
		// DownCast d = new DownCast();
		// d.Interest(b);
		// d.Interest(c);
		// d.Interest(a);
		// d.Interest(a1);
	}

}
