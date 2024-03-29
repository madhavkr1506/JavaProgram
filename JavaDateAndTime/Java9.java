import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;



public class Java9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        SimpleDateFormat  format = new SimpleDateFormat("hh:mm:ss a");

        try{
            Date time1 = format.parse(str1);
            Date time2 = format.parse(str2);

            Long result = Math.abs(time1.getTime() - time2.getTime());

            Long hour = result / (60*60*1000);
            Long minute = (result % (60*60*1000)) / (60*1000);
            Long second = ((result % (60*60*1000)) % (60*1000)) / 1000;

            System.out.println(hour+" : "+minute+" : "+second);
        }
        catch(ParseException e){
            System.out.println(e.getMessage());
        }



        sc.close();
    }
}
