package collectionFramework;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		

		Stack<String> animals = new Stack<>();
		
		
		animals.push("Lion");
		animals.push("tiger");
		animals.push("cat");
		animals.push("dog");
		animals.push("cow");
		animals.push("horse");
		
        System.out.println(animals);
        
        System.out.println(animals.peek());
        
        animals.pop();
        
        System.out.println(animals);
        
        System.out.println(animals.peek());
		
	}

}
