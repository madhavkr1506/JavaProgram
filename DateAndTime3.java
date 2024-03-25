import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
// import java.time.temporal.ChronoUnit;

public class DateAndTime3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date1 = LocalDate.parse(str1,formatter);
        System.out.println(date1.plusDays(5).format(formatter));
        sc.close();
    }
}
