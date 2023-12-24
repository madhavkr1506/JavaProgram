package BSTpractice;

class Node2{
    int data;
    Node2 left,right;
    Node2(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
    public static void inorder(Node2 root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void preorder(Node2 root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node2 root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static Node2 insertion(Node2 root,int data){
        if(root == null){
            root = new Node2(data);
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

    public static boolean searching(Node2 root,int data){
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
    public static Node2 deletion(Node2 root, int data){
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
                Node2 is = packet(root.right);
                root.data =is.data;
                root.right = deletion(root.right, is.data);
            }
        }
        return root;
    }
    public static Node2 packet(Node2 root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node2 root, int a,int b){
        if(root == null){
            return;
        }
        if(root.data >= a && root.data <= b){
            printInRange(root.left,a,b);
            System.out.println(root.data+" ");
            printInRange(root.right,a,b);
        }
        else if(root.data >= b){
            printInRange(root.left,a,b);
        }
        else {
            printInRange(root.right,a,b);
        }
    }


}

public class BinarySearchTree4 {
    public static void main(String[] args) {
        int[] data = {5, 1, 3, 4, 2, 7};
        Node2 root = null;
        for(int i=0;i<data.length;i++){
            root = Node2.insertion(root,data[i]);
        }
        Node2.inorder(root);
        System.out.println();
//        Node2.deletion(root,5);
//        Node2.inorder(root);

        Node2.printInRange(root,6,10);
    }
}
