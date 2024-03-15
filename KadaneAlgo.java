
// it has time complity of n

public class KadaneAlgo {

    public static int kadane(int[] array, int num){
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<num;i++){
            sum += array[i];
            if(sum < 0){
                sum = 0;
            }
            if(maxi < sum){
                maxi = sum;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        int n = array.length;
        System.out.println(kadane(array, n));
    }
}
