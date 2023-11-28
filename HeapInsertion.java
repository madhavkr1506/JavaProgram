import java.util.Scanner;

public class HeapInsertion {

    static void printArray(int[] array, int num){
        for(int i=0;i<num;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void heapify(int[] array,int num,int i){
        int parent = (i - 1)/2;
        if(parent >= 0){
            if(array[i] > array[parent]){
                int temp = array[i];
                array[i] = array[parent];
                array[parent] = temp;
                heapify(array,num,parent);
            }
        }
    }

    static int insertNode(int[] array,int num, int value){
        num=num+1;
        array[num-1]=value;
        heapify(array,num,num-1);
        return num;
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of inputs = ");
        int num=scanner.nextInt();
        int[] array=new int[num];
        int point=0;
        for(int i=0;i<num;i++){
            int data=scanner.nextInt();
            point=insertNode(array,point,data);
//            point++;
        }
        printArray(array,point);


    }
}
