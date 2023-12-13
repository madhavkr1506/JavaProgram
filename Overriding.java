import java.util.Scanner;
class One{
    public void func1(){
        System.out.println("Hello this is function one of class one.");
    }
    public void func2(){
        System.out.println("Hello this is function two of class one.");
    }
}
class Two extends One{
    public void func2(){
        System.out.println("Hello this is function two of class two.");
    }
    public void func3(){
        System.out.println("Hello this is function three of class two.");
    }

}
public class Overriding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        One obj1 = new One();
//        obj1.func1();
//        obj1.func2();

//        Two obj2 = new Two();
//        obj2.func2();
//        obj2.func3();

        Two obj3 = new Two();
        obj3.func1();
//        obj3.func2();
    }
}
