// This is a program explaining Nested switch case :

package ClassWork;

import java.util.Scanner;

public class ClassWork20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        String size = scanner.next();
        switch(input){
            case 1 : {
                System.out.println("espresso");
                switch (size) {
                    case "large":
                        System.out.println("Large");
                        break;
                    case "medium":
                        System.out.println("Medium");
                        break;
                    case "small":
                        System.out.println("Small");
                        break;
                    default:
                        break;
                }
            }
                break;
            case 2 :
                System.out.println("cappuccino");
                switch (size){
                    case "large" :
                        System.out.println("Large");
                        break;
                    case "medium" :
                        System.out.println("Medium");
                        break;
                    case "small" :
                        System.out.println("Small");
                        break;
                    default : break;
                }
                break;
            case 3 :
                System.out.println("latte");
                switch (size){
                    case "large" :
                        System.out.println("Large");
                        break;
                    case "medium" :
                        System.out.println("Medium");
                        break;
                    case "small" :
                        System.out.println("Small");
                        break;
                    default : break;
                }
                break;
            default: break;
        }
    }
}
