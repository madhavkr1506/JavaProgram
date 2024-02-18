// print sub-array of an array : 

public class SubArray {
    public static void printsubarray(int[] array,int n){
        for(int i=0;i<=n;i++){
            for(int j=i;j<=n;j++){
                for(int k=i;k<j;k++){
                    System.out.print(array[k] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int n = array.length;

        printsubarray(array, n);
    }
}
