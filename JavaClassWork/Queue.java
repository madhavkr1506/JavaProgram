public class Queue {
    static class node{
        int size;
        int top;
        int beg;
        String[] string;
        public node(int size){
            this.size = size;
            this.top = this.beg = -1;
            this.string = new String[size];
        }
    }

    public static boolean queueisfull(node ptr){
        if(ptr.top == ptr.size - 1){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean queueisempty(node ptr){
        if(ptr.top == ptr.beg){
            return true;
        }
        else{
            return false;
        }
    }

    public static String queuetop(node ptr){
        return ptr.string[ptr.beg + 1];
    }

    public static String queuebottom(node ptr){
        return ptr.string[ptr.top];
    }

    public static void enqueue(node ptr,String name){
        if(queueisfull(ptr)){
            System.out.println("Queue is full");
            return;
        }
        else{
            ptr.top++;
            ptr.string[ptr.top] = name;
            System.out.println("Enqueue "+name);
        }
    }
    public static String dequeue(node ptr){
        if(queueisempty(ptr)){
            return "Queue is empty";
        }
        else{
            ptr.beg++;
            String packet = ptr.string[ptr.beg];
            return packet;
        }
    }

    public static void main(String[] args) {
        node queue = new node(10);
        enqueue(queue,"Madhav");
        enqueue(queue,"Satyam");
        enqueue(queue,"Rahul");
        enqueue(queue,"Rohan");
        System.out.println();
        while (!queueisempty(queue)) {
            System.out.println(queuetop(queue));
            dequeue(queue);
        }


    }
}
