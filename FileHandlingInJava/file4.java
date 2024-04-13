import java.util.*;
import java.io.*;


public class file4 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name : ");
        String str1 = sc.nextLine();
        File file = new File(str1);

        if(file.exists()){
            System.out.println("Your file is here, you can do your work.");
        }
        else{
            System.out.println("Sorry file is not there. you have to create first.");
            return;
        }

        try{

            System.out.println("What you want to Write in your file : ");
            String text = sc.nextLine();
            FileWriter write = new FileWriter(file);
            write.write(text);
            write.close();
            System.out.println("Congratulation! Everything saved successfully");

        }catch(IOException e){
            System.out.println(e.getMessage());
        }



        sc.close();
    }
}
