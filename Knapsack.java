// time complexity is 2^n

public class Knapsack{

    public static int max(int a,int b){
        return (a > b) ? a : b;
    }
    public static int Knapsackalgo(int w, int wt[], int val[],int n){
        if(w == 0 || n == 0){
            return 0;
        }
        if(wt[n - 1] > w){
            return Knapsackalgo(w,wt,val,n - 1);
        }
        else{
            int inculde = val[n - 1] + Knapsackalgo(w - wt[n - 1], wt, val, n - 1);
            int exclude = Knapsackalgo(w,wt,val,n - 1);
            return max(inculde,exclude);
        }
    }
    public static void main(String[] args) {
        int profit[] = new int[] { 60, 100, 120 }; 
        int weight[] = new int[] { 10, 20, 30 }; 
        int W = 50; 
        int n = profit.length;

        System.out.println(Knapsackalgo(W,weight,profit,n));
    }
}