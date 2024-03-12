package MyProject;
import java.util.Scanner;
import java.util.Random;
public class atmByVineet {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter your account number below.");
		int Num = sc.nextInt();
		if (Num < 99999999 && Num >= 00000001) {
		}else {
	       System.out.println("Wrong account number");
	       System.exit(0);
		}
		System.out.println("please enter your pin.");
		int pin = sc.nextInt();
		if (pin < 999 && pin > 9999){
		System.out.println("Invalid Pin");
		System.exit(0);
		}else {
			System.out.println("Welcome");
		}
		System.out.println("Press 1 to check your balance.");
		int a = sc.nextInt();
		int b = random.nextInt(1098664);
		switch (a) {
		case 1:
			System.out.println("Your balance is "+b);
			break;
			default:
				System.out.println("Please enter appropriate value.");
				System.exit(0);
		}
		System.out.println("Press 2 to withdraw the money.");
		int n = sc.nextInt();
		if (n == 2) {
			System.out.println("Enter the amount you want to withdraw.");
		}else {
			System.out.println("Please enter the amount.");
		}
		int k = sc.nextInt();
		if (k > b) {
			System.out.println("Insufficient balance");
			System.exit(0);
		}
		System.out.println("now enter Ok.");
		String c = sc.next();
		
		switch (c) {
		case "Ok":
			System.out.println("Please collect your cash.");
			System.out.println("The current balance of your account is " + (b-k));
		    System.out.println("Thank you for banking with us :) .");
		    break;
		case "ok":
			 System.out.println("Please collect your cash.");
			 System.out.println("The current balance of your account is " + (b-k));
			 System.out.println("Thank you for banking with us :) .");
			 break;
		case "OK":
			System.out.println("Please collect your cash.");
			System.out.println("The current balance of your account is " + (b-k));
		    System.out.println("Thank you for banking with us :) .");
		    break;	 
		    default:
		    System.out.println("Sorry for your inconvinience :( .");	
		}
		}
	}