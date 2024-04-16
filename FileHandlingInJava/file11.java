// write a java program to count number of words in a file

import java.util.*;
import java.io.*;

public class file11{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of file : ");

        String str1 = sc.nextLine();
        File file = new File(str1);
        if(file.exists()){
            System.out.println("File exists");
        }
        else{
            System.out.println("You have to create a new file");
            return;
        }

        try{
            System.out.println("Reading file : ");
            FileReader read = new FileReader(file);
            BufferedReader br = new BufferedReader(read);
            String line;
            int count = 0;
            int newCount = 0;
            while((line = br.readLine()) != null){
                count = line.split("\\s+").length;
                newCount+=count;
            }

            System.out.println("total number of words in text file : " + newCount);
            read.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}