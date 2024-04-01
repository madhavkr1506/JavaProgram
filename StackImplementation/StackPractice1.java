import java.util.Scanner;


public class StackPractice1{
    static class Node{
        int size;
        int top;
        int[] array;
        Node(int size){
            this.size = size;
            this.top = -1;
            this.array = new int[size];
        }
    }

    public static int stackTop(Node ptr){
        return ptr.array[ptr.top];
    }

    public static int stackBottom(Node ptr){
        return ptr.array[0];
    }

    public static int isFull(Node ptr){
        if(ptr.top == ptr.size - 1){
            return 1;
        }
        return 0;
    }

    public static int isEmpty(Node ptr){
        if(ptr.top == -1){
            return 1;
        }
        return 0;
    }

    public static void push(Node ptr,int data){
        
        if(isFull(ptr) == 1){
            System.out.println("Stack is running out of space");
        }
        else{
            if(check(ptr, data)){
                System.out.println("Element already exists");
            }
            else{
                ptr.top++;
                ptr.array[ptr.top] = data;
                System.out.println("Pushing element : " + data);
            }
        }
        

    }

    public static int pop(Node ptr){
        int val = -1;
        if (isEmpty(ptr) == 1) {
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            val = ptr.array[ptr.top];
            System.out.println("element popped : " + val);
            ptr.top = ptr.top - 1;
        }
        return val;
    }

    public static int peekUtil(Node ptr, int i){
        if((ptr.top - i + 1) < 0){
            return -1;
        }
        else{
            return ptr.array[ptr.top - i + 1];
        }
    }

    public static void printStack(Node ptr){
        for(int i = 1;i <= ptr.top + 1;i++){
            System.out.println(peekUtil(ptr, i) + " ");
        }
    }

    public static boolean check(Node ptr,int data){
        for(int i = 1;i <= ptr.top + 1;i++){
            if(ptr.array[i] == data){
                return true;
            }
            
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = 7;
        Node node = new Node(size);

        for(int i=0;i<size;i++){
            int data = sc.nextInt();
            push(node, data);
        }

        pop(node);

        printStack(node);



        sc.close();
    }
}