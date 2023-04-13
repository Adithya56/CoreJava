package Java_Practice;

class Outer {
	public int x = 9;
	private int y = 10;

	public void hello() {
		System.out.println("Hello");
	}

	public class Inner { // inner class
		public int a = 5;
		private int b = 9;

		public void hii() { // inner class method
			System.out.println("Outer class variable x= " + Outer.this.x);// outer class member variables accessing
			Outer.this.hello();// outer class function calling
			System.out.println("Hii");
			class Adi { // creating class inside the method
				public void superr() {
					System.out.println("Hii");
				}
			}
			Adi s = new Adi();
			s.superr();
		}
	}

}

public class InnerClass {

	public static void main(String[] args) {

		Outer a = new Outer();
		Outer.Inner ab = a.new Inner();
		ab.hii();
		a.hello();
	}

}
