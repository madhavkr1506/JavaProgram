import java.util.Scanner;
interface Welcome{
    void welcomeNote();
}
class WelcomeClass implements Welcome{
    public void welcomeNote(){
        System.out.println("Welcome to the lovely professional university");
    }
}
public class Project5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WelcomeClass obj1 = new WelcomeClass();
        obj1.welcomeNote();
    }
}
