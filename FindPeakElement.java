import java.util.Scanner;

class Mode {
    int data;
    Mode next, prev;

    Mode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class FindPeakElement {
    static Mode traverse(Mode ptr) {
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.prev;
        }
        return ptr;
    }

    static Mode insert(Mode head, int data) {
        Mode n = new Mode(data);
        n.data = data;
        n.next = head;
        n.prev = null;
        if (head != null) {
            head.prev = n;
        }
        return n;
    }

    static Mode peakNode(Mode head){
        Mode peaknode=null;
        Mode current = head;
        while(current != null && current.next != null){
            if(current.data > current.next.data){
                peaknode=current;
                break;
            }
            current=current.next;
        }
        return peaknode;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mode node = null;
        node = insert(node, 1);
        node = insert(node, 2);
        node = insert(node, 3);
        node = insert(node, 4);
        node = insert(node, 5);
        node = insert(node, 6);
        traverse(node);
        System.out.println();
        Mode peak=peakNode(node);
        System.out.println(peak.data);

    }
}
