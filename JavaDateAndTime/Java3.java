import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Java3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        LocalDate date1 = LocalDate.parse(str1,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate date2 = LocalDate.parse(str2,DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        Long YearDifference = ChronoUnit.YEARS.between(date1,date2);
        System.out.println(YearDifference);
        sc.close();
    }
}
