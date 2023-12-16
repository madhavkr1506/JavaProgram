import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
//        int res = num1/num2;
//        System.out.println("The result is " + res);   // ---> When :  num2 is 0 then it will generate an arithmetic exception.

        try{
            int res = num1/num2;
            System.out.println("The result is " + res);
        }
        catch (Exception e){
            System.out.println("Sorry ! but you are dividing it with zero.");
            System.out.println(e);
        }

    }
}
