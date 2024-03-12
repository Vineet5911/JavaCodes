package collectionFramework;

import java.util.Set;
import java.util.HashSet;

public class hashSet {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
//		we can also use LinkedHashSet here and that will print all the elements in the order as we have entered.
//	    The syntax of LinkedHashSet is given below.
//		Set<Integer> set = new LinkedHashSet<>();
		
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

	}

}
