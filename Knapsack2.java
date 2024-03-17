// It has time complexity of n * w

public class Knapsack2 {

    public static int max(int a,int b){
        return (a > b) ? a : b;
    }
    public static int knapsackutil(int w, int wt[], int pro[],int n, int arr[][]){
        if(w == 0 || n == 0){
            return 0 ;
        }
        if(arr[n][w] != -1){
            return arr[n][w];
        }
        if(wt[n - 1] > w){
            return arr[n][w] = knapsackutil(w, wt, pro, n - 1,arr);
        }
        else{
            int include = pro[n - 1] + knapsackutil(w - wt[n - 1], wt, pro, n - 1,arr);
            int exclude = knapsackutil(w, wt, pro, n - 1,arr);
            return arr[n][w] = max(include,exclude);
        }

    }
    public static int knapsack(int w, int wt[],int pro[],int n){
        int arr[][] = new int[n + 1][w + 1];
        for(int i=0;i<n + 1;i++){
            for(int j = 0;j<w + 1;j++){
                arr[i][j] = -1;
            }
        }
        return knapsackutil(w, wt, pro, n,arr);
    }
    public static void main(String[] args) {
        int profit[] = new int[] { 60, 100, 120 }; 
        int weight[] = new int[] { 10, 20, 30 }; 
        int W = 50; 
        int n = profit.length;
        System.out.println(knapsack(W, weight, profit, n));
    }
}
