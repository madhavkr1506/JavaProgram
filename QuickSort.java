import java.util.Scanner;


public class QuickSort {

    static void printArray(int[] arr,int n){
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int partition(int[] array, int low, int high){
        int pivot=array[low];
        int i=low+1;
        int j=high;
        int temp;
        do{
            while(array[i] <= pivot){
                i++;
            }
            while(array[j] > pivot){
                j--;
            }
            if(i<j){
                temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }while(i<j);
        temp=array[low];
        array[low]=array[j];
        array[j]=temp;
        return j;
    }

    static void mergeSort(int[] array,int low,int high){
        int position;
        if(low<high){
            position=partition(array,low,high);
            mergeSort(array,low,position-1);
            mergeSort(array,position+1,high);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of inputs = ");
        int num=scanner.nextInt();
        int[] array=new int[num];
        for(int i=0;i<num;i++){
            array[i]=scanner.nextInt();
        }
        printArray(array,num);
        mergeSort(array,0,num-1);
        printArray(array,num);
    }
}
