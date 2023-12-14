import java.util.Scanner;

abstract class Pen{
    public abstract void write();
    public abstract void refill();
}
class FountainPen extends Pen{
    public void write(){
        System.out.println("Writing");
    }
    public void refill(){
        System.out.println("Refilling");
    }
    public void changeNib(){
        System.out.println("Changing nib");
    }
}

class Monkey{
    public void jump(){
        System.out.println("Jumping");
    }
    public void bite(){
        System.out.println("Biting");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    public void speak(){
        System.out.println("Speaking");
    }
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
}

public class AbstractClassPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Pen object1 = new FountainPen();
//        object1.write();
//        object1.refill();
//
//        FountainPen obj2 = new FountainPen();
//        obj2.changeNib();
//        obj2.refill();
//        obj2.write();

//        Human obj1 = new Human();
//        obj1.eat();
//        obj1.bite();
//        obj1.speak();

//        Monkey obj2 = new Monkey();
//        obj2.bite();
//        obj2.jump();


        // Polymorphism
        Monkey obj3 = new Human();
        obj3.jump();
        obj3.bite();
//        obj3.speek();  ---> It will throw an error.
//        obj3.eat();   ---> It will also throw an error.
        BasicAnimal obj1 = new Human();
        obj1.eat();
        obj1.sleep();
//        obj1.speek();   ---> It will throw an error.
    }
}
