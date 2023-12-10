//import java.util.Scanner;

public class VariableArguments {

//    static int addNumbers(int a,int b){
//        return a+b;
//    }
    static  int addNumbers(int ...array){
        int result=0;
        for(int element : array){
            result+=element;
        }
        return result;
    }
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int a=10;
//        int b=19;
//        int c=addNumbers(a,b);
//        System.out.println("the sum of 10 and 19 is = "+c);

//        varargs

        System.out.println("The sum is "+addNumbers());
        System.out.println("The sum is "+addNumbers(2,3));
        System.out.println("The sum is "+addNumbers(2,3,4));
        System.out.println("The sum is "+addNumbers(2,3,4,5));

    }
}
