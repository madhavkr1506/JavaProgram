import java.util.*;
import java.lang.Math;

public class ImplementationOfHashMap {
    static class HashMap<K,V>{   //  K and V are of generic type (It can be any general data type, may be it is string, Integer, boolean, float).
        public class Node{
            K key;
            V value;
            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;  //  --> Total number of nodes.
        private int N;  //  --> Array size.
        private LinkedList<Node> buckets[];  // --> buckets is an array of type Linked List having node that contain key and value. This is basically a Hash map.

        public HashMap(){
            this.N=4;
            this.buckets = new LinkedList[4];  // --> Here array is initialised.
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();   // -->  Each index of an array is having empty linked list.
            }
        }
        private int hashFunction(K key){
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }
        private int searchLinkedList(K key, int bi){
            LinkedList<Node> list1 = buckets[bi];
            for(int i=0;i<list1.size();i++){
                if(list1.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }
        private void reHash(){
            LinkedList<Node> oldBuckets[] = buckets;
            buckets = new LinkedList[N * 2];

            for(int i=0;i<N*2;i++){
                buckets[i] = new LinkedList<>();
            }

            for(int i=0;i<oldBuckets.length;i++){
                LinkedList<Node> l1 = oldBuckets[i];
                for(int j=0;j<l1.size();j++){
                    Node node = l1.get(j);
                    put(node.key,node.value);
                }
            }
        }

        public void put(K key,V value){
            int bi = hashFunction(key);
            int di = searchLinkedList(key,bi);
            if(di == -1){
                buckets[bi].add(new Node(key,value));
                n++;
            }
            else{
                Node node = buckets[bi].get(di);
                node.value=value;
            }
            double lambda = (double)n/N;
            if(lambda > 2.0){
                reHash();
            }
        }
        public boolean keyContains(K key){
            int bi = hashFunction(key);
            int di = searchLinkedList(key,bi);
            if(di == -1){
                return false;
            }
            else{
                return true;
            }
        }
        public V remove(K key){
            int bi = hashFunction(key);
            int di = searchLinkedList(key,bi);
            if(di == -1){
                return null;
            }
            else{
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }
        public V get(K key){
            int bi = hashFunction(key);
            int di = searchLinkedList(key,bi);
            if(di == -1){
                return null;
            }
            else{
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        public boolean isEmpty(){
            return n == 0;
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> l1 = buckets[i];
                for(int j=0;j<l1.size();j++){
                    Node node = l1.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }
    }
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India",150);
        map.put("China",140);
        map.put("South korea",20);
        ArrayList<String> keys = map.keySet();
        for(int i=0;i<keys.size();i++){
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }
        map.remove("India");
        System.out.println(map.get("India"));

//        for(int i=0;i<keys.size();i++){
//            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
//        }
    }
}
