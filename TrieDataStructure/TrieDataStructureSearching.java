package TrieDataStructure;
class Node1{
    Node1[] children;
    boolean endOfWord;
    public Node1(){
        children = new Node1[26];
        for(int i=0;i<26;i++){
            children[i] = null;
        }
        endOfWord = false;
    }
}
public class TrieDataStructureSearching {
//    private Node1 root;
//    public TrieDataStructureSearching(){
//        root = new Node1();
//    }

    Node1 root = new Node1();
    public void insertion(String word){
        Node1 current = root;
        for(int i=0;i<word.length();i++) {
            int index = word.charAt(i) - 'a';
            if(current.children[index] == null){
                current.children[index] = new Node1();
            }
            if(i == word.length() - 1){
                current.children[index].endOfWord=true;
            }
            current = current.children[index];
        }
    }

    public boolean searching(String word){
        Node1 current = root;
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





    public static void main(String[] args) {
        String Words[] = {"madhav","mad","hav","kumar","kum","ar"};
        TrieDataStructureSearching obj1 = new TrieDataStructureSearching();
        for(int i=0;i< Words.length;i++){
            obj1.insertion(Words[i]);
        }
        System.out.println(obj1.searching("madhav"));
        System.out.println(obj1.searching("kali"));

    }
}
