import java.io.*;

import java.util.*;

public class file2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file name : ");

        String str1 = sc.nextLine();

        File file = new File(str1);

        try{
            boolean iscreate = file.createNewFile();
            if(iscreate){
                System.out.println("New file is created");
            }
            else{
                System.out.println("File is already created");
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
