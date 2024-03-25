import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class OddDates {

    public static void oddDates(LocalDate date1, LocalDate date2){
        LocalDate currentDate = date1;
        while(currentDate.isBefore(date2)){
            if(currentDate.getDayOfMonth() % 2 != 0){
                System.out.println(currentDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
            }
            currentDate = currentDate.plus(1,ChronoUnit.DAYS);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date1 = LocalDate.parse(str1,formatter);
        LocalDate date2 = LocalDate.parse(str2,formatter);

        oddDates(date1, date2);


        sc.close();
    }
}
