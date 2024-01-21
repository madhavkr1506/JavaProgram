package ClassWork;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class ClassWork9 {
    public static void main(String[] args) {
//        Way to create a file
        File my_file = new File("input1.txt");
        try{
            if(my_file.createNewFile()){
                System.out.println("File is created");
            }
            else{
                System.out.println("File already exists");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
//

//        Write into file

        try {
            FileWriter fileWriter = new FileWriter("input1.txt");
            fileWriter.write("My name is Madhav kumar");
            fileWriter.close();
            System.out.println("written successfully");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


//        reading to a file

        try{
            Scanner readFile = new Scanner(my_file);
            while (readFile.hasNextLine()){
                String string = readFile.nextLine();
                System.out.println(string);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


//        file details

        if(my_file.exists()){
            System.out.println("File name = " + my_file.getName());
            System.out.println("File path = " + my_file.getAbsolutePath());
            System.out.println("Can read = " + my_file.canRead());
            System.out.println("Can write = " + my_file.canWrite());
            System.out.println("Length = " + my_file.length());
        }
        else {
            System.out.println("File does not exists");
        }

//        way to delete a file

//        if(my_file.delete()){
//            System.out.println("File deleted successfully");
//        }
//        else{
//            System.out.println("File not deleted");
//        }



    }
}
