package mergeSort;

import java.util.Scanner;

public class MergeSort {
    public static void printArray(int[] array,int num){
        for(int i=0;i<num;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void MergeSortUtil(int[] array1,int mid,int low,int high){
        int i=low;
        int j=mid+1;
        int k=low;
        int[] array2 = new int[array1.length];
        while(i<=mid && j<=high){
            if(array1[i] < array1[j]){
                array2[k]=array1[i];
                i++;
                k++;
            }
            else{
                array2[k]=array1[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            array2[k]=array1[i];
            i++;
            k++;
        }
        while(j<=high){
            array2[k]=array1[j];
            j++;
            k++;
        }
        for(int p=low;p<=high;p++){
            array1[p]=array2[p];
        }
    }
    public static void mergeSort(int array[],int low,int high){
        if(low<high){
            int mid = (low + high)/2;
            mergeSort(array, low, mid);
            mergeSort(array, mid+1, high);
            MergeSortUtil(array,mid,low,high);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of inputs = ");
        int num=scanner.nextInt();
        int[] array=new int[num];
        for(int i=0;i<num;i++){
            array[i]=scanner.nextInt();
        }
        System.out.println("Array before sorting : ");
        printArray(array,num);
        mergeSort(array,0,num-1);
        System.out.println("Array after sorting : ");
        printArray(array,num);
    }
}
