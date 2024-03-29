import java.util.Scanner;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;




public class Java10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime time1 = LocalTime.parse(str1,formatter);
        LocalTime time2 = LocalTime.parse(str2,formatter);

        Long hour = ChronoUnit.HOURS.between(time1, time2);
        Long minute = ChronoUnit.MINUTES.between(time1, time2) % 60;
        Long second = ChronoUnit.SECONDS.between(time1,time2) % 60;
        System.out.println(Math.abs(hour)+" : "+Math.abs(minute)+" : "+Math.abs(second));


        sc.close();
    }
}
