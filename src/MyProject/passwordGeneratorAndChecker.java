package MyProject;

import java.util.Scanner;

public class passwordGeneratorAndChecker {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please create a password of atleast 6 digit.");
		
		int pass = sc.nextInt();
		if (pass > 99999) {
			System.out.println("password created successfully");
		}else {
			System.out.println("please enter password of atleast 6 digits");
			System.exit(0);
		}
		
		System.out.println("please re-enter your password.");
		
		int password = sc.nextInt();
		
	    if (pass == password) {
	    	System.out.println("Access granted");
	    }else {
	    	System.out.println("Access denied");
	    }
        
	   
	    
	}

}
