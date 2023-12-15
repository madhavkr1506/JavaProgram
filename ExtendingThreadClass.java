import javax.imageio.ImageReader;
import java.util.Scanner;

class Earth extends Thread{
    public void function1(int a){
        System.out.println("The value of a is " + a);
    }
    @Override
    public void run(){
        function1(10);
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

    }
}
