import java.util.*;
import java.io.*;



public class file9 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your file name : ");
        String str1 = sc.nextLine();

        File file = new File(str1);

        if(file.exists()){
            System.out.println("File exists");
        }
        else{
            System.out.println("You have to create a new a file");
            return;
        }

        try{
            System.out.println("Reading file : ");
            FileReader read = new FileReader(file);
            BufferedReader br = new BufferedReader(read);
            String line;
            while((line = br.readLine()) != null){
                // System.out.println(line);

                // code to count no of word in a text file.
                
                int count = line.split("\\s+").length;
                System.out.println(count);
            }
            read.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
