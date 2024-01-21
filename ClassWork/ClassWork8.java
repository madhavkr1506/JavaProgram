// Note : Abstract class
package ClassWork;

abstract class Shape{ // --> we can have an abstract class without any abstract method.
//    we can define static method inside an abstract class.
//    there can be a final method in abstract class but any abstract method in the class(abstract class) can not be declared as final.
    int variable;
    abstract void printStatement();
    Shape(){
        System.out.println("this is constructor of an abstract class");  // --> Constructors are allowed.
    }

    void WithoutAbstract(){
        System.out.println("this is not an abstract method");
    }
    public static void WithoutInstance(){
        System.out.println("we can access this method without instance");
    }

//    if a class contains at least one abstract method then compulsory should declare a class as abstract.
//    if a child class unable to provide implementation to all abstract methods of the parent class then we should declare that child class as abstract class so that the next level child class should provide implementation to the remaining abstract method.
}

class ShapeSubClass extends Shape{
    void printStatement(){
        System.out.println("this is a print statement inside ShapeSubClass");
    }
    static void WithoutInstanceSubClass(){
        System.out.println("this is in ShapeSubClass, you can access it without instance.");
    }
}

public class ClassWork8 {
    public static void main(String[] args) {
//        Shape obj1 = new Shape(); //-->  An instance of an abstract class can not be created.

        ShapeSubClass obj1 =new ShapeSubClass();
        obj1.printStatement();

        obj1.WithoutAbstract();

        Shape.WithoutInstance(); // --> Static methods belong to the class itself rather than to instance of the class.

        ShapeSubClass.WithoutInstanceSubClass();
        ShapeSubClass.WithoutInstance();
        // --> Static methods belong to the class itself rather than to instance of the class.

        obj1.WithoutInstance(); // --> calling a static method using the instance 

    }
}
