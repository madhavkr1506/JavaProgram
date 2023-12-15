import java.util.Scanner;

class open implements Runnable{
    public void function1(int num1 ,int num2){
        System.out.println("The sum of "+num1+" and "+num2+" is " + (num1+num2));
    }
    public void run(){
        function1(3,4);
        function1(3,4);
        function1(3,4);
        function1(3,4);
        function1(3,4);
        function1(3,4);
        function1(3,4);
        function1(3,4);
        function1(3,4);
        function1(3,4);

    }
}
class close implements Runnable{
    public void function2(int num1,int num2){
        System.out.println("The & operation in between "+num1+" and "+num2+" is " + (num1 & num2));
    }
    public void run(){
        function2(12,8);
        function2(12,8);
        function2(12,8);
        function2(12,8);
        function2(12,8);
        function2(12,8);
        function2(12,8);
        function2(12,8);
        function2(12,8);

    }
}


public class ImplementRunnableThread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        open obj1 = new open();
        Thread th1 = new Thread(obj1);
        th1.start();
        close obj2 = new close();
        Thread th2 = new Thread(obj2);
        th2.start();
    }
}
