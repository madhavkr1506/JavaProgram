import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        String str1 = "BCAADDDCCACACAC";

        
        int freq = 0;

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<str1.length();i++){
            freq = 0;
            if(map.containsKey(str1.charAt(i)) == false){
                for(int j=i;j<str1.length();j++){
                    if(str1.charAt(i) == str1.charAt(j)){
                        freq++;
                    }
                }
                map.put(str1.charAt(i), freq);
            }
            

        }

        // System.out.println(map);

        // unsorted by value : 
        System.out.println("before sorting : ");
        for(Map.Entry<Character,Integer> e : map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }


        // sorted by value : 
        System.out.println("after sorting : ");
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list,Map.Entry.comparingByValue());

        LinkedHashMap<Character,Integer> linkedHashmap = new LinkedHashMap<>();

        for(Map.Entry<Character,Integer> e : list){
            linkedHashmap.put(e.getKey(), e.getValue());
        }


        // System.out.println(linkedHashmap);

        for(Map.Entry<Character,Integer> e : linkedHashmap.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        // the above portion of the code is for count frequency of each character and sort them accoeding to their value

        
        
    }
}
