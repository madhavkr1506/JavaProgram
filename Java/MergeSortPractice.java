import java.util.Scanner;

public class MergeSortPractice {
    public static void printarray(int[] array, int n){
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void mergeUtil(int[] array,int low,int mid,int high){
        int i=low;
        int j=mid+1;
        int k=low;
        int[] temp = new int[array.length];
        while(i<=mid && j<=high){
            if(array[i] < array[j]){
                temp[k] = array[i];
                k++;
                i++;
            }else{
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
        while (j<=high) {
            temp[k] = array[j];
            k++;
            j++;
        }

        for(int p = low; p <= high; p++){
            array[p] = temp[p];
        }
    }

    public static void merge(int[] array,int low,int high){
        if(low<high){
            int mid = (low + high) / 2;
            merge(array, low, mid);
            merge(array, mid + 1, high);
            printarray(array, array.length);
            mergeUtil(array, low, mid, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {17,15,16,19,18};
        int n = array.length;
        System.out.println("array before sorting");
        printarray(array, n);
        System.out.println("array after sorting");
        merge(array, 0, n-1);
        // printarray(array, n);

        sc.close();
    }
}
