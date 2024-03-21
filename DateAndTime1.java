import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class DateAndTime1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate date1 = LocalDate.parse(str1,formatter);
        LocalDate date2 = LocalDate.parse(str2,formatter);

        Long YearBetween = ChronoUnit.MONTHS.between(date1, date2);

        System.out.println(YearBetween);

        sc.close();

    }
}