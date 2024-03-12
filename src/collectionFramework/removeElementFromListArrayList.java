package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class removeElementFromListArrayList {

	public static void main(String[] args) {
		
		List<Integer> num = new ArrayList<>();
		num.add(34);
		num.add(343);
		num.add(43);
		num.add(342);
		num.add(85);
		
		System.out.println(num);

//		num.remove(index:2); //in this line there is an error other commented lines are correct they are commented for letting the code run smoothly.
//		System.out.println(num);
	
        num.remove(Integer.valueOf(342));
        System.out.println(num);
		
//		num.clear();  //this line is correct
//		System.out.println(num);
		
//		num.set(2, 10); //this line is correct 
//		System.out.println(num);
		
		
		System.out.println(num.contains(34));
	}

}
