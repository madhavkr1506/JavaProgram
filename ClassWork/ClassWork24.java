package ClassWork;
import java.lang.Math;
import java.util.*;
public class ClassWork24 {
//    write a function to print factorial of a number

    public static int function1(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        else{
            return num * function1(num-1);
        }
    }

//    write a function to check whether number is prime or not

    public static void function2(int num){
        if(num < 2){
            System.out.println(num + " is not a prime number");
            return;
        }
        boolean found = true;
        for (int i=2;i<Math.sqrt(num);i++){
            if(num % i == 0){
                found = false;
                break;
            }
        }
        if(found){
            System.out.println(num + " is a prime number");
        }
        else{
            System.out.println(num + " is not a prime number");
        }
    }

//    write a function to check whether number is armstrong or not

    public static void function3(int num){
        int temp = num;
        int res = 0;
        int rem;
        int countDigit = power(num);

        while(num != 0){
            rem = num % 10;
            res += Math.pow(rem,countDigit);
            num /= 10;
        }
        if(res == temp){
            System.out.println(temp + " is an armstrong number");
        }
        else{
            System.out.println(temp + " is not an armstrong number");
        }
    }
    public static int power(int num){
        int count = 0;
        while(num != 0){
            num /= 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
//        System.out.println(function1(5));

//        function2(1);

        function3(372);
    }
}