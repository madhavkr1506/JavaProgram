import java.util.Scanner;

class A{
    int a = 10;
    public int b = 11;
    protected int c = 12;
    private int d = 13;
    public void print(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);  //  ---> Note : Private member is accessible within same class.
    }
}
public class AccessModifiersClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        A a = new A();
//        a.print();
        System.out.println(a.a);
        System.out.println(a.b);
        System.out.println(a.c);
//        System.out.println(a.d);  ---> It will give an error because private member will not be accessible within same package
    }
}
