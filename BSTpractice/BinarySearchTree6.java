package BSTpractice;
class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
    public static TreeNode Insertion(TreeNode root,int data){
        if(root == null){
            return new TreeNode(data);
        }
        else if(root.data > data){
            root.left = Insertion(root.left,data);
        }
        else{
            root.right = Insertion(root.right,data);
        }
        return root;
    }
    public static boolean Searching(TreeNode root,int data){
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
    public static TreeNode Deletion(TreeNode root,int data){
        if(root == null){
            return null;
        }
        if(root.data > data){
            root.left = Deletion(root.left,data);
        }
        else if(root.data < data){
            root.right = Deletion(root.right,data);
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
                TreeNode is = packet(root.right);
                root.data = is.data;
                root.right = Deletion(root.right,is.data);
            }
        }
        return root;
    }
    public static TreeNode packet(TreeNode root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void preorder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(TreeNode root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void PrintOddDepth(TreeNode root,int depth){
        if(root == null){
            return;
        }
        if(depth % 2 != 0){
            System.out.print(root.data + " ");
        }
        PrintOddDepth(root.left,depth+1);
        PrintOddDepth(root.right,depth+1);
    }
    public static TreeNode DeleteAllEvenNode(TreeNode root){
        if(root == null){
            return null;
        }
        root.left = DeleteAllEvenNode(root.left);
        root.right = DeleteAllEvenNode(root.right);
        if(root.data % 2 == 0){
            return TreeNode.Deletion(root,root.data);
        }
        return root;
    }
}
public class BinarySearchTree6 {
    public static void main(String[] args) {

//        int[] array = {8,5, 3, 1, 4, 6, 10,11,14};
        int[] array = {5,3, 7, 2, 4, 6, 8, 10, 9};
        TreeNode root = null;
        for(int i=0;i< array.length;i++){
            root = TreeNode.Insertion(root,array[i]);
        }
        TreeNode.inorder(root);
        System.out.println();
//        TreeNode.Insertion(root,7);
//        TreeNode.Deletion(root,8);
//        TreeNode.inorder(root);
//        TreeNode.PrintOddDepth(root,1);
        TreeNode.DeleteAllEvenNode(root);
        TreeNode.inorder(root);
    }
}
