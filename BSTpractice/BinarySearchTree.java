package BSTpractice;

public class BinarySearchTree {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    public static void preorder(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void postorder(Node root){
        if(root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static boolean Searching(Node root,int data){
        if(root == null){
            return false;
        }
        if(root.data == data){
            return true;
        }
        else if(root.data > data){
            return Searching(root.left,data);
        }
        else{
            return Searching(root.right,data);
        }
    }
    public static Node insertion(Node root,int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        else if(root.data > data){
            root.left = insertion(root.left,data);
        }
        else{
            root.right = insertion(root.right,data);
        }
        return root;
    }
    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i=0;i< values.length;i++){
            root=insertion(root,values[i]);
        }
        inorder(root);
        System.out.println();
        if(Searching(root,11)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
        }
    }
}
