package MyProject;
import java.util.Scanner;
public class SimpleInterestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please enter Principal");
		
		int principal = sc.nextInt();
				
		System.out.println("Enter the Interest Rate");

		int InterestRate = sc.nextInt();
		
		System.out.println("Enter the Time period");
	
		int TimePeriod = sc.nextInt(); 
	
	
		long Ans = principal*InterestRate*TimePeriod/100;
		
		System.out.println("Your final interest will be "+Ans );
	
	}

}
