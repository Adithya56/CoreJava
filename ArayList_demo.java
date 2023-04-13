package Java_Practice;

import java.util.ArrayList;
import java.util.List;

public class ArayList_demo {

	public static void main(String[] args) {

		List<String> langs = new ArrayList<>();

		langs.add("Java");
		langs.add("Python");
		langs.add(1, "C#");
		langs.add(0, "Ruby");
		langs.add(0, "hi");

		for (String lang : langs) {

			System.out.printf("%s ", lang);
		}

		System.out.println();
	}
}