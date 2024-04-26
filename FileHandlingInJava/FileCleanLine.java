import java.io.*;

public class FileCleanLine {
    public static void main(String[] args) {
        File file = new File("fileclean.txt");

        try{
            FileReader read = new FileReader(file);
            BufferedReader br = new BufferedReader(read);

            String line;
            while((line = br.readLine()) != null){
                // System.out.println(line);
                String trimLine = line.trim();
                String cleanLine = trimLine.replaceAll("[^a-zA-Z\\s+]","");
                System.out.println(cleanLine);
            }
            read.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
