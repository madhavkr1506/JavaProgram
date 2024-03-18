// time complexity : n^2

public class RodCutting {
    public static void main(String[] args) {
        int[] price = {1,5,8,9,10,17,17,20};
        int n = 8;
        int[] dp = new int[n + 1];
        dp[0] = 0;

        for(int i=1;i<=n;i++){
            int max_val = Integer.MIN_VALUE;
            for(int j=0;j<i;j++){
                max_val = Math.max(price[j] + dp[i - j - 1],max_val);
                
            }
            dp[i] = max_val;
        }

        System.out.println(dp[n]);
    }
}
