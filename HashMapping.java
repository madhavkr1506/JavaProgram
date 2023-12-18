//import java.util.Scanner;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.HashMap;
import java.util.*;
public class HashMapping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        //  Insertion

        map.put("India",120);
        map.put("US",30);
        map.put("China",150);
        map.put("Russia",15);
        map.put("Italy",10);
        System.out.println(map);

//        Note : HashMap are unordered set.

//        Update :

        map.put("China",180);
        System.out.println(map);

//        Search / lookup

//        if(map.containsKey("India")){
//            System.out.println("Key is present in the map and Its value is " + map.get("India"));
//        }
//        else{
//            System.out.println("Key is not present in the map.");
//        }

//        System.out.println(map.get("US"));

//        Note : If key does not exist, it will print null.

//        for(Map.Entry<String,Integer> e : map.entrySet()){
////            System.out.println(e.getKey());
////            System.out.println(e.getValue());
//            System.out.println(e.getKey() +" "+ e.getValue());
//        }

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }

//        Remove

        map.remove("China");
        System.out.println(map);



    }
}
