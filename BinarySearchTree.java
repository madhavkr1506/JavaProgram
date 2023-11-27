import java.util.Scanner;

class Node4{
    int data;
    Node4 left;
    Node4 right;

    Node4 (int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class BinarySearchTree {
    static Node4 createNode(int data){
        Node4 n=new Node4(data);
        n.data=data;
        n.left=null;
        n.right=null;
        return n;
    }

    static Node4 createTree(int[] array,int n,int i){
        Node4 newNode=null;
        if(i<n){
            newNode=createNode(array[i]);
            newNode.left=createTree(array,n,2*i+1);
            newNode.right=createTree(array,n,2*i+2);
        }
        return newNode;
    }

    static void preOrder(Node4 root){
        if(root != null){
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    static void inOrder(Node4 root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    static void postOrder(Node4 root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    static Node4 search(Node4 root, int data,int position){
        if(root == null){
            return null;
        }
        if(data == root.data){
            System.out.print("Element " + data + " found at node " + position);
            return root;
        }
        else if(data < root.data){
            return search(root.left,data,position+1);
        }
        else{
            return search(root.right,data,position+1);
        }
    }


    static Node4 insertion(Node4 root, int value){
        if(root == null){
            return createNode(value);
        }
        if(value == root.data){
            System.out.println("you cannot insert any element here");
        }
        else if(value < root.data){
            root.left=insertion(root.left,value);
        }
        else{
            root.right=insertion(root.right,value);
        }
        return root;
    }

//    static Node4 packet(Node4 root){
//        root=root.left;
//        while(root.right != null){
//            root=root.right;
//        }
//        return root;
//    }
//
//    static Node4 deletion(Node4 root,int value){
//        Node4 ipre;
//        if(root == null){
//            return null;
//        }
//        if(root.left == null && root.right == null){
//            return null;
//        }
//        if(value < root.data){
//            root.left=deletion(root.left,value);
//        }
//        else if(value > root.data){
//            root.right=deletion(root.right,value);
//        }
//        else{
//            ipre=packet(root);
//            root.data=ipre.data;
//            root.left=deletion(root.left, ipre.data);
//        }
//        return root;
//    }

//    static Node4 packet(Node4 root){
//        while(root.left != null){
//            root=root.left;
//        }
//        return root;
//    }
//
//    static Node4 deletion(Node4 root,int value){
//        Node4 ipre;
//        if(root == null){
//            return null;
//        }
//        if(root.left == null && root.right == null){
//            return null;
//        }
//        if(value < root.data){
//            root.left=deletion(root.left,value);
//        }
//        else if(value > root.data){
//            root.right=deletion(root.right,value);
//        }
//        else{
//            ipre=packet(root);
//            root.data=ipre.data;
//            root.left=deletion(root.left, ipre.data);
//        }
//        return root;
//    }


    static Node4 packet(Node4 root){
        root=root.left;
        while(root.right != null){
            root=root.right;
        }
        return root;
    }

    static Node4 deletion(Node4 root, int minrange, int maxrange) {
        if (root == null) {
            return null;
        }
        root.left = deletion(root.left, minrange, maxrange);
        root.right = deletion(root.right, minrange, maxrange);
        if (root.data >= minrange && root.data <= maxrange) {
            if(root.left==null && root.right==null){
                return null;
            }
            else if (root.left == null) {
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }
            else {
                Node4 inOrderPredecessor = packet(root.left);
                root.data = inOrderPredecessor.data;
                root.left = deletion(root.left, inOrderPredecessor.data, inOrderPredecessor.data);
            }
        }
        return root;
    }


    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of element you want to enter = ");
        int num=scanner.nextInt();
        int[] array;
        array=new int[num];
        for(int i=0;i<num;i++){
            array[i]=scanner.nextInt();
        }
        Node4 tree=null;
        tree=createTree(array,num,0);
        preOrder(tree);
        System.out.println();
//        int data=scanner.nextInt();
//        Node4 find=search(tree,data,1);
//        tree=insertion(tree,data);
//        preOrder(tree);
//        System.out.println();
//        Node4 element=packet(tree);
//        tree=deletion(tree,element.data);
        int min=scanner.nextInt();
        int max=scanner.nextInt();
        tree=deletion(tree,min,max);
        preOrder(tree);


    }
}
