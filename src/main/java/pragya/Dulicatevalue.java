package pragya;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Dulicatevalue {

	public static void main(String[] args) {
		List<String> s = new ArrayList();

		s.add("test");
		s.add("pragya");
		s.add("demo");
		s.add("test");
		Set<String> set = new HashSet();
		List<String> duplicate = new ArrayList();
		for (String element : s) {
			if (!set.add(element))
				duplicate.add(element);
				set.add(element);

		}
		System.out.println("List of Element: "+ s);
		System.out.println("Unique Element: "+ set);
		System.out.println("Duplicate Element" +"  "+ duplicate);
	}

}
