package collectionFramework;

import java.util.Queue;

import java.util.LinkedList;

public class LinkedListInQueue {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(34);
		queue.offer(45);
		queue.offer(86);
		queue.offer(96);
		queue.offer(80);
		
		System.out.println(queue);
		
		System.out.println(queue.poll());
		
		System.out.println(queue);
		
		System.out.println(queue.peek());

	}

}
