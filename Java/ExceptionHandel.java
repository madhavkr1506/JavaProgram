import java.util.*;

class ZeroDivisionException extends Exception{
    public ZeroDivisionException(){
        super("num2 == 0");
    }
}
class InvalidInputException extends Exception{
    public InvalidInputException(){
        super("It is not a number");
    }
}
public class ExceptionHandel {

    public static void Division(double num1, double num2) throws InvalidInputException{
        if((num1 % 1 != 0) || (num2 % 1 != 0)){
            throw new InvalidInputException();
        }
        else{
            System.out.println("result = " + (num1/num2));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        try{
            
            Division(num1, num2);
        }catch(InvalidInputException e){
            System.out.println("Invalid input. Please enter a number.");
        }
        sc.close();
    }
}
