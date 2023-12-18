import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DateTimeFormatterJava {
    public static void main(String[] args) {
        LocalDateTime ld1 = LocalDateTime.now();
//        System.out.println(ld1);
        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E a H h k K W w Y d D m s");
        System.out.println(ld1.format(df1));
        
//        Y for year
//        W for week number in a month
//        w for week number in a year
//        K for hours in 0 - 11 format
//        k for hours in 1 - 24 format
//        H for hours in 0 - 23 format
//        h for hours in 1 - 12 format
//        a for am and pm
//        E for day of week
//        d for day of month
//        D for day of year
//        m for minutes
//        s for second

        DateTimeFormatter df4 = DateTimeFormatter.ofPattern("dd/MM/yyyy --h:m a");
        System.out.println(ld1.format(df4));

//        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        String myDate = ld1.format(df2);
//        System.out.println(myDate);

//        DateTimeFormatter df3 = DateTimeFormatter.ISO_LOCAL_DATE;
//        DateTimeFormatter df4 = DateTimeFormatter.BASIC_ISO_DATE;
//        DateTimeFormatter df5 = DateTimeFormatter.ISO_LOCAL_TIME;
//
//
//        String myDate2 = ld1.format(df5);
//        System.out.println(myDate2);

    }
}
