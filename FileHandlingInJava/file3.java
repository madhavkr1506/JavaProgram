import java.util.*;
import java.io.*;

public class file3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file name : ");
        String str1 = sc.nextLine();

        File file = new File(str1);

        if(file.exists()){
            System.out.println("File existed");
        }
        else{
            System.out.println("No such file existed");
        }
        try{
            FileWriter write = new FileWriter(file);
            write.write("Hello World\nThis is Madhav Kumar!");
            System.out.println("Content written successfully");
            write.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        sc.close();

    }
}
