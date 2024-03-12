package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class operationOnArrayList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(343);
		list.add(345);
		list.add(87);
		list.add(973);
		list.add(85);
		list.add(750);
		list.add(64);
		
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println("the element is" + list.get(i));
		}
		
		for (Integer element: list) {
			System.out.println("for each element is" + element);
		}
			
		Iterator<Integer> it = list.iterator();
		
		while (it.hasNext()) {
			System.out.println("iterator" + it.next());
		}
	}

}
