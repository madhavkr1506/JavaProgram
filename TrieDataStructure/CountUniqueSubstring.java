package TrieDataStructure;

class Node4{
    Node4[] children;
    boolean endOfWord;
    public Node4(){
        children = new Node4[26];
        for(int i=0;i<26;i++){
            children[i] = null;
        }
        endOfWord = false;
    }
}

public class CountUniqueSubstring {
    private Node4 root = new Node4();
    public void insertion(String word){
        Node4 current = root;
        for(int i=0;i<word.length();i++){
            int index = word.charAt(i) - 'a';
            if(current.children[index] == null){
                current.children[index] = new Node4();
            }
            if(i == word.length() - 1){
                current.children[index].endOfWord = true;
            }
            current = current.children[index];
        }
    }
    public boolean searching(String word){
        Node4 current = root;
        for(int i=0;i<word.length();i++){
            int index = word.charAt(i) - 'a';
            if(current.children[index] == null){
                return false;
            }
            if(i == word.length() - 1 && current.children[index].endOfWord == false){
                return false;
            }
            current = current.children[index];
        }
        return true;
    }
    public int CountNode(Node4 root){
        if(root == null){
            return 0;
        }
        int count = 0;
        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
                count+=CountNode(root.children[i]);
            }
        }
        return count + 1;
    }
    public static void main(String[] args) {
        String string1 = "apple";
        CountUniqueSubstring obj1 = new CountUniqueSubstring();
        for(int i=0;i<string1.length();i++){
            String temp = string1.substring(i);
//            System.out.println(temp);
            obj1.insertion(temp);
        }
        System.out.println(obj1.CountNode(obj1.root));

    }
}
