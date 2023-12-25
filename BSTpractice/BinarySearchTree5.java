package BSTpractice;

import java.util.ArrayList;

class Node3{
    int data;
    Node3 left,right;
    Node3(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
    public static boolean searching(Node3 root, int data){
        if(root == null){
            return false;
        }
        if(root.data == data){
            return true;
        }
        else if(root.data > data){
            return searching(root.left,data);
        }
        else{
            return searching(root.right,data);
        }
    }
    public static Node3 insertion(Node3 root, int data){
        if(root == null){
            root = new Node3(data);
            return root;
        }
        else if(root.data > data){
            root.left = insertion(root.left,data);
        }
        else {
            root.right = insertion(root.right,data);
        }
        return root;
    }
    public static Node3 deletion(Node3 root, int data){
        if(root == null){
            return null;
        }
        if(root.data > data){
            root.left = deletion(root.left,data);
        }
        else if(root.data < data){
            root.right = deletion(root.right,data);
        }
        else{
            if(root.left == null && root.right == null){
                return null;
            }
            else if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            else{
                Node3 is = packet(root.right);
                root.data = is.data;
                root.right = deletion(root.right,is.data);
            }
        }
        return root;
    }
    public static Node3 packet(Node3 root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void inorder(Node3 root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void preorder(Node3 root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node3 root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void printArray(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i) + " --> ");
        }
        System.out.println();
    }
    public static void printToLeaf(Node3 root,ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printArray(path);
        }
        else{
            printToLeaf(root.left,path);
            printToLeaf(root.right,path);
        }
        path.remove(path.size() - 1);
    }

}
public class BinarySearchTree5 {
    public static void main(String[] args) {
        int[] array = {8,5, 3, 1, 4, 6, 10,11,14};
        Node3 root = null;
        for(int i=0;i<array.length;i++){
            root = Node3.insertion(root,array[i]);
        }
//        Node3.inorder(root);
//        System.out.println(Node3.searching(root,15));
        Node3.printToLeaf(root,new ArrayList<>());

    }
}
