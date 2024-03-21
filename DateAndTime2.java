import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class DateAndTime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first date = ");
        String str1 = sc.nextLine();
        System.out.println("Enter second date = ");
        String str2 = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        LocalDate date1 = LocalDate.parse(str1, formatter);
        LocalDate date2 = LocalDate.parse(str2, formatter);

        Long DaysDifference = ChronoUnit.DAYS.between(date1,date2);
        System.out.println("Days difference : ");
        System.out.println(DaysDifference);


        sc.close();
    }
}
