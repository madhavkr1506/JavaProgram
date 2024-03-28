import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Java8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date1 = LocalDate.parse(str1,formatter);
        LocalDate date2 = LocalDate.parse(str2,formatter);

        Period period = Period.between(date1, date2);

        int year = period.getYears();
        int month = period.getMonths();
        int day = period.getDays();

        System.out.println(year+"-"+month+"-"+day);


        sc.close();
    }
}
