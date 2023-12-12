import java.util.Scanner;

class parent{
    int num1;
    public int getNum1(){
        return num1;
    }
    public void setNum1(int num){
        System.out.println("I am parent class setting the value of num1");
        this.num1=num;
    }
}


class child extends parent{
    int num2;
    public int getNum2(){
        return num2;
    }
    public void setNum2(int num){
        System.out.println("I am child class setting value of num2.");
        this.num2=num;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        child object1 = new child();
        object1.setNum2(5);
        System.out.println(object1.getNum2());
        object1.setNum1(10);
        System.out.println(object1.getNum1());

        // Note : Multiple Inheritance is not supported in java.
    }
}
