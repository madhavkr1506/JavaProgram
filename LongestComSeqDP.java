
// It has time complexity of (m * n)
public class LongestComSeqDP {
    public static int Longestcommonsubseq(String str1,String str2,int m,int n){
        String temp1 = str1;
        String temp2 = str2;
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
                else if(temp1.charAt(i - 1) == temp2.charAt(j - 1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }

            }
        }
        return dp[m][n];
        
    }
    public static void main(String[] args) {
        String str1 = "Madhav";
        String str2 = "adha";

        int m = str1.length();
        int n = str2.length();

        System.out.println(Longestcommonsubseq(str1,str2,m,n));

    }
}
