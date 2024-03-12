package collectionFramework;

import java.util.Set;
import java.util.TreeSet;
public class treeSet {
	public static void main(String[] args) {
//		in a TreeSet an element is never repeated and it gives in sorted form.
		Set<Integer> set = new TreeSet<>();
		 set.add(32);
		 set.add(2);
		 set.add(54);
		 set.add(21);
		 set.add(65);
		 set.add(54);
		 System.out.println(set);
		set.remove(65);
		System.out.println(set);
		System.out.println(set.contains(21));
		System.out.println(set.isEmpty());
		System.out.println(set.size());
	}
}
