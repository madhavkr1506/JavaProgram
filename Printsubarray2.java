public class Printsubarray2 {
    public static void subarray(int[] array, int n,int start, int end){
        if(n == end){
            return;
        }
        if(start > end){
            subarray(array, n, 0, end + 1);
        }
        else{
            for(int i=start;i<end;i++){
                System.out.print(array[i] + " ");
            }
            System.out.println(array[end]);
            subarray(array, n, start + 1, end);
        }
    }
    public static void main(String[] args) {
        int[] array = {11,12,13,14,15};
        int n = array.length;
        subarray(array, n,0,0);
    }    
}
