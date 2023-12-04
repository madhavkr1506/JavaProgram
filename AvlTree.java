import java.util.Scanner;
class Node5{
    int data;
    int height;
    Node5 left;
    Node5 right;

    Node5(int data){
        this.data=data;
        this.left=null;
        this.right=null;
        this.height=1;
    }
}
public class AvlTree {

    static int getHeight(Node5 root){
        if(root == null){
            return 0;
        }
        else{
            return root.height;
        }
    }
    static int getBalanceFactor(Node5 root){
        if(root == null){
            return 0;
        }
        else{
            return getHeight(root.left) - getHeight(root.right);
        }
    }

    static Node5 createNode(int data){
        Node5 n= new Node5(data);
        n.data=data;
        n.left=null;
        n.right=null;
        n.height=1;
        return n;
    }

    static Node5 rightRotate(Node5 root){
        if(root == null || root.left == null){
            return root;
        }
        Node5 a=root.left;
        Node5 b=a.right;
        a.right=root;
        root.left=b;
        root.height=Math.max(getHeight(root.right),getHeight(root.left)) + 1;
        a.height=Math.max(getHeight(root.right),getHeight(root.left)) + 1;
        return a;
    }

    static  Node5 leftRotate(Node5 root){
        if(root == null || root.right == null){
            return root;
        }
        Node5 a=root.right;
        Node5 b=a.left;
        a.left=root;
        root.right=b;
        root.height=Math.max(getHeight(root.right),getHeight(root.left)) + 1;
        a.height=Math.max(getHeight(root.right),getHeight(root.left)) + 1;
        return a;
    }

    static void inOrder(Node5 root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    static void preorder(Node5 root){
        if(root!=null){
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    static void postOrder(Node5 root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    static Node5 insert(Node5 root, int data) {
        if (root == null) {
            return (new Node5(data));
        }
        if (data == root.data) {
            return root;
        } else if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        root.height = Math.max(getHeight(root.right), getHeight(root.left)) + 1;
        int balanceFactor = getBalanceFactor(root);
        if (balanceFactor > 1 && data < root.left.data) {
            return rightRotate(root);
        }
        if (balanceFactor < -1 && data > root.right.data) {
            return leftRotate(root);
        }
        if (balanceFactor > 1 && data > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        if (balanceFactor < -1 && data < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Node5 root=null;
        root=insert(root,10);
        root=insert(root,20);
        root=insert(root,30);
        root=insert(root,40);
        root=insert(root,50);
        root=insert(root,25);

        preorder(root);

    }

}
