package collectionFramework;

import java.util.ArrayDeque;

public class arrayDeck {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		
		adq.offer(23);
		adq.offer(12);
		adq.offer(45);
		adq.offer(26);
		
		System.out.println(adq);
		
		System.out.println(adq.peek());
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());

		System.out.println(adq.poll());
		System.out.println("poll() "+adq);
		
		System.out.println(adq.pollFirst());
		System.out.println("pollFirst()" +adq);
		
		System.out.println(adq.pollFirst());
        System.out.println("pollLast() "+adq);
 	    
	
	
	
	}

}
