package StackImplementation;

import java.util.Scanner;

public class Stack1 {
    static class Node{
        int size;
        int top;
        int[] array;
        public Node(int size){
            this.size=size;
            this.top=-1;
            this.array=new int[size];
        }
    }
    public static int IsFull(Node ptr){
        if(ptr.top == ptr.size-1){
            return 1;
        }
        else {
            return 0;
        }
    }
    public static int IsEmpty(Node ptr){
        if(ptr.top == -1){
            return 1;
        }
        else {
            return 0;
        }
    }
    public static void push(Node ptr,int data){
        if(IsFull(ptr) == 1){
            System.out.println("Stack is running out of space.");
        }
        else{
            ptr.top++;
            ptr.array[ptr.top] = data;
            System.out.println("Pushing element in the stack " + data);
        }
    }
    public static int pop(Node ptr){
        if(IsEmpty(ptr) == 1){
            System.out.println("There is no element present in the stack.");
            return -1;
        }
        else{
            int val = ptr.array[ptr.top];
            ptr.top--;
            System.out.println("Popping element from stack " + val);
            return val;
        }
    }

    public static int stackTop(Node ptr){
        return ptr.array[ptr.top];
    }
    public static int stackBottom(Node ptr){
        return ptr.array[0];
    }

    public static int peekUtil(Node ptr,int i){
        if((ptr.top-i+1) < 0){
            return -1;
        }
        else{
            return ptr.array[ptr.top-i+1];
        }
    }

    public static void peek(Node ptr){
        for(int i=1;i<=ptr.top+1;i++){
            System.out.print(peekUtil(ptr,i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        Node stack=new Node(size);
        for(int i=0;i<size;i++){
            int data = scanner.nextInt();
            push(stack,data);
        }
//        System.out.println("Top element in the stack is "+stackTop(stack));
//        pop(stack);

        peek(stack);
    }
}
