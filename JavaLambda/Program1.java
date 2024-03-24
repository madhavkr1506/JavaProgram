import java.util.Scanner;

interface interface1{
    void function1(String name);
    
    
}

interface interface2{
    void function2(long mobileNo, int age);
}

interface interface3{
    void function3(String section, char grade);
}

public class Program1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Name = scanner.nextLine();
        interface1 obj1 = (name)->{
            System.out.println("My name is " + name);
        };
        obj1.function1(Name);

        long Mobile = scanner.nextLong();
        int Age = scanner.nextInt();

        interface2 obj2 = (mobileNo, age)->{
            System.out.println("Mobile number is " + mobileNo);
            System.out.println("Age is : " + age);
        };
        obj2.function2(Mobile,Age);

        String Section = scanner.next();
        scanner.nextLine();
        char Grade = scanner.nextLine().charAt(0);

        interface3 obj3 = (section, grade)->{
            System.out.println("Section : " + section);
            System.out.println("Grade : " + grade);
        };
        obj3.function3(Section,Grade);

        scanner.close();
    }
}










