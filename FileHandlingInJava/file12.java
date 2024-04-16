import java.io.*;
import java.util.*;

public class file12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = "file1.txt";
        File file = new File(str1);

        try{
            FileReader read = new FileReader(file);
            int i;
            int countVowel = 0;
            while((i = read.read()) != -1){
                // System.out.print((char)i);

                char ch = (char)i;
                if("aeiou".indexOf(ch) != -1){
                    countVowel++;
                }
            }
            System.out.println(countVowel);
            read.close();


        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
