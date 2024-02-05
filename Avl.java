public class Avl {
    static class node{
        int data;
        int height;
        node left, right;
        public node(int data){
            this.data = data;
            this.height = 1;
            this.left = this.right = null;
        }
    }
    public static void inorder(node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    public static void preorder(node root){
        if(root != null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void postorder(node root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static int getheight(node root){
        if(root == null){
            return 0;
        }
        else{
            return root.height;
        }
    }
    public static int balancefactor(node root){
        if(root == null){
            return 0;
        }
        else{
            return getheight(root.left) - getheight(root.right);
        }
    }

    public static node rightrotate(node root){
        node a = root.left;
        node b = a.right;
        a.right = root;
        root.left = b;
        root.height = Math.max(getheight(root.left), getheight(root.right)) + 1;
        a.height = Math.max(getheight(root.left), getheight(root.right)) + 1;
        return a;
    }

    public static node leftrotate(node root){
        node a = root.right;
        node b = a.left;
        a.left = root;
        root.right = b;
        root.height = Math.max(getheight(root.left), getheight(root.right)) + 1;
        a.height = Math.max(getheight(root.left), getheight(root.right)) + 1;
        return a;
    }


    public static node insertion(node root,int data){
        if(root == null){
            return new node(data);
        }
        if(data == root.data){
            return root;
        }
        else if(data < root.data){
            root.left = insertion(root.left, data);

        }
        else{
            root.right = insertion(root.right, data);
        }
        root.height = Math.max(getheight(root.left), getheight(root.right)) + 1;
        int getbalancefactor = balancefactor(root);
        if(getbalancefactor > 1 ){
            if(data < root.data){
                return rightrotate(root);
            }
            else{
                root.left = leftrotate(root.left);
                return rightrotate(root);
            }
        }
        if(getbalancefactor < -1 ){
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
    public static node packet(node root){
        node current = root;
        while(current.left != null){
            current = current.left;
        }
        return current;
    }

    public static node deletenode(node root,int data){
        if(root == null){
            return root;
        }
        if(data < root.data){
            root.left = deletenode(root.left, data);
        }
        else if(data > root.data){
            root.right = deletenode(root.right, data);
        }
        else{
            if((root.left == null) || (root.right == null)){
                node temp = null;
                if(temp == root.left){
                    temp = root.right;
                }
                else{
                    temp = root.left;
                }
                if(temp == null){
                    temp = root;
                    root = null;
                }
                else{
                    root = temp;
                }
            }
            else{
                node temp = packet(root.right);
                root.data = temp.data;
                root.right = deletenode(root.right, temp.data);
            }
        }
        if(root == null){
            return root;
        }
        root.height = Math.max(getheight(root.left), getheight(root.right)) + 1;
        int getbalancefactor = balancefactor(root);
        if(getbalancefactor > 1 ){
            if(data < root.data){
                return rightrotate(root);
            }
            else{
                root.left = leftrotate(root.left);
                return rightrotate(root);
            }
        }
        if(getbalancefactor < -1 ){
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
        node tree = null;
        tree = insertion(tree, 1);
        tree = insertion(tree, 2);
        tree = insertion(tree, 4);
        tree = insertion(tree, 5);
        tree = insertion(tree, 6);
        tree = insertion(tree, 3);
        preorder(tree);
        System.out.println();
        inorder(tree);
        System.out.println();
        
        deletenode(tree, 2);
        preorder(tree);
        System.out.println();
        inorder(tree);


    }
}
