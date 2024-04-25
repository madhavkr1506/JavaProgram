// import java.util.*;
import java.io.*;

public class filePractice {
    public static void main(String[] args) {
        File file = new File("file1.txt");

        // try{
        //     FileWriter writer = new FileWriter(file,true);
        //     writer.write("\nThis is Madhav Kumar");
        //     writer.close();
        // }catch(IOException e){
        //     System.out.println(e.getMessage());
        // }

        try{
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            String line;
            // int length = 0;
            // int newLength = 0;

            

            // int i;
            // while((i = reader.read()) != -1){
            //     // System.out.print((char)i);
            // }
            

            while((line = br.readLine()) != null){
                // System.out.println(line);
                // length = line.split("\\s+").length;
                // newLength += length;
                StringBuffer string = new StringBuffer();
                string.append(line).reverse().toString();
                System.out.println(string);
            }
            // System.out.println(newLength);
            reader.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
    }
}
