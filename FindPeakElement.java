

class Node6 {
    int data;
    Node6 next, prev;

    Node6(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class FindPeakElement {
    static Node6 traversal(Node6 ptr) {
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.prev;
        }
        return ptr;
    }

    static Node6 insertion(Node6 head, int data) {
        Node6 n = new Node6(data);
        n.data = data;
        n.next = head;
        n.prev = null;
        if (head != null) {
            head.prev = n;
        }
        return n;
    }

    static Node6 findPeakNode(Node6 head){
        Node6 peakNode=null;
        Node6 current = head;
        while(current != null && current.next != null){
            if(current.data > current.next.data){
                peakNode=current;
                break;
            }
            current=current.next;
        }
        return peakNode;
    }

    public static void main(String[] args) {
        Node6 node = null;
        node = insertion(node, 1);
        node = insertion(node, 2);
        node = insertion(node, 3);
        node = insertion(node, 4);
        node = insertion(node, 5);
        node = insertion(node, 6);
        traversal(node);
        System.out.println();
        Node6 peak=findPeakNode(node);
        System.out.println(peak.data);

    }
}
