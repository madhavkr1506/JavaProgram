package BSTpractice;

class Node1{
    int data;
    Node1 left,right;
    Node1(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
    public static void inorder(Node1 root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void preorder(Node1 root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node1 root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static Node1 insertion(Node1 root,int data){
        if(root == null){
            root = new Node1(data);
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

    public static boolean searching(Node1 root,int data){
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
    public static Node1 deletion(Node1 root, int data){
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
                Node1 is = packet(root.right);
                root.data =is.data;
                root.right = deletion(root.right, is.data);
            }
        }
        return root;
    }
    public static Node1 packet(Node1 root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }


}

public class BinarySearchTree3 {
    public static void main(String[] args) {
        int[] data = {5, 1, 3, 4, 2, 7};
        Node1 root = null;
        for(int i=0;i<data.length;i++){
            root = Node1.insertion(root,data[i]);
        }
        Node1.inorder(root);
        System.out.println();
        Node1.deletion(root,5);
        Node1.inorder(root);
    }
}
