import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
// import java.time.temporal.ChronoUnit;
import java.time.Period;
public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date1 = LocalDate.parse(str1,formatter);
        LocalDate date2 = LocalDate.parse(str2,formatter);

        // Long yearDiff = ChronoUnit.YEARS.between(date1,date2);
        // Long monthDiff = ChronoUnit.MONTHS.between(date1,date2);
        // Long dateDiff = ChronoUnit.DAYS.between(date1,date2);
        // Long weekDiff = ChronoUnit.WEEKS.between(date1, date2);

        Period period = Period.between(date1, date2);

        int yearDiff = period.getYears();
        int monthDiff = period.getMonths();
        int dateDiff = period.getDays();

        System.out.println(yearDiff+"-"+monthDiff+"-"+dateDiff);

        sc.close();
    }
}
