package QueueImplementation;

import java.util.Scanner;

public class Queue1 {
    static class Node{
        int size;
        int front;
        int rear;
        int[] array;
        public Node(int size){
            this.size=size;
            this.front=-1;
            this.rear=-1;
            this.array=new int[size];
        }
    }
    public static int queueTop(Node ptr){
        return ptr.array[0];
    }
    public static int queueBottom(Node ptr){
        return ptr.array[ptr.rear];
    }
    public static boolean IsFull(Node ptr){
        if(ptr.rear == ptr.size - 1){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean IsEmpty(Node ptr){
        if(ptr.rear == ptr.front){
            return true;
        }
        else {
            return false;
        }
    }
    public static void enqueue(Node ptr,int data){
        if(IsFull(ptr)){
            System.out.println("Queue is running out of space.");
        }
        else{
            ptr.rear++;
            ptr.array[ptr.rear]=data;
            System.out.println("Enqueuing element in the queue is " + data);
        }
    }
    public static int dequeue(Node ptr){
        if(IsEmpty(ptr)){
            System.out.println("There is no element present in the queue.");
            return -1;
        }
        else{
            ptr.front++;
            int val=ptr.array[ptr.front];
            System.out.println("Dequeuing element from queue " + val);
            return val;
        }
    }

    public static int peekUtil(Node ptr,int i){
        int index = ptr.front+i;
        return (index >= 0 && index < ptr.size) ? ptr.array[index] : -1;
    }
    public static void peek(Node ptr){
        for(int i=1;i<=ptr.rear+1;i++){
            System.out.print(peekUtil(ptr,i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Node queue = new Node(size);
        for(int i=0;i<size;i++){
            int data = scanner.nextInt();
            enqueue(queue,data);
        }
//        System.out.println("Dequeuing element from the queue : ");
//        while (!IsEmpty(queue)) {
//            dequeue(queue);
//        }
//        queue.front++;
        peek(queue);
    }
}
