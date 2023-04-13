
class Ser<T> {
	T x = (T) "Hii";
	T val;

	Ser(T val) {
		this.val = val;
		x = val;
	}

	void print() {
		System.out.println(x.getClass().getName());
		System.out.println(val.getClass().getName());
	}

	String s = ((String) x).substring(0, 2);
}

public class BoundedGenerics {
	public static void main(String[] args) {
		// ArrayList values = new ArrayList();
		// values.add(5);
		// values.add("String");
		// Double d= (Double) "Hi";
		Ser<Double> a = new Ser<>(10.5);
		System.out.println(a.x);
		System.out.println(a.s);
		a.print();
	}

}