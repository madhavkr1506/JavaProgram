import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println(" *******************    Welcome to the game    ****************** ");
        int compNum = random.nextInt(100) + 1;
        int count = 0;
        while(true){
            int userMove = scanner.nextInt();
            scanner.nextLine();
            count++;
            if(userMove == compNum){
                System.out.println("Congratulation your choice is same as computer choice.");
//                count++;
                System.out.println("In your "+count+"th attempt you guess computer number.");
                break;
            }
            if(userMove < compNum){
                System.out.println("Your choice is too low.");
//                count++;
            }
            else {
                System.out.println("Your choice is too high");
//                count++;
            }
        }
    }
}
