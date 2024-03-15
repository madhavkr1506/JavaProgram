// this is brute full approach

public class PrintSubArray {
    public static void subarray(int[] array, int num){
        for(int i=0;i<num;i++){
            for(int j=i;j<num;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(array[k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int n = array.length;
        subarray(array, n);
    }
}


