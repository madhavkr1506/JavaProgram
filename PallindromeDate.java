import java.util.Scanner;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class PallindromeDate {

    public static boolean isPalindrome(LocalDate date){
        String obj1 = date.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        return obj1.equals(new StringBuilder(obj1).reverse().toString());


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate date1 = LocalDate.parse(str1,formatter);
        LocalDate date2 = LocalDate.parse(str2,formatter);

        int count = 0;

        while(date1.isBefore(date2) || date1.equals(date2)){
            if(isPalindrome(date1)){
                count++;
                System.out.println(date1.format(formatter));
            }
            date1 = date1.plusDays(1);
        }

        System.out.println(count);



        sc.close();
    }
}
