import java.util.Calendar;
import java.util.TimeZone;

public class CalendarClass {
    public static void main(String[] args) {
//        Note : Calendar class is an abstract class, we can not make instance of calendar class.
//        But, there is a method inside calendar class that give instance of calendar class.
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());

        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());


    }
}
