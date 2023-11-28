import javax.swing.text.StyleContext;
import java.util.Scanner;


public class MinHeapSort {
    static void printArray(int[] array, int num){
        for(int i=0;i<num;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void heapify(int[] array, int num,int i){
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if(left < num && array[left] < array[smallest]){
            smallest=left;
        }
        if(right < num && array[right] < array[smallest]){
            smallest=right;
        }
        if(smallest != i){
            int temp = array[i];
            array[i]=array[smallest];
            array[smallest]=temp;
            heapify(array,num,smallest);
        }
    }
    
    static void minHeap(int[] array, int num){
        for(int i=(num - 2)/2;i>=0;i--){
            heapify(array,num,i);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of inputs = ");
        int num=scanner.nextInt();
        int[] array=new int[num];
        for(int i=0;i<num;i++){
            array[i] = scanner.nextInt();
        }
        minHeap(array,num);
        printArray(array,num);
    }

}
