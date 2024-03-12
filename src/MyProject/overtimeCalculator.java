package MyProject;

import java.util.Scanner;

public class overtimeCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter working hours.");
		int oTHours = sc.nextInt();
		
		System.out.println("please select the department.");
		System.out.println("Enter 1 for HR Department.");
		System.out.println("Enter 2 for Labour Department.");
		System.out.println("Enter 3 for Tech Department.");
		System.out.println("Enter 4 for Electrical Department.");
		System.out.println("Enter 5 for Management Department.");
		
		int Department = sc.nextInt();
		
		switch (Department) {
		case 1:
			System.out.println(1200 * oTHours + "is the wages of your overtime as you have worked for " + oTHours +" hours.");
		break;
		case 2:
			System.out.println(500 * oTHours + "is the wages of your overtime as you have worked for " + oTHours +" hours.");
		break;
		case 3:
			System.out.println(1000 * oTHours + "is the wages of your overtime as you have worked for " + oTHours +" hours.");
		break;
		case 4:
			System.out.println(800 * oTHours + "is the wages of your overtime as you have worked for " + oTHours +" hours.");
		break;
		case 5:
			System.out.println(1100 * oTHours + "is the wages of your overtime as you have worked for " + oTHours +" hours.");
		break;
		default:
			System.out.println("please enter correct department.");
		}
				
		
	}

}
