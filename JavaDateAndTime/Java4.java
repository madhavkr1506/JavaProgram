import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Java4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();

        LocalDate date1 = LocalDate.parse(str1,DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        int datetoAdd = sc.nextInt();

        LocalDate date2 = date1.plus(datetoAdd,ChronoUnit.DAYS);

        System.out.println(date2.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));


        sc.close();
    }
}
