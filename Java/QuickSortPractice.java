public class QuickSortPractice {
    public static void printarray(int[] array,int n){
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static int quickUtil(int[] array, int low, int high){
        int pivot = array[high];
        int i = low - 1;
        for(int j=low;j<=high-1;j++){
            if(array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        return (i+1);
    }

    public static void quick(int[] array, int low, int high){
        if(low < high){
            int partition = quickUtil(array, low, high);
            printarray(array, array.length);
            quick(array, low, partition - 1);
            quick(array, partition + 1, high);
        }
    }


    
    public static void main(String[] args) {
        int[] array = {17,15,16,19,18};
        int n = array.length;
        System.out.println("array before sorting");
        printarray(array, n);
        System.out.println("array after sorting");
        quick(array, 0, n-1);
        printarray(array, n);


    }
}
