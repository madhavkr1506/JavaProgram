import java.io.*;
import java.util.*;

public class file1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String str1 = sc.nextLine();

        File file = new File(str1);

        try {
            boolean created = file.createNewFile();
            if(created){
                System.out.println("Successfully created file");
            }
            else{
                System.out.println("Error: file is not created");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        

        sc.close();
    }
}