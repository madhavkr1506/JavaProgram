import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();

//        1 : first approach

//        if(num2 == 100){
//            try{
//                throw new ArithmeticException();
//            }
//            catch (Exception e){
//                System.out.println(e.toString());
//            }
//            finally {
//                System.out.println("Program ended.");
//            }
//        }
//        else{
//            System.out.println("num1 X num2 = " + (num1 * num2));
//        }

//        2 : second approach
        
        try{
            if(num2 == 100){
                try{
                    throw new ArithmeticException();
                }
                catch (Exception e){
                    System.out.println(e.toString());
                }
                finally {
                    System.out.println("Program two ended.");
                }
            }
            else{
                System.out.println("num1 X num2 = " + (num1 * num2));
            }
        }
        finally {
            System.out.println("Program one  ended.");
        }
    }
}
