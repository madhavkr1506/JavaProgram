import java.util.*;
import java.io.*;

public class file13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File("file1.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while((line = br.readLine()) != null){
                StringBuffer str = new StringBuffer();
                str.append(line).reverse().toString();
                System.out.println(str);
            }


        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
