package DSA.DPAndRecurrsion;

//This one has been done using DP
public class LongestCommonSubsequenceByDP {
    public static void main(String[] args) {
        String a = "2343245643434";
        String b = "4231235664544";
        int m = 13;
        int n = 13;

        int dp [][] = new int[m+1][n+1];
        for(int i = 0; i <= m; i++){
            for(int j = 0; j <=n; j++){
                dp[i][j] = -1;
            }
        }

        System.out.println(LCS(m,n,a,b,dp));

    }
    static int LCS(int m, int n, String a, String b,int dp[][]){
        if(m == 0 || n ==0) return 0;
            if(dp[m][n] != -1){
                return dp[m][n];
            }


        if(a.charAt(m-1) == b.charAt(n-1)){
            return dp[m][n] = 1+ LCS(m-1, n-1, a, b,dp);
        }else{
            return dp[m][n] = Math.max(LCS(m, n-1, a, b,dp),
                            LCS(m-1, n, a,b,dp));
        }
    }
}