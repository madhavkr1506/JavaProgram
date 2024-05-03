import java.util.Scanner;
// import java.time.LocalTime;
// import java.time.format.DateTimeFormatter;
// import java.time.temporal.ChronoUnit;
// import java.time.Period;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");

        // LocalTime time1 = LocalTime.parse(str1,formatter);
        // LocalTime time2 = LocalTime.parse(str2,formatter);

        // Long HourDiff = ChronoUnit.HOURS.between(time1, time2);
        // Long MinDiff = ChronoUnit.MINUTES.between(time1, time2)%60;
        // Long SecDiff = ChronoUnit.SECONDS.between(time1, time2)%60;

        

        // System.out.println(Math.abs(HourDiff)+":"+Math.abs(MinDiff)+":"+Math.abs(SecDiff));

        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss a");
        
        try{
            Date time1 = formatter.parse(str1);
            Date time2 = formatter.parse(str2);
            Long result = Math.abs(time1.getTime() - time2.getTime());

            long hours = result / (60 * 60 * 1000);
            long minutes = (result % (60 * 60 * 1000)) / (60 * 1000);
            long seconds = ((result % (60 * 60 * 100)) % (60 * 1000)) / 1000;

            System.out.println(hours+":"+minutes+":"+seconds);

        }catch(ParseException e){
            System.out.println(e.getMessage());
        }


        sc.close();
    }
}
