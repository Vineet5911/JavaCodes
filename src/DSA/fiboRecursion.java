package DSA;

public class fiboRecursion {
    public static void main(String[] args) {
        System.out.println(fibo(70));
    }
    public static int fibo(int n){
        if(n < 2) {
            return n;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }
}