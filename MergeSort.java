import java.util.Scanner;

public class MergeSort {
    static void printArray(int[] array,int num){
        for(int i=0;i<num;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void merge(int[] array,int mid, int low, int high){
        int i=low;
        int j=mid+1;
        int k=low;
        int[] array2=new int[100];
        while(i<=mid && j<=high){
            if(array[i]<array[j]){
                array2[k]=array[i];
                i++;
                k++;
            }
            else{
                array2[k]=array[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            array2[k]=array[i];
            i++;
            k++;
        }
        while(j<=high){
            array2[k]=array[j];
            k++;
            j++;
        }
        for(int p=low;p<=high;p++){
            array[p]=array2[p];
        }
    }

    static void mergesort(int[] array,int low,int high){
        int mid;
        if(low<high){
            mid=(low + high)/2;
            mergesort(array,low,mid);
            mergesort(array,mid+1,high);
            merge(array,mid,low,high);
        }
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of inputs = ");
        int num=scanner.nextInt();
        int[] array=new int[num];
        for(int i=0;i<num;i++){
            array[i]=scanner.nextInt();
        }
        printArray(array,num);
        mergesort(array,0,num-1);
        printArray(array,num);
    }

}
