import java.util.Scanner;

class Node3 {
    int data;
    Node3 next;
    Node3 prev;

    Node3(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}


public class DoublyLinkedList {

    static void traverse(Node3 ptr){
        while(ptr.next != null){
            ptr=ptr.next;
        }
        while(ptr != null){
            System.out.print(ptr.data + " ");
            ptr=ptr.prev;
        }
    }

    static Node3 insertAtBeginning(Node3 head, int data){
        Node3 ptr=new Node3(data);
        ptr.data=data;
        ptr.next=head;
        ptr.prev=null;
        if(head != null){
            head.prev=ptr;
        }
        return ptr;
    }

    static Node3 insertAtIndex(Node3 head, int data,int index){
        Node3 ptr=new Node3(data);
        Node3 p=head;
        int i=0;
        while(i != index - 1){
            p=p.next;
            i++;
        }
        ptr.data=data;
        ptr.next=p.next;
        if(p.next != null){
            p.next.prev=ptr;
        }
        p.next=ptr;
        ptr.prev=p;
        return head;
    }

    static Node3 insertAtLast(Node3 head,int data){
        Node3 ptr=new Node3(data);
        Node3 p=head;
        while(p.next != null){
            p=p.next;
        }
        ptr.data=data;
        ptr.next=null;
        ptr.prev=p;
        p.next=ptr;
        return head;
    }

    static Node3 deleteAtBeginning(Node3 head){
        Node3 p=head;
        head=head.next;
        head.prev=null;
        return head;
    }

    static Node3 deleteAtIndex(Node3 head,int index){
        Node3 p=head;
        Node3 q=head.next;
        for(int i=0;i<index - 1;i++){
            p=p.next;
            q=q.next;
        }
        p.next=q.next;
        p.next.prev=p;
        return head;
    }

    static Node3 deleteAtLast(Node3 head){
        Node3 p=head;
        Node3 q=head.next;
        while(q.next != null){
            p=p.next;
            q=q.next;
        }
        p.next=null;
        return head;
    }

    static Node3 deleteAtValue(Node3 head,int value){
        Node3 p=head;
        Node3 q=head.next;
        while(q.data != value && q.next != null){
            p=p.next;
            q=q.next;
        }
        if(q.data == value){
            p.next=q.next;
            p.next.prev=p;
        }
        return head;
    }

    static void bubbleSort(Node3 head){
        Node3 start;
        Node3 last=null;
        int swapped;
        if(head == null){
            return;
        }
        do{
            swapped=0;
            start=head;
            while(start.next != last){
                if(start.data > start.next.data){
                    int temp=start.data;
                    start.data=start.next.data;
                    start.next.data=temp;
                    swapped=1;
                }
                start=start.next;
            }
            last=start;
        }while(swapped != 0);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Node3 head=null;
        Node3 current=null;
        System.out.print("Enter the number of elements you want to enter = ");
        int num=scanner.nextInt();
        for(int i=0;i<num;i++){
            int value=scanner.nextInt();
            Node3 newNode = new Node3(value);
            newNode.data=value;
            newNode.next=null;
            newNode.prev=current;
            if(current != null){
                current.next=newNode;
            }
            else{
                head=newNode;
            }
            current=newNode;
        }
//        System.out.print("Enter data = ");
//        int data=scanner.nextInt();
//        System.out.print("Enter index = ");
//        int index=scanner.nextInt();
//        head=insertAtIndex(head,data,index);
//        head=insertAtLast(head,data);
//        head=deleteAtBeginning(head);
//        head=deleteAtIndex(head,index);
//        head=deleteAtLast(head);
//        head=deleteAtValue(head,data);
        bubbleSort(head);
        traverse(head);

    }
}
