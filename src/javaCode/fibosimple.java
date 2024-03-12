package javaCode;
import java.util.Scanner;

public class fibosimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while(count <= n) {
            int temp = a;
            a = a + b;
            b = temp;
            count++;
        }
                System.out.println(b);
    }
}
