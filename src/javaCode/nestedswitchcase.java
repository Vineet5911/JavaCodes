package javaCode;

import java.util.Scanner;

public class nestedswitchcase {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your grade below");
        String grade = sc.next();

        switch (grade) {
            case "A":
                System.out.println("good");
                break;
            case "B":
                System.out.println("keep it up");
                break;
            case "C":
                System.out.println("do hardwork");
            case "D":
                System.out.println("Just passed");
                break;
            default:
                System.out.println("you are failed");
        }
    }
}
