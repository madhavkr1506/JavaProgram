import java.util.Scanner;


class Math{
    Math(){
        System.out.println("This is a Math class constructor.\nThis is a parent class.");
    }
    int radius;
    int height;
    public int getHeight(){
        return height;
    }
//    public void setHeight(int h){
//        this.height=h;
//    }
    public int getRadius(){
        return radius;
    }
//    public void setRadius(int r){
//        this.radius=r;
//    }

    Math(int x,int y){
        this.radius=x; //  It is used to invoke current class constructor and method.
        this.height=y;
    }
}

class Circle extends Math{
    Circle(){
        System.out.println("This is a circle class constructor.\nThis is a child class constructor.");
    }
    public Circle(int radius,int height){
        super(radius,height);       //  It is used to invoke parent class method.
        System.out.println("The area of a circle is " + (3.14 *radius * radius));
    }
}

class Cylinder extends Circle{
    Cylinder(){
        System.out.println("This is a cylinder class constructor.\nThis is a subChild class constructor.");
    }
    public Cylinder(int radii,int heig){
        super(radii,heig);
        System.out.println("The area of a cylinder is " + (3.14*radii*radii*heig));
    }
}
public class ThisSuper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rad = scanner.nextInt();
        int hei = scanner.nextInt();
        Cylinder object1 = new Cylinder(rad,hei);
        System.out.println(object1.getHeight());
        System.out.println(object1.getRadius());


//        Math Check = new Math();
//        System.out.println(Check.getHeight());
//        System.out.println(Check.getRadius());



    }
}
