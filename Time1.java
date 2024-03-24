import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;


public class Time1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss a");

        try{
            Date time1 = formatter.parse(str1);
            Date time2 = formatter.parse(str2);
            
            Long difference = Math.abs(time1.getTime() - time2.getTime());

            Long hours = difference / (60 * 60 * 1000);
            Long minutes = (difference % (60 * 60 * 1000)) / (60 * 1000);
            Long second = ((difference % (60 * 60 * 1000)) % (60 * 1000)) / 1000;


            System.out.println(hours+" : "+minutes+" : "+second);
        }catch(ParseException e){
            System.out.println(e.getMessage());
        }


        sc.close();
        
    }
}



