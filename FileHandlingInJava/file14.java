import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
// import java.time.temporal.ChronoUnit;
// import java.time.Period;


public class file14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        File file = new File("Date.txt");

        String date = "18-06-2004";
        LocalDate date2 = LocalDate.parse(date,DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        
        try{
            FileWriter write = new FileWriter(file);
            write.write("21-06-2004");
            write.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        try{
            FileReader read = new FileReader(file);
            int word;
            StringBuffer string = new StringBuffer();
            while((word = read.read()) != -1){
                // System.out.print((char)word);
                string.append((char)word).toString();
            }
            LocalDate date1 = LocalDate.parse(string,DateTimeFormatter.ofPattern("dd-MM-yyyy"));

            if(date1.isBefore(date2)){
                System.out.println("Event");
            }
            else{
                System.out.println("No Event");
            }
            read.close();
            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}