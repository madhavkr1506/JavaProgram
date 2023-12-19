
@FunctionalInterface
interface Method1{
//    void function1();
    void function1(int a);
}
//class Jupiter1 implements Method1{
//    public void function1(){
//        System.out.println("This is function one.");
//    }
//    public void function2(){
//        System.out.println("This is function two.");
//    }
//}

public class AnonymousAndLambda {
    public static void main(String[] args) {
//        Jupiter1 obj1 = new Jupiter1();
//        obj1.function1();
//        obj1.function2();

//        Method1 obj2 = new Jupiter1();
//        obj2.function1();
//        obj2.function2(); // --> this will throw an error.


//        Anonymous class :
//        Anonymous classes enable you to make your code more concise.
//        They enable you to declare and instantiate a class at the same time.
//        They are like local classes except that they do not have a name.
//        Use them if you need to use a local class only once.


//        Method1 obj3 = new Method1() {
//            @Override
//            public void function1() {
//                System.out.println("This is an anonymous class.");
//            }
//        };
//        obj3.function1();


//        Lambda Expression :

//        Method1 obj2 = new Jupiter1();
//        obj2.function1();
//        obj2.function2(); // --> this will throw an error.

        Method1 obj3 = (a)->{
            System.out.println("This is Madhav Kumar lambda expression. " + a);
        };
        obj3.function1(5);


    }
}
