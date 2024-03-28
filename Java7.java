import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Java7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date1 = LocalDate.parse(str1,formatter);
        LocalDate date2 = LocalDate.parse(str2,formatter);

        // Long weekends = 0L;

        // LocalDate temp = date1;

        // while(temp.isBefore(date2)){
        //     if(temp.getDayOfWeek().getValue() == 6 || temp.getDayOfWeek().getValue() == 7){
        //         weekends++;
        //     }
        //     temp = temp.plus(1,ChronoUnit.DAYS);
        // }

        Long days = ChronoUnit.DAYS.between(date1, date2);
        Long weeks = days / 7;
        Long extraday = days % 7;

        Long weekends = (weeks * 2) + extraday;
        System.out.println(weekends);

        sc.close();

    }
}
