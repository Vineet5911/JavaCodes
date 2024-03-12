package javaCode;
import java.util.Scanner;
public class ComparisonOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		
		
		//Case 1 (==)
		boolean x = a==b;
		System.out.println(x);
		
		//Case 2 (!=)
		boolean y = a!=b;
		System.out.println(y);
		
		//Case 3 (>)
		boolean z = a>b;
		System.out.println(z);
		
		//Case 4 (<);
		boolean m = a<b;
		System.out.println(m);
		
		//Case 5 (>=)
		boolean l = a>=b;
		System.out.println(l);
		
		//Case 6 (<=)
		boolean w = a<=b;
		System.out.println(w);
		
		
		
	}

}
