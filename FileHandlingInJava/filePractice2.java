// import java.util.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class filePractice2 {
    public static void main(String[] args) {
        File file = new File("file1.txt");

        HashMap<String, Integer> map = new HashMap<>();
        try{
            FileReader read = new FileReader(file);
            BufferedReader br = new BufferedReader(read);
            
            String line;
            while((line = br.readLine()) != null){
                String[] words = line.split("\\s+");
                for(int i=0;i<words.length;i++){
                    map.put(words[i], map.getOrDefault(words[i] , 0) + 1);
                }
            }
            // System.out.println(map);

            for(Map.Entry<String,Integer> e : map.entrySet()){
                System.out.println(e.getKey()+" "+e.getValue());
            }
            read.close();

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
