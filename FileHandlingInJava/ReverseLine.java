import java.io.*;

public class ReverseLine {
    public static void main(String[] args) {
        File file = new File("reverseline.txt");

        try{
            FileReader read = new FileReader(file);
            BufferedReader br = new BufferedReader(read);
            String line;
            while((line = br.readLine())!=null){
                StringBuffer string = new StringBuffer();
                string.append(line).reverse().toString();
                System.out.println(string);
            }
            read.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
