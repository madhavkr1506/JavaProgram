import java.util.Scanner;

public class MethodOverloading {
    static void change(int a){
        a=100;
    }
    static void change2(int[] array){
        array[0]=100;
    }

    static void hello(){
        System.out.println("I am an iron man");
    }
    static void hello(int a){
        System.out.println("I love you "+a+" times");
    }

    static void hello(int a,char c){
        System.out.println("ASCII value of "+c+" is "+a);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // not change in the value of a
//        int a=10;
//        change(a);
//        System.out.println("value of a = " + a);


//        change in the value of array[0] : here we are passing the reference of an array, same is the case for object is passing to the method.
//        int[] array1={1,2,3,4,5,6,7};
//        change2(array1);
//        System.out.println("value of array1[0] = " + array1[0]);

        hello();
        hello(3000);
        hello(65,'A');

//        Method overloading is not perform by changing the return type.

    }
}
