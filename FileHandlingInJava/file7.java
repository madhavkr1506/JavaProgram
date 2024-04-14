// write a program to print clean text form file.

import java.util.*;
import java.io.*;

public class file7 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input file name : ");
        String str1 = sc.nextLine();
        File file = new File(str1);

        if(file.exists()){
            System.out.println("Your file exists");
        }
        else{
            System.out.println("You have to create a new file");
            return;
        }

        try{
            FileReader read = new FileReader(file);
            BufferedReader br = new BufferedReader(read);
            String line;
            while((line = br.readLine()) != null){
                String cleanLine = line.replaceAll("[^a-zA-Z0-9\\s]","");
                System.out.println(cleanLine);
            }
            read.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
