import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return "I am String.";
    }
    public String getMessage(){
        return "I am message.";
    }
}

class MyException2 extends Exception{
    public String toString(){
        return "This is an Exception.";
    }
}

public class ExceptionClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
//        if(num < 9){
//            try{
//                throw new MyException();
//            }
//            catch (Exception e){
//                System.out.println(e.getMessage());
//                System.out.println(e.toString());
//                System.out.println(e);
//                e.printStackTrace();
//            }
//        }
        if(num < 9){
            try{
//                throw new MyException2();
                throw new ArithmeticException("This is an arithmetic exception.");
            }
            catch (ArithmeticException A){
                System.out.println("This is an example of arithmetic exception handling outside function.");
                System.out.println(A);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
            }

        }
    }
}
