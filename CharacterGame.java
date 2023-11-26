import java.util.Scanner;

public class CharacterGame {
    public static void string1(){
        System.out.println("My name is madhav kumar.");
    }
    public static void string2(){
        System.out.println("I have a good smile");
    }
    public static void string3(){
        System.out.println("My laugh is good");
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any of these characters A , B , C = ");
        while(true) {
            char choice = scanner.next().charAt(0);
            switch (choice){
                case 'A' :
                    string1();
                    break;
                case 'B' :
                    string2();
                    break;
                case 'C' :
                    string3();
                    break;
                default :
                    System.exit(0);
            }
        }
    }
}
