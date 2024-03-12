package MyProject;

import java.util.Scanner;

public class moneyConverter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the amount");
		float amount = sc.nextInt();
		
		System.out.println("Enter the Currency");
		String currency = sc.next();
		
		switch (currency) {
		
		case "Dollar":
			System.out.println(amount * 79.5 + " Indian Rupees");
			break ;
		case "dollar":
			System.out.println(amount * 79.5 + " Indian Rupees");
			break;
		case "DOLLAR":
			System.out.println(amount * 79.5 + " Indian Rupees");
			break;
		case "pond":
		    System.out.println(amount * 96.06 + " Indian Rupees");
		    break;
		case "Pond":
		    System.out.println(amount * 96.06 + " Indian Rupees");
		    break;
		case "euro":
			System.out.println(amount * 81.21 + " Indian Rupees");
			break;
		case "Euro":
			System.out.println(amount * 81.21 + " Indian Rupees");
			break;	
		    default :
		    	System.out.println("Please enter appropriate Currency");
		}

	}

}
