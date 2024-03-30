
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

import java.time.LocalDate;
public class Java12 {

    public static boolean pallindrome(LocalDate date){
        String obj1 = date.format(DateTimeFormatter.ofPattern("ddMMyyyy"));
        return obj1.equals(new StringBuilder(obj1).reverse().toString());
    }


    public static void oddDates(LocalDate date1,LocalDate date2){
        LocalDate temp = date1;

        while(temp.isBefore(date2) || temp.equals(date2)){
            if(temp.getDayOfMonth() % 2 != 0){
                System.out.println(temp.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
            }
            temp = temp.plusDays(1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date1 = LocalDate.parse(str1,formatter);
        LocalDate date2 = LocalDate.parse(str2,formatter);

        // System.out.println(date1.format(DateTimeFormatter.ofPattern("EEEE")));

        // System.out.println(date1.getDayOfWeek());

        // while(date1.isBefore(date2) || date1.equals(date2)){
        //     if(pallindrome(date1)){
        //         System.out.println(date1.format(formatter));
        //     }
        //     date1 = date1.plusDays(1);
        // }

        // oddDates(date1, date2);

        LocalDate temp = date1;

        while(temp.isBefore(date2) || temp.equals(date2)){
            if(temp.getDayOfWeek().getValue() == 6 || temp.getDayOfWeek().getValue() == 7){
                System.out.println(temp.format(formatter));
            }
            temp = temp.plusDays(1);
        }

        sc.close();

    }
}
