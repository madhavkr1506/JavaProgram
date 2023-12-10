import java.util.Scanner;

public class Recursion {

//    this is recursive approach
//    static int factorial(int num){
//        if(num == 0 || num == 1){
//            return 1;
//        }
//        else{
//            return num* factorial(num - 1);
//        }
//    }

//    this is iterative approach
    static int factorial(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        else{
            int fact = 1;
            int i = 1;
            while(i<=num){
                fact=fact * i;
                i++;
            }
            return fact;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(factorial(6));

    }
}
