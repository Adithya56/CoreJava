import java.util.HashMap;
import java.util.HashSet;

class Alpha {
	int id;

	public Alpha(int id) {
		this.id = id;
	}

}

class Beta {
	int id;

	public Beta(int id) {
		this.id = id;
	}
}

public class HashCodeEquals {

	public static void main(String[] args) {
		Alpha a = new Alpha(5);
		Alpha c = new Alpha(5);
		System.out.println(a.hashCode());
		System.out.println(c.hashCode());
		System.out.println(a.equals(c));

		HashMap<Integer, String> h1 = new HashMap<>();
		h1.put(1, "Adithya");
		h1.put(2, "Thandra");

		HashMap<Integer, String> h2 = new HashMap<>();
		h2.put(1, "Adithya");
		h2.put(2, "Neeraj");

		System.out.println(h1.equals(h2));
		System.out.println("h1: " + h1.hashCode());
		System.out.println("h2: " + h2.hashCode());

		HashSet<String> h3 = new HashSet<>();
		h3.add("Hello");
		h3.add("World");

		System.out.println(h3);
		HashSet<String> h4 = new HashSet<>();
		h4.add("Hello");
		h4.add("World");
		System.out.println(h3.equals(h4));
		System.out.println(h3.hashCode());
		System.out.println(h4.hashCode());

	}

}
