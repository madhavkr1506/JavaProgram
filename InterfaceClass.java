import java.util.Scanner;

interface Mathematics{
    void addition(int num1,int num2);
    void subtraction(int num1,int num2);
    void multiplication(int num1,int num2);
    void division(float num1,float num2);
}
interface BitwiseOperation{
    int number = 8;
    void andOperation(int num1, int num2);
}

class Calculation implements Mathematics,BitwiseOperation{
    Calculation(){
        System.out.println("This is a class that is responsible for calculation : ");
    }
    public void addition(int num1,int num2){
        System.out.println("The addition of "+num1+" + "+num2+" is "+(num1+num2));
    }
    public void subtraction(int num1,int num2){
        System.out.println("The subtraction of "+num1+" - "+num2+" is "+(num1-num2));
    }
    public void multiplication(int num1,int num2){
        System.out.println("The multiplication of "+num1+" * "+num2+" is "+(num1*num2));
    }
    public void division(float num1,float num2){
        System.out.println("The division of "+num1+" / "+num2+" is "+(num1/num2));
    }
    public void andOperation(int num1, int num2){
        System.out.println("Bitwise & operation of "+num1+" & "+num2+" is "+(num1 & num2));
    }

}

public class InterfaceClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculation object1 = new Calculation();
        object1.addition(5,6);
        object1.subtraction(5,6);
        object1.multiplication(5,6);
        object1.division(5.0f,6.0f);
        object1.andOperation(12,25);
        System.out.println("The number is : " + object1.number);
//        object1.number = 56;  ----> It will throw an error.

//        Note : we can create a class by implementing two or more interface.
//        Interface is a group of declared methods, and methods are not define inside interface.
//        We can create a class that extends parent class and also implement interface class.
//        Note : Multiple inheritance is not supported in java. So, a class can not be created by extending more than one parent class.
//        Note : we can also define properties in the interface and that cannot be modified inside main function.


    }
}
