// It has time complexity of n^2

public class SumSubArray2 {

    public static void subArraySum(int[] array, int num){
        int sumsub = Integer.MIN_VALUE;
        for(int i=0;i<num;i++){
            int sum = 0;
            for(int j=i;j<num;j++){
                sum+=array[j];
                if(sumsub < sum){
                    sumsub = sum;
                }
            }
        }
        System.out.println(sumsub);
    }
    public static void main(String[] args) {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        int n = array.length;
        subArraySum(array, n);
    }
}
