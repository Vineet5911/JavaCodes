package collectionFramework;

import java.util.Arrays;

public class arraysClass {

	public static void main(String[] args) {
		

		int[] numbers = {14,23,37,4,5,6,7,8,9,10};
        int index = Arrays.binarySearch(numbers, 4);
	
	    System.out.println("The index of element 4 in the array is 3 "+ index);
	 
	
	    Arrays.sort(numbers);
	    
	    
//	    below line is commented because if it will be uncommented then it will change the whole set into 12.
//	    Arrays.fill(numbers, 12);
	    
	    for (int i : numbers) {
	    	System.out.print(i+"");
	    
	    
	    }	
	    
	
	
	}

}
