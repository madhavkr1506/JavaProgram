import javax.imageio.ImageReader;
import java.util.Scanner;

class Earth extends Thread{
    public void function1(int a){
        System.out.println("The value of a is " + a);
    }
    public void addition(int num1,int num2){
        System.out.println("the addition of "+num1+" + "+num2+" is "+(num1+num2));
    }
    @Override
    public void run(){
        function1(10);
        addition(8,9);
    }
}
class Mars extends Thread{
    public void function2(int a){
        System.out.println("This is function overriding");
        System.out.println("The value of b is " + a);
    }
    @Override
    public void run(){
        function2(20);
    }
}

public class ExtendingThreadClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Earth obj1 = new Earth();
        Mars obj2 = new Mars();
        obj1.start();
        obj2.start();
        obj1.addition(6,5);
//        obj1.run();

    }
}
