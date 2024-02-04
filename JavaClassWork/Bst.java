import java.util.ArrayList;

public class Bst {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void preorder(Node root){
        if(root != null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void postorder(Node root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    public static boolean searching(Node root,int data){
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }
        else if (root.data<data) {
            return searching(root.left, data);
        }
        else{
            return searching(root.right, data);
        }
    }

    public static Node insertion(Node root,int data){
        if (root == null) {
            root = new Node(data);
            return root;
        }
        else if (root.data < data) {
            root.left = insertion(root.left, data);
        }
        else{
            root.right = insertion(root.right, data);
        }
        return root;
    }

    public static Node Deletion(Node root,int data){
        if(root.data > data){
            root.right = Deletion(root.right,data);
        }
        else if(root.data < data){
            root.left =  Deletion(root.left, data);
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
                Node ip = packet(root.right);
                root.data = ip.data;
                root.right = Deletion(root.right,ip.data);
            }
        }
        return root;
    }
    public static Node packet(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void printrange(Node root,int a, int b){
        if(root == null){
            return;
        }
        if(root.data >=a && root.data <= b){
            printrange(root.left, a, b);
            System.out.print(root.data+" ");
            printrange(root.right, a, b);
        }
        else if (root.data >= b) {
            printrange(root.left, a, b);
        }
        else{
            printrange(root.right, a, b);
        }
    }

    public static void printarray(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+" --> ");
        }
        System.out.println();
    }

    public static void printtoleaf(Node root,ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printarray(path);
        }
        else{
            printtoleaf(root.left, path);
            printtoleaf(root.right, path);
        }
        path.remove(path.size() - 1);
    }

    public static void printodddepth(Node root,int depth){
        if(root == null){
            return;
        }
        if(depth % 2 != 0){
            System.out.print(root.data+" ");
            printodddepth(root.left, depth+1);
            printodddepth(root.right, depth+1);
        }

    }

    public static Node deleteallevennode(Node root){
        if(root == null){
            return null;
        }
        root.left = deleteallevennode(root.left);
        root.right = deleteallevennode(root.right);
        if(root.data % 2 == 0){
            return Deletion(root, root.data);
        }
        return root;
    }
    public static void main(String[] args) {
        int[] array = {45, 15, 79, 90, 10, 55, 12, 20, 50};
        int n = array.length;

        Node tree = null;
        for (int i = 0; i < n; i++) {
            tree = insertion(tree, array[i]);
        }
        inorder(tree);


        // if(searching(tree, 11)){
        //     System.out.println("found");
        // }
        // else{
        //     System.out.println("not found");
        // }
        System.out.println();
        // Deletion(tree,4);
        // inorder(tree);

        // printrange(tree, 20, 79);
        // printtoleaf(tree, new ArrayList<>());

        // printodddepth(tree, 1);

        deleteallevennode(tree);
        inorder(tree);

        
    }
}
