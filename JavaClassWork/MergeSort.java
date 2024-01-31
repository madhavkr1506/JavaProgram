// import java.util.Scanner;

public class MergeSort{
    public static void printarray(int[] array){
        int n = array.length;
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void merge(int[] array,int low,int mid,int high){
        int i=low;
        int j=mid+1;
        int k=low;
        int[] array2 = new int[100];
        while(i<=mid && j<=high){
            if(array[i] <= array[j]){
                array2[k] = array[i];
                k++;
                i++;
            }
            else{
                array2[k] = array[j];
                k++;
                j++;
            }
        }
        while(i<=mid){
            array2[k] = array[i];
            k++;
            i++;
        }
        while(j<=high){
            array2[k] = array[j];
            k++;
            j++;
        }
        for(int p=low;p<=high;p++){
            array[p] = array2[p];
        }
    }
    public static void mergeSort(int[] array,int low,int high){
        if(low<high){
            int mid = (low + high)/2;
            mergeSort(array, low, mid);
            mergeSort(array, mid+1, high);
            merge(array, low, mid, high);
        }
    }
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        int[] array = {11,15,14,19,18,16,12,9,6,8};
        int n = array.length;
        printarray(array);
        System.out.println();
        mergeSort(array, 0, n-1);
        printarray(array);


    }
}