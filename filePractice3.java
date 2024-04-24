import java.io.*;

public class filePractice3 {

    public static void main(String[] args) {
        File file = new File("file1.txt");

        try{
            FileReader read = new FileReader(file);
            int i;
            int count = 0;
            while((i = read.read()) != -1){
                char ch = (char)i;
                if("aeiouAEIOU".indexOf(ch) != -1){
                    count++;
                }
            }
            System.out.println(count);
            read.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}