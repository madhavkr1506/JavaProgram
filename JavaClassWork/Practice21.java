public class Practice21 {
    public static void main(String[] args) {
        int[] array1 = {2,4,6};
        int[] array2 = {40,50,60};
        int n = array2.length;
        int W = 8;

        int[][] dp = new int[n + 1][W + 1];
        for(int i=1;i<=n;i++){
            for(int w=1;w<=W;w++){
                if(array1[i-1]<=w){
                    dp[i][w] = Math.max(array2[i-1]+dp[i-1][w-array1[i-1]],dp[i-1][w]);
                }
                else{
                    dp[i][w] = dp[i-1][w];
                }
            }
        }

        for(int i=0;i<n+1;i++){
            for(int j=0;j<W+1;j++){
                System.out.printf("%4d",dp[i][j]);
            }
            System.out.println();
        }



        System.out.println("Maximum benifit a packet can store : " + dp[n][W]);
    }
}
