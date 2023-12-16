import java.util.Scanner;
import java.lang.Math;
class Hello1{
    public void function(float num1,float num2) throws ArithmeticException{
        if(num2 == 0){
            throw new ArithmeticException("The num2 value is 0.");
        }
        float res = num1/num2;
        System.out.println("Function one result = " + res);
    }
}


class MyException3 extends Exception{
    public String toString(){
        return "this is negative number";
    }
    public String getMessage(){
        return "This is a negative number.";
    }
}
class Hello2{
    public void function2(int radius) throws MyException3{
        if(radius < 0){
            throw new MyException3();
        }
        double res = Math.PI * radius * radius;
        System.out.println("the function two radius is " + res);
    }
}
public class ThrowThrows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        Hello1 h1 = new Hello1();
        try{
            h1.function(num1,num2);
        }
        catch (ArithmeticException e){
            System.out.println(e.toString());

        }

//        if (num2 == 0) {
//            try {
//
//                throw new ArithmeticException("Division by Zero.");
//
//            } catch (Exception e) {
//                System.out.println("There is an exception");
//                System.out.println(e);
//            }
//        }
//        else{
//            Hello1 h1 = new Hello1();
//            h1.function(num1, num2);
//        }

//        int radius =scanner.nextInt();
//
//        Hello2 h2 = new Hello2();
//        try {
//            h2.function2(radius);
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }

    }
}





