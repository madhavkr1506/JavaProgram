import java.util.Scanner;

class Base{
    public Base(){
        System.out.println("This is a parent class constructor");
    }

    public Base(int a,int b){
        System.out.println("The sum of two number is : " + (a + b));
    }
    int num1;
    public int getNum1(){
        return num1;
    }
    public void setNum1(int num){
        this.num1=num;
    }
}

class Derived extends Base{

    public Derived(){
//        super(5,6);
        System.out.println("This is a child class constructor.");
    }

    public Derived(int x,int y){
        super(x,y);    //  IT will call the constructor from parent class which takes two variable.
        System.out.println("The product of two number is : " + (x * y));
    }
    int num2;
    public int getNum2(){
        return num2;
    }
    public void setNum2(int num){
        this.num2=num;
    }
}

class ChildDerived extends Derived{
    public ChildDerived(){
        System.out.println("This is a child Derived constructor.");
    }
    public ChildDerived(int a,int b,int c){
        super(a,b);  //  IT will call the constructor from parent class which takes two variable.
        System.out.println("The sum of three number is " + (a + b + c));
    }
}

public class InheritanceConstructor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Base object1 = new Base();
//        Derived object2 = new Derived(9,8);
        ChildDerived object3 = new ChildDerived(4,5,6);


//        Note : Constructor executes in top to bottom order.
    }
}
