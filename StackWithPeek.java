import java.util.Scanner;

class Node1 {
    int size;
    int top;
    int[] array;
    Node1(int size){
        this.size=size;
        this.top=-1;
        this.array=new int[size];
    }
}


public class StackWithPeek {

    static int stackTop(Node1 ptr){
        return ptr.array[ptr.top];
    }
    static int stackBottom(Node1 ptr){
        return ptr.array[0];
    }

    static int isEmpty(Node1 ptr){
        return ptr.top == -1 ? 1 : 0;
    }

    static int isFull(Node1 ptr){
        return ptr.top == ptr.size - 1 ? 1 : 0;
    }
    static void push(Node1 ptr,int value){
        if((isFull(ptr)) == 1){
            System.out.println("Stack is already full");
        }
        else{
            ptr.top++;
            ptr.array[ptr.top]=value;
            System.out.println("Pushing element " + value);
        }
    }
    static int pop(Node1 ptr){
        if((isEmpty(ptr)) == 1){
            System.out.println("Stack is already empty");
            return -1;
        }
        else{
            int value=ptr.array[ptr.top];
            ptr.top--;
            System.out.println("Popping element " + value);
            return value;
        }
    }
    static int peek(Node1 ptr,int i){
        if((ptr.top - i + 1) < 0){
            System.out.println("Invalid range");
            return -1;
        }
        else{
            return ptr.array[ptr.top - i + 1];
        }
    }

    static void bubbleSort(Node1 ptr){
        int n=ptr.top + 1;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(ptr.array[j] > ptr.array[j+1]){
                    int temp=ptr.array[j];
                    ptr.array[j]=ptr.array[j+1];
                    ptr.array[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello world");
        System.out.print("Please enter the size of the array ");
        int size=scanner.nextInt();
        Node1 stack=new Node1(size);
        System.out.print("Enter the number of element you want to enter ");
        int num=scanner.nextInt();
        for(int i=0;i<num;i++){
            System.out.print("Enter the " + (i + 1) + " element : ");
            int data=scanner.nextInt();
            push(stack,data);
        }
        System.out.println("Stack top element : " + stackTop(stack));
        System.out.println("Stack bottom element : " + stackBottom(stack));
        for(int j=1;j<=stack.top + 1;j++){
            System.out.println("stack elements are = " + peek(stack,j));
        }

        bubbleSort(stack);

        for(int j=1;j<=stack.top + 1;j++){
            System.out.println(peek(stack,j));
        }

        pop(stack);
        scanner.close();
    }
}
