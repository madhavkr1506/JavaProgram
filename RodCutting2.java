public class RodCutting2 {
    public static void main(String[] args) {
        int[] price = {1,5,8,9,10,17,17,20};
        int[] array1 = {1,2,3,4,5,6,7,8};
        int n = 8;

        int[][] dp = new int[price.length + 1][n + 1];
        
        for(int i=1;i<=array1.length;i++){
            for(int j=1;j<=n;j++){
                if(array1[i - 1] <= j){
                    dp[i][j] = Math.max(price[i-1]+dp[i - 1][j - array1[i - 1]],dp[i - 1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[array1.length][n]);
    }
}
