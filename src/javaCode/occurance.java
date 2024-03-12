package javaCode;
import java.util.Scanner;
public class occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("Enter target");
        int d = sc.nextInt();
        int count = 0;

        while(num > 0) {
           int rem = num % 10;
           if(rem == d){
               count++;
           }
            num = num / 10;
        }
        System.out.println(count);
    }
}
