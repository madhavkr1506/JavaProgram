package DoublyLinkedList;

import org.w3c.dom.NamedNodeMap;

import java.util.Scanner;

public class DoublyLinkedList1 {
    static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public  static void Traverse(Node ptr){
        while(ptr.next != null){
            ptr=ptr.next;
        }
        while(ptr != null){
            System.out.print(ptr.data+" ");
            ptr=ptr.prev;
        }
    }
    public static Node insertAtBeg(Node head,int data){
        Node ptr = new Node(data);
        ptr.data=data;
        ptr.next=head;
        ptr.prev=null;
        if(head != null){
            head.prev=ptr;
        }
        return ptr;
    }
    public static Node insertAtIndex(Node head,int data,int index){
        Node ptr = new Node(data);
        Node p = head;
        int i = 0;
        while(i != index - 1){
            p = p.next;
            i++;
        }
        ptr.data=data;
        ptr.next=p.next;
        if(ptr.next != null){
            ptr.next.prev=ptr;
        }
        p.next=ptr;
        ptr.prev=p;
        return head;
    }
    public static Node insertAtLast(Node head,int data){
        Node ptr = new Node(data);
        Node p = head;
        while(p.next != null){
            p=p.next;
        }
        ptr.data=data;
        ptr.next=null;
        ptr.prev=p;
        p.next=ptr;
        return head;
    }
    public static Node DeleteAtBeg(Node head){
        Node p = head;
        head = head.next;
        head.prev=null;
        return head;
    }
    public static Node DeleteAtIndex(Node head,int index){
        Node p = head;
        Node q = head.next;
        for(int i=0;i<index - 1;i++){
            p=p.next;
            q=q.next;
        }
        p.next=q.next;
        p.next.prev=p;
        return head;
    }
    public static Node DeleteAtValue(Node head,int value){
        Node p = head;
        Node q = head.next;
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
    public static Node DeleteAtLast(Node head){
        Node p = head;
        Node q = head.next;
        while (q.next != null){
            p=p.next;
            q=q.next;
        }
        p.next=null;
        return head;
    }
    public static void bubbleSort(Node head){
        Node start;
        Node last = null;
        int swapped;
        if(head == null){
            return;
        }
        do{
            swapped=0;
            start = head;
            while(start.next != last){
                if(start.data > start.next.data){
                    int temp = start.data;
                    start.data = start.next.data;
                    start.next.data = temp;
                    swapped=1;
                }
                start = start.next;
            }
            last = start;
        }while (swapped!=0);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node head = null;
        Node current = null;
        int num = scanner.nextInt();
        for(int i=0;i<num;i++){
            int value = scanner.nextInt();
            Node newNode = new Node(value);
            newNode.data=value;
            newNode.next=null;
            newNode.prev=current;
            if(current != null){
                current.next=newNode;
            }
            else {
                head = newNode;
            }
            current = newNode;
        }
        Traverse(head);
//        System.out.println();
//        head = DeleteAtIndex(head,2);
//        Traverse(head);
//        System.out.println();
//        head = DeleteAtValue(head,2);
//        Traverse(head);
//        System.out.println();
//        head = DeleteAtLast(head);
//        Traverse(head);
//        System.out.println();
//        head = DeleteAtBeg(head);
//        Traverse(head);
        System.out.println();
        head = insertAtBeg(head,9);
        Traverse(head);
        System.out.println();
        head = insertAtLast(head,12);
        Traverse(head);
        System.out.println();
        head=insertAtIndex(head,15,3);
        Traverse(head);
        System.out.println();
        bubbleSort(head);
        Traverse(head);

    }
}
