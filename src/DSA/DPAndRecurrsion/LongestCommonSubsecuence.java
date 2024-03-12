package DSA.DPAndRecurrsion;

// This is done using recurrsion
public class LongestCommonSubsecuence {
    public static void main(String[] args) {
        String a = "23432";
        String b = "42312";
        int m = 5;
        int n = 5;

        System.out.println(LCS(m,n,a,b));

    }
    static int LCS(int m, int n, String a, String b){
        if(m == 0 || n ==0){
            return 0;
        }
        if(a.charAt(m-1) == b.charAt(n-1)){
            return 1+ LCS(m-1, n-1, a, b);
        }else{
            return
                    Math.max(LCS(m, n-1, a, b),
                            LCS(m-1, n, a,b));
        }

    }
}
