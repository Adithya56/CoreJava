package PracticeIT;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Account {
	private int ano;
	private String name;
	private double cbal;

	Account(int a, String n, double b) {
		ano = a;
		name = n;
		cbal = b;
	}

	public double getcbal() {
		return this.cbal;
	}
}

public class Reflect {
	public int x = 9;
	public String y = "Adithya";

	public Reflect(int i) {
		System.out.println("Parameterized Constructor called with value: " + i);
	}

	public Reflect() {
		System.out.println("No parameterized constructor called");
	}

	public void print(int i) {
		System.out.println("Hello world.." + i);
	}

	public void print() {
		System.out.println("bye");
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException {

		Class cl = Class.forName("PracticeIT.Reflect");
		// System.out.println(cl);
		// Method[] m = cls.g ();
		// System.out.println(m);
		// m[1].invoke(cls.newInstance(), new Integer(x));

		// Constructor cons[] = cl.getConstructors();
		// for (Constructor i : c)
		// System.out.println(c);
		Object newInstancePC = cl.newInstance();
		Reflect r = (Reflect) newInstancePC;

		Method m[] = cl.getMethods();// calls all the methods from the given class and java.lang.Object methods
		for (Method i : m)
			System.out.println("Method called from '" + i.getClass() + "' is '" + i + "'");
		m[1].invoke(r);// calling non parameterized method
		m[2].invoke(r, new Integer(7));// calling parameterized methods
		// Field f[] = cl.getDeclaredFields();
		// for (Field j : f)
		// System.out.println(j + " ==> is of type: " + j.getType());
		// System.out.println("String variable y having value of : " + r.y);

		// Method[] m = cls.getMethods();
		// System.out.println(m);
		// Method m = cls.getDeclaredMethod("print", null);
		// m.invoke(a, null);

	}

}
