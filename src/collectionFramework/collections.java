package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class collections {

	public static void main(String[] args) {
		
		List<Integer> List = new ArrayList<>();
		List.add(14);
		List.add(22);
		List.add(45);
		List.add(76);
		List.add(63);
		List.add(19);
		List.add(43);
		List.add(9);
		
		System.out.println("min element" + Collections.min(List));
		System.out.println("max element" + Collections.max(List));
        System.out.println(Collections.frequency(List, 9));
        
        Collections.sort(List, Comparator.reverseOrder());
        
        System.out.println(List);
		
		
	}

}
