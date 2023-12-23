package TrieDataStructure;

class Node5{
    Node5[] children;
    boolean endOfWord;
    public Node5(){
        children = new Node5[26];
        for(int i=0;i<26;i++){
            children[i] = null;
        }
        endOfWord = false;
    }
}

public class LongestPrefixWord {
    private Node5 root = new Node5();
    public void insertion(String word){
        Node5 current = root;
        for(int i=0;i<word.length();i++){
            int index = word.charAt(i) - 'a';
            if(current.children[index] == null){
                current.children[index] = new Node5();
            }
            if(i == word.length() - 1){
                current.children[index].endOfWord = true;
            }
            current = current.children[index];
        }
    }
    public boolean searching(String word){
        Node5 current = root;
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

    public String ans = "";

    public void LongestWord(Node5 root,StringBuilder temp){
        if(root == null){
            return;
        }
        for(int i=0;i<26;i++){
            if(root.children[i]!=null && root.children[i].endOfWord == true){
                temp.append((char)(i + 'a'));
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
                LongestWord(root.children[i],temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
    public static void main(String[] args) {
        String[] words = {"m","ma","mad","madh","madha","madhav"};
        LongestPrefixWord obj1 = new LongestPrefixWord();
        for(int i=0;i<words.length;i++){
            obj1.insertion(words[i]);
        }
        obj1.LongestWord(obj1.root,new StringBuilder(""));
        System.out.println(obj1.ans);

    }
}

