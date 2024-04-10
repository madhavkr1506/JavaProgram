import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class CharFreq {
    public static void main(String[] args) {
        Map<Character,Integer> map = new HashMap<>();

        map.put('a', 6);
        map.put('b', 4);
        map.put('c', 5);
        map.put('d', 2);
        map.put('e', 3);
        map.put('f', 1);

        binaryTree(map);

    }

    public static void binaryTree(Map<Character,Integer> map){
        PriorityQueue<Node> queue = new PriorityQueue<>((a,b)->a.charFreq - b.charFreq);

        for(Map.Entry<Character,Integer> e : map.entrySet()){
            queue.add(new Node(e.getKey(), e.getValue()));
        }

        while(queue.size() > 1){
            Node left = queue.poll();
            Node right = queue.poll();

            Node parent = new Node('\0',left.charFreq + right.charFreq);

            parent.left = left;
            parent.right = right;

            queue.add(parent);

            System.out.println("Left Node : "+left.character+"("+left.charFreq+") Right Node : "+right.character+" ("+right.charFreq+") parent Node : "+parent.charFreq);


        }
    }
    static class Node{
        char character;
        int charFreq;
        Node left;
        Node right;
        Node(char character,int charFreq){
            this.character = character;
            this.charFreq = charFreq;
        }
    }
}
