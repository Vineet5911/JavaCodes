package DSA;

public class tailrecursion {
    public static void main(String[] args) {
        int n = 110;
        int initialA = 0;
        int initialB = 1;
        int result = nthFibonacci(n, initialA, initialB);
        System.out.println("Fibonacci number at position " + n + ": " + result);
    }

    static int nthFibonacci(int n, int a, int b) {
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }
        return nthFibonacci(n - 1, b, a + b);
    }
}
