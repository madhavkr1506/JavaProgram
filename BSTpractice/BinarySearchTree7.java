package BSTpractice;

import java.beans.PropertyEditorManager;

class Dec{
    int data;
    Dec left,right;
    Dec(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
    public static void inorder(Dec root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void preorder(Dec root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Dec root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static Dec insertion(Dec root,int data){
        if(root == null){
            return new Dec(data);
        }
        else if(root.data > data){
            root.left = insertion(root.left,data);
        }
        else{
            root.right = insertion(root.right,data);
        }
        return root;
    }
    public static boolean searching(Dec root,int data){
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
    public static Dec packet(Dec root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static Dec deletion(Dec root, int data){
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
                Dec is = packet(root.right);
                root.data = is.data;
                root.right = deletion(root.right,is.data);
            }
        }
        return root;
    }

    public static Dec DeleteEvenNode(Dec root){
        if(root == null){
            return null;
        }

        root.left = DeleteEvenNode(root.left);
        root.right = DeleteEvenNode(root.right);
        if(root.data % 2 == 0){
            return Dec.deletion(root,root.data);
        }
        return root;
    }

    public static boolean LevelOfNode(Dec root,int data,int position){
        if(root == null){
            return false;
        }
        if(root.data == data){
            System.out.println("Element is present in the Binary Search Tree at level " + position);
            return true;
        }
        else if(root.data > data){
            return LevelOfNode(root.left,data,position+1);
        }
        else{
            return LevelOfNode(root.right,data,position+1);
        }
    }

    public static int SmallestGreater(Dec root, int target){
        int smallestGreatest = -1;
        while(root != null){
            if(root.data <= target){
                root = root.right;
            }
            else{
                smallestGreatest = root.data;
                root = root.left;
            }
        }
        return smallestGreatest;
    }

    public static int FindHeight(Dec root){
        if(root == null){
            return 0;
        }
        int left = FindHeight(root.left);
        int right = FindHeight(root.right);
        if(left > right){
            return left + 1;
        }
        else{
            return right + 1;
        }
    }

    public static int minPacket(Dec root){
        while(root.left != null){
            root = root.left;
        }
        return root.data;
    }

    public static Dec minDeletion(Dec root, int data){
        if(root == null){
            return null;
        }
        if(root.data > data){
            root.left = minDeletion(root.left,data);
        }
        else if(root.data < data){
            root.right = minDeletion(root.right,data);
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
                Dec is = new Dec(minPacket(root.right));
                root.data = is.data;
                root.right = minDeletion(root.right,is.data);
            }
        }
        return root;
    }

    public static Dec RemoveAllLeafNode(Dec root){
        if(root == null){
            return null;
        }
        if(root.left == null && root.right == null){
            return null;
        }
        root.left = RemoveAllLeafNode(root.left);
        root.right = RemoveAllLeafNode(root.right);
        return root;
    }
}
public class BinarySearchTree7 {
    public static void main(String[] args) {
//        int[] array = {5, 3, 8, 4, 7};
//        int[] array = {23, 56, 98, 135, 11, 0, 34};
        int[] array = {3, 1, 6, 2, 7};
        Dec root = null;
        for(int i=0;i< array.length;i++){
            root = Dec.insertion(root,array[i]);
        }
        Dec.inorder(root);
        System.out.println();
//        Dec.DeleteEvenNode(root);
//        Dec.inorder(root);
//        System.out.println(Dec.LevelOfNode(root,4,1));

//        if(!Dec.LevelOfNode(root,6,1)){
//            System.out.println("Element is not present in the Binary Search Tree.");
//        }


//        System.out.println(Dec.SmallestGreater(root,54));
//        int found = Dec.SmallestGreater(root,54);
//        if(found != -1 ){
//            System.out.println("Smallest greater value is " + found);
//        }
//        else{
//            System.out.println("No greater value exist in the Binary Search Tree.");
//        }

//        System.out.println(Dec.FindHeight(root));

//        int delMin = Dec.minPacket(root);
//        Dec.minDeletion(root,delMin);
//        Dec.inorder(root);
//        System.out.println();

        Dec.RemoveAllLeafNode(root);
        Dec.inorder(root);

    }
}
