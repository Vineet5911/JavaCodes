package javaCode;
import java.util.Scanner;
public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Please enter your age");
		int a = sc.nextInt();
		
		if (a >= 18) {
		System.out.println("you can vote");
		}else {
			System.out.println("You Can't Vote");
		}
	}

}
