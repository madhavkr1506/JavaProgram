import java.util.Scanner;

class Node{
    int size;
    int top;
    int[] array;

    Node(int size){
        this.size=size;
        this.top=-1;
        this.array=new int[size];
    }
}
public class Stack{
    static int stackTop(Node ptr){
        return ptr.array[ptr.top];
    }
    static int stackBottom(Node ptr){
        return ptr.array[0];
    }
    static int isEmpty(Node ptr){
        return ptr.top == -1 ? 1:0;
    }
    static int isFull(Node ptr){
        return ptr.top == ptr.size - 1 ? 1 : 0;
    }
    static void push(Node ptr, int value){
        if(isFull(ptr) == 1){
            System.out.println("Stack is full");
        }
        else{
            ptr.top++;
            ptr.array[ptr.top]=value;
            System.out.println("Pushing element " + value);
        }
    }
    static int pop(Node ptr){
        if(isEmpty(ptr) == 1){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            int value=ptr.array[ptr.top];
            ptr.top--;
            System.out.println("Popping element " + value);
            return value;
        }
    }


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of stack = ");
        int size=scanner.nextInt();
        Node stack=new Node(size);
        System.out.println("Enter the number of elements to push = ");
        int num=scanner.nextInt();
        for(int i=0;i<num;i++){
            System.out.print("enter element " + (i + 1) + " : ");
            int data=scanner.nextInt();
            push(stack,data);
        }
        System.out.println("Stack top element " + stackTop(stack));
        System.out.println("Stack bottom element " + stackBottom(stack));
        pop(stack);
        scanner.close();
    }
}

