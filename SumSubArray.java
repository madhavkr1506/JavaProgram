// it has time complexity of n^3

public class SumSubArray {
    public static void subarraysum(int[] array, int num){
        int sumsub = Integer.MIN_VALUE;
        for(int i=0;i<num;i++){
            for(int j=i;j<num;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=array[k];
                    if(sumsub < sum){
                        sumsub = sum;
                    }
                }
            }
        }
        System.out.println(sumsub);
    }
    public static void main(String[] args) {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        int n = array.length;
        subarraysum(array, n);
    }
}
