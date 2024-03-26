import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Java5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();

        LocalDate date1 = LocalDate.parse(str1,DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        System.out.println(date1.format(DateTimeFormatter.ofPattern("EEEE, dd MM yyyy")));

        System.out.println(date1.format(DateTimeFormatter.ofPattern("EEEE")).toUpperCase());

        // System.out.println(date1);

        sc.close();
    }
}
