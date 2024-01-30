public class BubbleSort {
    public static int[] function1(int[] array){
        int n = array.length;
        for(int i =0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {11,15,14,16,18,17,19,9,4,6};
        // int n = array.length;
        function1(array);
        for(int element : array){
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
