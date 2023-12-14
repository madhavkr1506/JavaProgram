import java.util.Scanner;
abstract class Parent1{
    Parent1(){
        System.out.println("Hello this is constructor of parent class (abstract).");
    }
    public void Message(){
        System.out.println("Today is Thursday.");
    }
    abstract public void hello();
}
class Child1 extends Parent1{
    public Child1(){
        System.out.println("This is constructor of child class.");
    }
    public void hello(){
        System.out.println("Hello earth! I am an Alien.");
    }
}
abstract class SubChild extends Parent1{
    @Override
    public void hello() {
        System.out.println("Hello good Evening.");
    }
    SubChild(){
        System.out.println("I am constructor of Sub child class.");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Child1 object1 = new Child1();

//        object1.hello();
//        Parent object2 = new Parent(); ----> Parent is an abstract class, and it cannot be instantiated.
//        SubChild object3 = new SubChild(); ----> It will show an error.


    }
}
