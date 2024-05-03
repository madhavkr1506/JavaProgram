import java.util.*;
import java.io.*;

public class fileHandeling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str1 = sc.nextLine();
        File file = new File("text.txt");
        // try{
        //     FileWriter writer = new FileWriter(file,true);
        //     String text = sc.nextLine();
        //     writer.write(text);
        //     writer.close();
        // }catch(IOException e){
        //     System.out.println(e.getMessage());
        // }
        try{
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            String line;
            HashMap<String,Integer> map = new HashMap<>();
            while((line = br.readLine()) != null){

                String[] words = line.split(" ");
                for(int i=0;i<words.length;i++){
                    map.put(words[i],map.getOrDefault(words[i],0)+1);
                }

                
                // StringBuilder revString = new StringBuilder(line);
                // System.out.println(revString.reverse().toString());


                // String trimline = line.trim();
                // String cleanline = trimline.replaceAll("[^a-zA-Z\\s+]","");
                // System.out.println(cleanline);
                // String[] string = line.split(" ");
                // int array[] = new int[string.length];
                // for(int i=0;i<string.length;i++){
                //     array[i] = Integer.parseInt(string[i]);
                // }

                // Arrays.sort(array);
                // int maxEle = Arrays.stream(array).max().getAsInt();
                // System.out.println(maxEle);


            }

            // ArrayList<Map.Entry<String,Integer>> arrayList = new ArrayList<>(map.entrySet());
            // Collections.sort(arrayList,Map.Entry.comparingByValue());
                    
            // for(Map.Entry<String,Integer> e : arrayList){
            //     System.out.println(e.getKey()+" "+e.getValue());
            // }

            

            
            reader.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
