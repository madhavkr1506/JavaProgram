package TrieDataStructure;

import java.util.*;

class Node{
    Node[] children;
    boolean endOfWord;

    public Node(){
        children = new Node[26];
        for(int i=0;i<26;i++){
            children[i]=null;

        }
        endOfWord = false;
    }
}
public class TrieDataStructureInsertion {
    private Node root;
    public TrieDataStructureInsertion(){
        root = new Node();
    }
    public void insertion(String word){
        Node current = root;
        for(int i=0;i<word.length();i++) {
            int index = word.charAt(i) - 'a';
            if(current.children[index] == null){
                current.children[index] = new Node();
            }
            if(i == word.length() - 1){
                current.children[index].endOfWord=true;
            }
            current = current.children[index];
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] Words = {"madhav","mad","hav","kumar","kum","ar"};
        TrieDataStructureInsertion obj1 = new TrieDataStructureInsertion();
        for(int i=0;i< Words.length;i++){
            obj1.insertion(Words[i]);
        }

    }
}
