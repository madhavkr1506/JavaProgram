package TrieDataStructure;
class Node3{
    Node3[] children;
    boolean endOfWord;
    public Node3(){
        children = new Node3[26];
        for(int i=0;i<26;i++){
            children[i] = null;
        }
        endOfWord = false;
    }
}
public class StartWith {
    private Node3 root = new Node3();
    public void insertion(String Word){
        Node3 current = root;
        for(int i=0;i<Word.length();i++){
            int index = Word.charAt(i) - 'a';
            if(current.children[index] == null){
                current.children[index] = new Node3();
            }
            if(i == Word.length() - 1){
                current.children[index].endOfWord = true;
            }
            current = current.children[index];
        }
    }

    public boolean searching(String Word){
        Node3 current = root;
        for(int i=0;i<Word.length();i++){
            int index = Word.charAt(i) - 'a';
            if(current.children[index] == null){
                return false;
            }
            if(i == Word.length() - 1 && current.children[index].endOfWord == false){
                return false;
            }
            current = current.children[index];
        }
        return true;
    }

    public boolean startWith(String word){
        Node3 current = root;
        for(int i=0;i<word.length();i++){
            int index = word.charAt(i) - 'a';
            if(current.children[index] == null){
                return false;
            }
            current = current.children[index];
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"madhav","kumar","is","a","good","boy"};
        StartWith obj1 = new StartWith();
        for(int i=0;i< words.length;i++){
            obj1.insertion(words[i]);
        }
        System.out.println(obj1.startWith("mad"));

    }
}
