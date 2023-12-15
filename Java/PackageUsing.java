import madhav.Hello;
import madhav.HelloEarth;

class A extends HelloEarth{
    void print(){
        // System.out.println(a);   //  ----> It will throw an error
        System.out.println(b);
    }
}
public class PackageUsing {
    public static void main(String[] args) {
        System.out.println("I am using Package.");
        // Hello h = new Hello();
        // HelloEarth he = new HelloEarth();
        A obj1 = new A();
        obj1.print();
    }
}
