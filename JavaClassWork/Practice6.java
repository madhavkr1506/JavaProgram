// write a merge sort program : 



public class Practice6 {

    public static void printArray(int[] array,int n){
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void merge(int[] array,int mid,int low,int high){
        int i = low;
        int j = mid + 1;
        int k = low;
        int[] temp = new int[array.length];
        while(i<=mid && j<=high){
            if(array[i]<=array[j]){
                temp[k] = array[i];
                k++;
                i++;
            }
            else{
                temp[k] = array[j];
                k++;
                j++;
            }
        }
        while(i<=mid){
            temp[k] = array[i];
            k++;
            i++;
        }
        while(j<=high){
            temp[k] = array[j];
            k++;
            j++;
        }
        for(int p=low;p<=high;p++){
            array[p] = temp[p];
        }
    }
    public static void mergesort(int[] array,int low,int high){
        if(low < high){
            int mid = (low + high) / 2;
            mergesort(array, low, mid);
            mergesort(array, mid + 1, high);
            merge(array, mid, low, high);
            printArray(array, array.length);
        }
    }
    public static void main(String[] args) {
        int[] array = { 6, 5, 12, 10, 9, 1 };
        mergesort(array, 0, array.length - 1);
        printArray(array, array.length);

    }
}
