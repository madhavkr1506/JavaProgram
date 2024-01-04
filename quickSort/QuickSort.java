package quickSort;

import java.util.Scanner;

public class QuickSort {
    public static void PrintArray(int[] array,int num){
        for(int i=0;i<num;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static int quickSortUtil(int[] array,int low,int high){
        int pivot = array[low];
        int i = low + 1;
        int j = high;
        int temp;
        do{
            while(array[i] <= pivot){
                i++;
            }
            while (array[j] > pivot){
                j--;
            }
            if(i < j){
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }while (i<j);
        temp = array[low];
        array[low] = array[j];
        array[j] = temp;
        return j;
    }
    public static void quickSort(int[] array,int low,int high){
        int position;
        if(low < high){
            position = quickSortUtil(array, low, high);
            System.out.print("Array position " + array[position] + " : ");
            PrintArray(array, array.length);
            quickSort(array,low,position-1);
            quickSort(array, position+1, high);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = new int[num];
        for(int i=0;i<num;i++){
            array[i]=scanner.nextInt();
        }
        System.out.println("Array before sorting : ");
        PrintArray(array,num);
        System.out.println();
        quickSort(array,0,num-1);
        System.out.println("Array after sorting : ");
        PrintArray(array,num);
    }
}
