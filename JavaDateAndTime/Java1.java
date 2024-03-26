import java.util.Scanner;
import java.time.format.DateTimeFormatter;
// import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
public class Java1{

    public static boolean PallindromeDate(LocalDate date){
        String object = date.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        return object.equals(new StringBuilder(object).reverse().toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        DateTimeFormatter object = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate date1 = LocalDate.parse(str1,object);
        LocalDate date2 = LocalDate.parse(str2,object);
        
        int count = 0;
        while (date1.isBefore(date2) || date1.equals(date2)) {
            if(PallindromeDate(date1)){
                count++;
                System.out.println(date1.format(object));
            }
            date1 = date1.plusDays(1);
        }
        System.out.println(count);



        


        sc.close();
    }

    
}