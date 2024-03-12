package MyProject;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please enter first number");
		int numone = sc.nextInt();
		
		System.out.println("please enter second number");
		int numtwo = sc.nextInt();
		
		System.out.println("Please enter the operation");
		String operation = sc.next();
		

		
		switch (operation) {
			case "+":
				System.out.println(numone+numtwo);
				break;
			case "-":
				System.out.println(numone-numtwo);
				break;
			case "*":
			    System.out.println(numone*numtwo);
			    break;
			case "/":
				System.out.println(numone/numtwo);
				break;
			case "%":
				System.out.println(numone%numtwo);
				break;
			default :
				System.out.println("An unexpected error has occured Please check your input again");
		}
		
	
		
	}

}
