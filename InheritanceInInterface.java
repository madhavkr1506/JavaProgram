import java.util.Scanner;

interface parent_interface{
    void hello1();
    void hello2();
}
interface child_interface extends parent_interface{
    void hello3();
    void hello4();
}
class Greeting implements child_interface{
    public void hello1(){
        System.out.println("This is hello one.");
    }
    public void hello2(){
        System.out.println("This is hello two.");
    }
    public void hello3(){
        System.out.println("This is hello three.");
    }
    public void hello4(){
        System.out.println("This is hello four.");
    }
}
public class InheritanceInInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Greeting obj1 = new Greeting();
        obj1.hello1();
        obj1.hello2();
        obj1.hello3();
        obj1.hello4();
    }
}
