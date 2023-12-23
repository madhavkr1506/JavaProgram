package TrieDataStructure;
class Node2{
    Node2[] children;
    boolean endOfWord;
    public Node2(){
        children = new Node2[26];
        for(int i=0;i<26;i++){
            children[i] = null;
        }
        endOfWord = false;
    }
}
public class WordBreakDown {
    private Node2 root = new Node2();

    public void insertion(String word){
        Node2 current = root;
        for(int i=0;i<word.length();i++){
            int index = word.charAt(i) - 'a';
            if(current.children[index] == null){
                current.children[index] = new Node2();
            }
            if(i == word.length() - 1){
                current.children[index].endOfWord = true;
            }
            current=current.children[index];
        }
    }
    public boolean searching(String key){
        Node2 current = root;
        for(int i=0;i<key.length();i++){
            int index = key.charAt(i) - 'a';
            if(current.children[index] == null){
                return false;
            }
            if(i == key.length() - 1 && current.children[index].endOfWord == false){
                return false;
            }
            current = current.children[index];
        }
        return true;
    }

    public boolean breakDown(String key){
        if(key.length() == 0){
            return true;
        }
        for(int i=0;i<key.length();i++){
            String first = key.substring(0,i+1);
            String second = key.substring(i+1);
            if(searching(first) && breakDown(second)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String Words[] = {"madhav","kumar","is","a","good","boy"};
        WordBreakDown obj1 = new WordBreakDown();
        for(int i=0;i< Words.length;i++){
            obj1.insertion(Words[i]);
        }
//        System.out.println(obj1.searching("madhav"));
        System.out.println(obj1.breakDown("madhavisagoodboy"));

    }
}
