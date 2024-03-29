import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Java11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        // String str2 = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime time1 = LocalTime.parse(str1,formatter);

        System.out.println(time1.plus(2,ChronoUnit.HOURS).format(formatter));


        sc.close();
    }
}
