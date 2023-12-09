
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();


//        int factorial = 1;
//        for(int i=1;i<=num;i++){
//            factorial *= i;
//        }
//        System.out.println(factorial);


        factorial(num);

    }
    static void factorial(int num){
        int i=1;
        int fact=1;
        while(i<=num){
            fact*=i;
            i++;
        }
        System.out.println(fact);
    }
}
