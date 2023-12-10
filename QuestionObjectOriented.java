import java.util.Scanner;

class Employee{
    int id;
    int salary;
    String name;
    int printSalary(){
        return salary;
    }
    String printName(){
        return name;
    }

    void setname(String myName){
        name = myName;
        System.out.println("My new name is " + name);
    }
}


class Square{
    int side;
    void area(){
        System.out.println("Area of the square is "+side * side);
    }
    void perimeter(){
        System.out.println("Perimeter of the square is " + 4 * side);
    }
}

public class QuestionObjectOriented {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Employee object1 = new Employee();

        int a=object1.id=12213356;
        int b=object1.salary=56100;
        String c=object1.name="Madhav kumar";
        System.out.println("Employee 1 ");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
//        object1.setname("Kishan kumar");
        System.out.println(object1.printName());

         */

        Square object1 = new Square();
        object1.side=6;
        object1.area();
        object1.perimeter();



    }

}
