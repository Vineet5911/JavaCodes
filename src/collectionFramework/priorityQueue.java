package collectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;


public class priorityQueue {

	public static void main(String[] args) {
		
		
		//in the below line the priority is from min to max 
		Queue<Integer> pq = new PriorityQueue<>();
		
		//if we put the below commented line at the place of above stated line it will work as max to min
		//Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder();
		//the statement Comparator.reverseOrder changes its property from min to max to max to max to min
		
		
		pq.offer(34);
		pq.offer(56);
		pq.offer(97);
		pq.offer(23);
		
		
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		
        System.out.println(pq.peek());
	
	}

}
