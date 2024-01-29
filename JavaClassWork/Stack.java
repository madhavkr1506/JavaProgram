import java.util.Scanner;

public class Stack {
    static class Node{
        int size;
        int top;
        int[] array;
        public Node(int size){
            this.size=size;
            this.top=-1;
            this.array = new int[size];
        }
    }
    public static int isFull(Node ptr){
        if(ptr.top == ptr.size - 1){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static int isEmpty(Node ptr){
        if(ptr.top == -1){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static int stackTop(Node ptr){
        return ptr.array[ptr.top];
    }
    public static int stackBottom(Node ptr){
        return ptr.array[0];
    }
    public static void push(Node ptr,int data){
        if(isFull(ptr) == 1){
            System.out.println("stack is full");
        }
        else{
            ptr.top++;
            ptr.array[ptr.top] = data;
            System.out.println("pushing element = "+data);
        }
    }
    public static int pop(Node ptr){
        if(isEmpty(ptr) == 1){
            System.out.println("stack is empty");
            return 0;
        }
        else{
            int val = ptr.array[ptr.top];
            ptr.top--;
            System.out.println("poping element = "+val);
            return val;
        }
    }

    public static int peek(Node ptr,int i){
        if((ptr.top-i+1)<0){
            return -1;
        }
        else{
            return ptr.array[ptr.top-i+1];
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        Node stack = new Node(size);

        for(int i=0;i<size;i++){
            int data = scanner.nextInt();
            push(stack, data);
        }

        for(int j=1;j<=stack.top+1;j++){
            System.out.print(peek(stack, j)+" ");
        }
        System.out.println();
        
        pop(stack);

        scanner.close();

    }
}
