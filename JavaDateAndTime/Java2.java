import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Java2 {

    public static void printoddDates(LocalDate date1, LocalDate date2){
        LocalDate object = date1;
        while(object.isBefore(date2) || object.equals(date2)){
            if(object.getDayOfMonth() % 2 != 0){
                System.out.println(object.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            }
            object = object.plus(1,ChronoUnit.DAYS);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        LocalDate date1 = LocalDate.parse(str1,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate date2 = LocalDate.parse(str2,DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        printoddDates(date1, date2);



        sc.close();
    }
}
