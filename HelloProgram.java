// Naming convention

// PascalNamingConvention = use for classes
// camelCaseConvention = use for functions

import java.util.Scanner;
public class HelloProgram {
    public static int addition(int a ,int b){
        return a+b;
    }
    public static int subtraction(int a,int b){
        return a-b;
    }
    public static int multiplication(int a,int b){
        return a*b;
    }
    public static int division(int a,int b){
        return a/b;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int num1=scanner.nextInt();
        System.out.print("Enter second number = ");
        int num2=scanner.nextInt();

        while (true) {
            int option=scanner.nextInt();
            switch (option) {
                case 1:
                    int sum = addition(num1, num2);
                    System.out.println("addition is = " + sum);
                    break;
                case 2:
                    int subtract = subtraction(num1, num2);
                    System.out.println("subtraction is = " + subtract);
                    break;
                case 3:
                    int multiply = multiplication(num1, num2);
                    System.out.println("multiplication is = " + multiply);
                    break;
                case 4:
                    int division = division(num1, num2);
                    System.out.println("divison is = " + division);
                    break;
                default :
                    System.exit(0);
            }
        }
        /*scanner.close()*/
    }
}