import java.util.Scanner;

public class Project2 {
    static class MyException extends Exception{
        public String toString(){
            return "The num1 and num2 values are zero";
        }
        public String getMessage(){
            return "The num1 = 0 and num2 = 0";
        }
    }
    public static void addition(int num1,int num2) throws Exception{
        if(num1 > 10 && num2 > 10){
            throw new MyException();
        }
        System.out.println("The sum is " + (num1 + num2));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            addition(11,11);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println(e);
        }
    }
}
