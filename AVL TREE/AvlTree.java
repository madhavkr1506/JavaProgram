// Avl tree insertion : 
// it has time complexity of O(log n)


public class AvlTree{
    static class Node{
        int data;
        Node left;
        Node right;
        int height;
        public Node(int data){
            this.data = data;
            this.left = this.right = null;
            this.height = 1;
        }
    }

    public static int getheight(Node root){
        if(root == null){
            return 0;
        }
        else{
            return root.height;
        }

    }

    public static int balancefactor(Node root){
        if(root == null){
            return 0;
        }
        else{
            return getheight(root.left) - getheight(root.right);
        }
    }

    public static void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
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

    public static Node rightrotate(Node root){
        Node a = root.left;
        Node b = a.right;
        a.right = root;
        root.left = b;
        root.height = Math.max(getheight(root.left),getheight(root.right)) + 1;
        a.height = Math.max(getheight(root.left),getheight(root.right)) + 1;
        return a;
    }

    public static Node leftrotate(Node root){
        Node a = root.right;
        Node b = a.left;
        a.left = root;
        root.right = b;
        root.height = Math.max(getheight(root.left),getheight(root.right)) + 1;
        a.height = Math.max(getheight(root.left),getheight(root.right)) + 1;
        return a;

    }

    public static Node insertion(Node root,int data){
        if(root == null){
            return new Node(data);
        }
        if(data < root.data){
            root.left = insertion(root.left, data);
        }
        else{
            root.right = insertion(root.right, data);
        }
        root.height = Math.max(getheight(root.left),getheight(root.right)) + 1;
        int bf = balancefactor(root);

        if(bf > 1){
            if(data < root.data){
                return rightrotate(root);
            }
            else{
                root.left = leftrotate(root.left);
                return rightrotate(root);
            }

        }
        if(bf < -1){
            if(data < root.data){
                root.right = rightrotate(root.right);
                return leftrotate(root);
            }
            else{
                return leftrotate(root);
            }
        }
        return root;
    }




    
    public static void main(String[] args) {
        Node root = null;

        root = insertion(root, 1);
        root = insertion(root, 2);
        root = insertion(root, 4);
        root = insertion(root, 5);
        root = insertion(root, 6);
        root = insertion(root, 3);



        preorder(root);
    }
}