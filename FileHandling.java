
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {


//        Creating a file :

        File file1 = new File("File1.txt");
        try{
            file1.createNewFile();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

//        Writing a file :


        try {
            FileWriter file2 = new FileWriter("File1.txt");
            file2.write("Hello world this is madhav kumar.\nI am a student.");
            file2.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

//        Reading a file :


        try{
            Scanner scanner = new Scanner(file1);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

//        Deletion :

//        if(file1.delete()){
//            System.out.println("File is deleted.");
//            System.out.println(file1.getName());
//        }
//        else{
//            System.out.println("File is not deleted.");
//        }

        try{
            if(!file1.delete()){
                throw new Exception();
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
