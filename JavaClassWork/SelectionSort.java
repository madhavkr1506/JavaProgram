public class SelectionSort {
    public static int[] function1(int[] array){
        int n = array.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {11,15,14,16,18,17,19,9,4,6};
        function1(array);
        for(int element : array){
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
