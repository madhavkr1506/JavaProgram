import java.util.*;
import java.io.*;

public class file5 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file name : ");
        String str1 = sc.nextLine();

        File file = new File(str1);

        if(file.exists()){
            System.out.println("Your file is here, you can write in it");
        }
        else{
            System.out.println("Sorry file is not here, you have to create file.");
            return;
        }

        try{
            System.out.println("Write in your file");
            String text = sc.nextLine();

            FileWriter write = new FileWriter(file,true);
            write.write(text);

            write.close();
            System.out.println("Content is written successfully.");

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        

        try{
            FileReader read = new FileReader(file);
            int word;
            while((word = read.read()) != -1){
                System.out.print((char)word);
            }
            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        sc.close();
        
    }
}
