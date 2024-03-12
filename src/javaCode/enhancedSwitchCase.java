package javaCode;
import java.util.Scanner;

import java.util.Scanner;

public class enhancedSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day");
        int day = sc.nextInt();

        switch (day){
            case 1,2,3,4,5 -> System.out.println("weekday");
            case 6,7 -> System.out.println("weekend");
            default -> System.out.println("There is only 7 days in a week");
        }
    }
}
