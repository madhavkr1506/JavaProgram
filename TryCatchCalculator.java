import java.util.Scanner;


class Error extends Exception{
    public String toString(){
        return "num1 is greater than 100 && num2 is greater than 100";
    }
    public String getMessage(){
        return "num1 > 100 && num2 > 100";
    }
}
class Calculator{
    public void addition(int num1,int num2) throws Exception{
        if(num1 >100 || num2 > 100 ){
            throw new IllegalAccessException();
        }
        System.out.println(num1 + num2);
    }
    public void subtraction(int num1,int num2) throws Exception{
        if(num1 < 0 && num2 < 0){
            throw new IllegalAccessException();
        }
        System.out.println(num1 - num2);
    }
    public void multiplication(int num1,int num2) throws Exception{
        if(num1 > 100 && num2 > 100){
            throw new Error();
        }
        System.out.println(num1 * num2);
    }
    public void division(float num1,float num2) throws ArithmeticException{
        if(num2 == 0){
            throw new ArithmeticException();
        }
        System.out.println(num1 / num2);
    }
}


public class TryCatchCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        Calculator c1 = new Calculator();
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 :
                try {
                    c1.addition(num1, num2);
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
                break;
            case 2 :
                try {
                    c1.subtraction(num1, num2);
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
                break;
            case 3 :
                try {
                    c1.multiplication(num1, num2);
                } catch (Exception e) {
                    System.out.println(e.toString());
                    System.out.println(e.getMessage());
                }
                break;
            case 4 :
                try {
                    c1.division((float) num1, (float)num2);
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
                break;
            default :
                System.exit(0);
        }
    }
}
