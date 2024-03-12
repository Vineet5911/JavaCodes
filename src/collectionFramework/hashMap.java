package collectionFramework;

import java.util.HashMap;
import java.util.Map;


public class hashMap {

	public static void main(String[] args) {
		
		Map<String, Integer> numbers = new HashMap<>();

		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		
		numbers.put("Two", 5);
		
		
//	Both case 1 & case 2 will work same.	
//		It checks that weather it contains a key or not
	//	case - 1
//		if(!numbers.containsKey("Two")) {
//			numbers.put("Two", 23);
//		}
		
	//	case -2
		numbers.putIfAbsent("Two", 23);
		
		
		
		
		System.out.println(numbers);
		
		for (Map.Entry<String, Integer>e:numbers.entrySet()) {
			System.out.println(e);
			
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
//		below given line will print only keys
		for (String key: numbers.keySet()) {
			System.out.println(key);
		}
//		below given line will print only values
		for (Integer value: numbers.values()) {
			System.out.println(value);	
		}
//		below given line will check that do our code contains that value or not and will print the answer in true or false
		System.out.println(numbers.containsValue(3));
		
//		below given line will check that do our code contains that key or not and will print the answer in true or false
		System.out.println(numbers.containsKey("Three"));
	
//	    Below given line will check that is our set empty or not
		System.out.println(numbers.isEmpty());
	
//	    Below given line will clear the set 
//	    System.out.println(numbers.clear());
	
	}

}
