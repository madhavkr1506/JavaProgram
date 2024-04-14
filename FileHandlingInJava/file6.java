import java.util.*;
import java.io.*;


public class file6 {
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your file name : ");
        String str1 = sc.nextLine();
        File file = new File(str1);
        if(file.exists()){
            System.out.println("Your file is here, you can do your work");
        }
        else{
            System.out.println("Sorry your file is not here, you have to create one");
            return;
        }

        try{
            System.out.println("Write in your file : ");
            String text = sc.nextLine();
            FileWriter write = new FileWriter(file);
            write.write(text);
            write.close();
            System.out.println("You have successfully written in your file");

        }catch(IOException e){
            System.out.println(e.getMessage());
        }


        try{
            System.out.println("\n\n\n\nReading your file : ");
            FileReader read = new FileReader(file);
            BufferedReader br = new BufferedReader(read);
            String line;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
            read.close();

        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
