// write a program to check whether a number is strong number of not

import java.util.Scanner;

public class Array30 {
    public static int factorial(int num){
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
    public static void strongnumber(int num){
        int temp = num;
        int res = 0;
        while(num != 0){
            int rem = num % 10;
            res += factorial(rem);
            num /= 10;
        }
        if(res == temp){
            System.out.println(temp+" is a strong number");
        }
        else{
            System.out.println(temp+" is not a strong number");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        strongnumber(num);

        // System.out.println(factorial(num));
        scanner.close();
    }
}
