public class Practice20 {
    public static void main(String[] args) {
        int[] weights = {2, 4, 6};  
        int[] values = {40, 50, 60};  
        int n = weights.length;
        int W = 8;  

        int[][] dp = new int[n + 1][W + 1];
        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= W; w++) {
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        System.out.println("Dynamic Programming Table:");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                System.out.printf("%4d", dp[i][j]);
            }
            System.out.println();
        }

        System.out.println("Maximum value that can be put in knapsack: " + dp[n][W]);
    }
}