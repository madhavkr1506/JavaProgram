public class Subarray2 {

    public static void printsubarray(int[] array,int n,int start, int end){
        if(n == end){
            return;
        }
        if(start > end){
            printsubarray(array, n, 0, end + 1);
        }
        else{
            for(int i=start;i<end;i++){
                System.out.print(array[i] + " ");
            }
            System.out.println(array[end]);
            printsubarray(array, n, start + 1, end);
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int n = array.length;
        printsubarray(array, n, 0, 0);
    }
}
