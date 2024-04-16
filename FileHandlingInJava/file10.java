// write a java program that count frequency of each word in the text file

import java.io.*;
import java.util.*;

public class file10 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your file name : ");
        String str1 = sc.nextLine();

        File file = new File(str1);

        if(file.exists()){
            System.out.println("File existed");
        }
        else{
            System.out.println("You have to create a file");
            return;
        }

        HashMap<String, Integer> map = new HashMap<>();
        
        
        try{
            System.out.println("Reading your file : ");
            FileReader read = new FileReader(file);
            BufferedReader br = new BufferedReader(read);

            String line;
            while((line = br.readLine()) != null){

                String[] words = line.split("\\s+");
                for(int i=0;i<words.length;i++){
                    map.put(words[i],map.getOrDefault(words[i],0) + 1);
                }
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        // System.out.println(map);

        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        sc.close();

    }
}
