import java.util.Scanner;

class Add{
    int num1=4;
    int num2=5;
    int num3=6;
    public void sumOfTwo(){
        int res1 = num1 + num2;
        System.out.println("The sum of two number is = " + res1);
    }
    public void sumOfThree(){
        int res2 = num1 + num2 + num3;
        System.out.println("The sum of three number is = " + res2);
    }
}
class Multiply extends Add{
    int num1=9;
    int num2=8;
    int num3=7;
    public void multiplyOfTwo(){
        int res1 = num1 *num2;
        System.out.println("The multiply of two number is = " + res1);
    }
    public void sumOfThree(){
        System.out.println("This is function overriding");
        int res2 = num1 * num2 * num3;
        System.out.println("The multiply of three number is = " + res2);
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Add obj1 = new Add();
//        obj1.sumOfTwo();
//        obj1.sumOfThree();

//        Multiply obj2 = new Multiply();
//        obj2.multiplyOfTwo();
//        obj2.sumOfThree();

//        Multiply obj2 = new Multiply();
//        obj2.sumOfTwo();
//        obj2.sumOfThree();

//        Multiply obj2 = new Add();   ---> It is not allowed.

        Add obj3 = new Multiply();    //   ----> It is allowed.
        obj3.sumOfThree();
//        obj3.multiplyOfTwo();    -----> This is Not allowed. because only Function with same name can Invoke.
        obj3.sumOfTwo();

//        It is also known as run time polymorphism or dynamic polymorphism.
//        It can be achieved by method overriding.
//        Upcasting :
//        Only reference of super class can refers to the object of subclass.
//        reference of subclass can not refer to the object of super class.

    }
}
