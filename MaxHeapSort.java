import java.util.Scanner;

public class MaxHeapSort {
    static void printArray(int[] array,int num){
        for(int i=0;i<num;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void heapify(int[] array, int num, int i){
        int largest = i;
        int low = 2 * i + 1;
        int high = 2 * i + 2;
        if(low < num && array[low] > array[largest]){
            largest = low;
        }
        if(high < num && array[high] > array[largest]){
            largest = high;
        }
        if(largest != i){
            int temp = array[i];
            array[i]=array[largest];
            array[largest]=temp;
            heapify(array,num,largest);
        }
    }

    static void maxHeap(int[] array,int num){
        for(int i=(num - 2)/2;i>=0;i--){
            heapify(array,num,i);
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
        maxHeap(array,num);
        printArray(array,num);
    }
}
