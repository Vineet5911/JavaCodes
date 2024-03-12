package MyProject;

import java.util.Random;
import java.util.Scanner;

public class stonePaperScissor {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Your turn");
		System.out.println("enter 0 for stone");
		System.out.println("enter 1 for paper");
		System.out.println("enter 2 for scissor");
		
		int turn1 = sc.nextInt();
		switch (turn1) {
		case 0:
			System.out.println("stone");
		break;
		case 1:
			System.out.println("paper");
        break;
		case 2:
			System.out.println("scissor");
		break;	
		}
		
		
		
		Random random = new Random();
		
		System.out.println("PC turn");
		
		int turn = random.nextInt(3);
		switch (turn) {
		case 0:
			System.out.println("stone");
		break;
		case 1:
			System.out.println("paper");
        break;
		case 2:
			System.out.println("scissor");
		break;	
		}
	
		
		
		if (turn == 0 && turn1 == 2) {
			System.out.println("you lost");	
		}
		
		else if (turn > turn1) {
			System.out.println("you lose");
		}

		else if (turn == turn1) {
			System.out.println("It's a draw.");
		}else {
		    System.out.println("you win");
		}
		
       
	}

}