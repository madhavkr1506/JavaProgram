import java.util.Scanner;
import java.util.Arrays;

class Node2{
    int size;
    int top;
    int beg;
    int[] array;

    Node2(int size){
        this.size=size;
        this.top=-1;
        this.beg=-1;
        this.array=new int[size];
    }
}
public class Queue {
    static int queueTop(Node2 ptr){
        return ptr.array[0];
    }
    static int queueBottom(Node2 ptr){
        return ptr.array[ptr.top];
    }
    static int isEmpty(Node2 ptr){
        return ptr.top == ptr.beg ? 1 : 0;
    }
    static int isFull(Node2 ptr){
        return ptr.top == ptr.size - 1 ? 1 : 0;
    }
    static void enqueue(Node2 ptr, int value){
        if(isFull(ptr) == 1){
            System.out.println("Queue is already full");
        }
        else{
            ptr.top++;
            ptr.array[ptr.top]=value;
            System.out.println("Enqueue element " + value);
        }
    }
    static int dequeue(Node2 ptr){
        int val = -1;
        if(isEmpty(ptr) == 1){
            System.out.println("Queue is already empty");
        }
        else{
            ptr.beg++;
            val=ptr.array[ptr.beg];
            System.out.println("Popping element " + val);
        }
        return val;
    }

    static int peek(Node2 ptr, int i) {
        int index = ptr.top - i;
        return (index >= 0 && index < ptr.size) ? ptr.array[index] : -1;
    }

    static void bubbleSort(Node2 ptr){
        Arrays.sort(ptr.array);
//        int n=ptr.top + 1;
//        for(int i=0;i<n-1;i++){
//            for(int j=0;j<n-i-1;j++){
//                if(ptr.array[j] > ptr.array[j+1]){
//                    int temp=ptr.array[j];
//                    ptr.array[j]=ptr.array[j + 1];
//                    ptr.array[j + 1]=temp;
//                }
//            }
//        }
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int size=scanner.nextInt();
        Node2 queue = new Node2(size);
        System.out.print("Enter the number of elements you want to enter = ");
        int num=scanner.nextInt();
        for(int i=0;i<num;i++){
            System.out.print("Enqueue " + (i + 1) + " element : ");
            int data = scanner.nextInt();
            enqueue(queue,data);
        }

        bubbleSort(queue);

        for(int j = 0; j <= queue.top; j++){
            System.out.print(peek(queue,j) + " ");
        }

    }

}