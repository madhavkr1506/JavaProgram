import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time {
    public static void main(String[] args) {
        LocalTime lt1 = LocalTime.now();
        System.out.println(lt1);
        LocalDate ld1 = LocalDate.now();
        System.out.println(ld1);
        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println(ldt1);
    }
}
