// // Hash map

// import java.util.*;

// public class Practice19 {
//     public static void main(String[] args) {
//         HashMap<Integer,String> map = new HashMap<>();

//         map.put(1,"madhav"); // add key - value pair to hashmap
//         map.put(2,"krishna");
//         map.put(3,"shivam");
//         map.put(3,"shivam"); // duplicate key is not allowed in the hashmap
//         map.putIfAbsent(4,"Ravi");

//         // to get the key and value elements, we should call the getkey() and getvalue() methods.
//         // the Map.Entry interface contains the getKey() and getValue() methods.
//         // but, we should call the entrySet() method of Map interface to get the instance of Map.Entry.

//         for(Map.Entry m : map.entrySet()){
//             System.out.println(m.getKey()+" "+m.getValue());
//         }

//         System.out.println("after removing elements from map");

//         map.remove(1); // key based removal
//         map.remove(2, "krishna"); // key - value based removal
        

//         for(Map.Entry m : map.entrySet()){
//             System.out.println(m.getKey()+" "+m.getValue());
//         }


//         // replacing : 

//         map.replace(3,"keshav");

//         System.out.println("after replacing : ");

//         for(Map.Entry m : map.entrySet()){
//             System.out.println(m.getKey()+" "+m.getValue());
//         }

//         // replacAll : 

//         map.replaceAll((k,v)->"Aditi");

//         System.out.println("replacing all : ");

//         for(Map.Entry m : map.entrySet()){
//             System.out.println(m.getKey()+" "+m.getValue());
//         }


//         // difference between HashSet and HashMap : 
//         // HashSet contains only values whereas HashMap contains an entry(key and value).


//     }
// }
