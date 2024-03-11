import java.util.Scanner;

interface interface1{
    void name(String name);
}

public class Lambda3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputname = scanner.nextLine();
        interface1 int1=(name)->{
            System.out.println("My name is " + name);
        };
        int1.name(inputname);
        scanner.close();
    }
}
