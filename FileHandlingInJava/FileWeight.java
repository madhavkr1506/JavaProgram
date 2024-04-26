import java.io.*;
import java.util.*;

public class FileWeight {

    public static void main(String[] args) {
        File file = new File("weight.txt");
        int[] numArray = {};

        try{
            FileReader read = new FileReader(file);
            BufferedReader br = new BufferedReader(read);
            String line;
            
            while((line = br.readLine()) != null){
                // System.out.println(line);
                String cleanline = line.replaceAll("[^0-9\\s+]","");
                System.out.println(cleanline);
                String[] nums = cleanline.split("\\s+");

                numArray = new int[nums.length];
                int index = 0;
                for(String x : nums){
                    numArray[index++] = Integer.parseInt(x);
                }

                Arrays.sort(numArray);

                int maximumEle = Arrays.stream(numArray).max().getAsInt();
                System.out.println(maximumEle);
                int minimumEle = Arrays.stream(numArray).min().getAsInt();
                System.out.println(minimumEle);

            }
            read.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        // for(int i : numArray){
        //     System.out.println(i);
        // }
    }
}