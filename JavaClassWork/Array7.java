// write a program to print all subarray of a given array : 

public class Array7 {
    public static void function1(int[] array,int n){
        for (int i = 0; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                for (int k = i; k < j; k++) {
                    System.out.print(array[k]+" ");
                }
                System.out.println();
            }
        }
    }

    public static void function2(int[] array,int n,int start,int end){
        if(end == n){
            return;
        }
        else if(start > end){
            function2(array, n, 0, end+1);
        }
        else{
            for(int i=start;i<end;i++){
                System.out.print(array[i]+" ");
            }
            System.out.println(array[end]);
            function2(array, n, start+1, end);
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int n = array.length;
        // function1(array, n);
        function2(array, n, 0, 0);
    }
}
