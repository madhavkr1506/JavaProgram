import java.util.*;
import java.util.Date;
import java.time.DateTimeException;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.Period;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Practice1{

    public static boolean PalindromeDate(LocalDate date1){
        String date = date1.format(DateTimeFormatter.ofPattern("ddMMyyyy"));
        return date.equals(new StringBuilder(date).reverse().toString());
    }


    public static void Odddate(LocalDate date1,LocalDate date2){
        LocalDate temp = date1;
        while(temp.isBefore(date2) || temp.equals(date2)){
            if(temp.getDayOfMonth() % 2 != 0){
                System.out.println(temp.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
            }
            temp = temp.plus(1,ChronoUnit.DAYS);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // write a program to find palindrome date between two date : 

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date1 = LocalDate.parse(str1,format);
        LocalDate date2 = LocalDate.parse(str2,format);

        // Long Yeardifference = ChronoUnit.YEARS.between(date1,date2);
        // System.out.println(Yeardifference);

        
        // while(date1.isBefore(date2) || date1.equals(date2)){
        //     if(PalindromeDate(date1)){
        //         System.out.println(date1.format(format));
        //     }
        //     date1 = date1.plus(1,ChronoUnit.DAYS);
        // }

        // write a program to print odd date

            Odddate(date1, date2);

        sc.close();
    }
}