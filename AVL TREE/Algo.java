import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Algo {
    public static void main(String[] args) {
        String str1 = "BCAADDDCCACACAC";

        Map<Character,Integer> map = new HashMap<>();

        int frequency = 0;

        for(int i=0;i<str1.length();i++){
            frequency = 0;
            if(!map.containsKey(str1.charAt(i))){
                for(int j=i;j<str1.length();j++){
                    if(str1.charAt(i) == str1.charAt(j)){
                        frequency++;
                    }
                }
                map.put(str1.charAt(i), frequency);
            }
        }
        
        System.out.println("Frequency of each character : ");

        for(Map.Entry<Character,Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list,Map.Entry.comparingByValue());

        LinkedHashMap<Character,Integer> sortHashMap = new LinkedHashMap<>();

        for(Map.Entry<Character,Integer> e : list){
            sortHashMap.put(e.getKey(), e.getValue());
        }

        System.out.println("Sorted map according to value : ");

        for(Map.Entry<Character,Integer> e : sortHashMap.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

        System.out.println("Make a tree like structure : ");

        PriorityQueue<Node> priorityQueue = new PriorityQueue<>((a,b)->a.charfreq - b.charfreq);

        for(Map.Entry<Character,Integer> e : sortHashMap.entrySet()){
            priorityQueue.add(new Node(e.getKey(), e.getValue()));
        }

        while (priorityQueue.size() > 1) {
            Node left = priorityQueue.poll();
            Node right = priorityQueue.poll();

            Node parent = new Node('\0', left.charfreq + right.charfreq);

            parent.left = left;
            parent.right = right;
            priorityQueue.add(parent);
            System.out.println("Left Node : "+left.character+"("+left.charfreq+") Right Node : "+right.character+" ("+right.charfreq+") parent Node : "+parent.charfreq);
            
        }


    }

    static class Node{
        char character;
        int charfreq;

        Node left,right;
        Node(char character,int charfreq){
            this.character = character;
            this.charfreq = charfreq;

        }

    }
}

