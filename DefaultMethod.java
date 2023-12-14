import java.util.Scanner;
interface  study{
    void reading();
    void writing();
    private void eating(){
        System.out.println("I am eating food.");
    }
    default void playing(){//   ---> If you want to add more method in an interface after implementation it will throe an error, an d these error can be modified by two ways : 1. defining body part of that method in class where you implement interface. 2. Use default keyword and define body part of that method in the interface itself, It can be overridden if you define it in class again.
//        Note : To access private method default is used.

        eating();
        System.out.println("I am playing.");
    }
}
interface books{
    String[] book();
    void book_name(String bookName);
}
class Student{
    void introduction(){
        System.out.println("Hello friends, I am Madhav kumar.");
    }
}
class Madhav extends Student implements study,books{
    public void reading(){
        System.out.println("I am reading a book.");
    }
    public void writing(){
        System.out.println("I am writing my notes.");
    }
    public String[] book(){
        System.out.println("List of book along with author name : ");
        String[] List1 = {"Adventures of Tom Sawyer: Mark Twain","Agni Veena: Kazi Nasrul Islam","Animal Farm: George Orwell"};
        return List1;
    }
    public void book_name(String bookName){
        System.out.println("The name of the book is " + bookName);
    }

//    @Override
//    public void playing(){
//        System.out.println("I am playing cricket.");
//    }

//    Note : It is a separate method. It is not related with interface method.
//    void eating(){
//        System.out.println("I am eating.");
//    }


}
public class DefaultMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Madhav obj1 = new Madhav();
        String [] List2 = obj1.book();
        for(String bookOrder : List2){
            System.out.println(bookOrder);
        }
        obj1.playing();
//        obj1.eating();--->Eating is private in interface, so it will throw an error.

//        Note : we can add new functionality to existing interface ---> Default method.
//        It will ensure backward compatibility while updating an interface.
//        Interface can also include private methods for default methods to use.



    }
}
