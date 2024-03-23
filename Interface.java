import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;



interface interface1{
    default void HelloFunxtion(){
        System.out.println("Hello World");
    }
    void calculateWeeks(String str1,String str2);

}


class JavaDate implements interface1{
    public void calculateWeeks(String str1, String str2){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date1 = LocalDate.parse(str1, formatter);
        LocalDate date2 = LocalDate.parse(str2, formatter);

        Long Weeks = ChronoUnit.WEEKS.between(date1, date2);

        System.out.println(Weeks);
    }

    public void randomfunction(){
        System.out.println("This is just a normal function of Class JavaDate");
    }

}

public class Interface {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        // JavaDate objj1 = new JavaDate();
        // objj1.calculateWeeks(str1, str2);
        // objj1.HelloFunxtion();
        // objj1.randomfunction();

        // interface1 int1 = new interface1() {
        //     public void HelloFunxtion(){
        //         System.out.println("Hello Madhav");
        //     }
        //     public void calculateWeeks(String str1, String str2){
        //         System.out.println("No More weeks calculation");
        //     }
        // };

        // int1.HelloFunxtion();
        // int1.calculateWeeks(str1,str2);



        interface1 int2 = new JavaDate();
        int2.HelloFunxtion();

        int2.calculateWeeks(str1, str2);

        // int2.randomfunction() //-->It will throw an error int2 is reference variable of interface1.


        

        

        sc.close();
        
    }
}
