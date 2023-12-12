import java.util.Random;
import java.util.Scanner;

class GuessGame {
    private int compNum;

    public GuessGame(Random random) {
        compNum = random.nextInt(100) + 1;
    }

    public void checkNum(int userNum) {
        while (true) {
            if (userNum == compNum) {
                System.out.println("Congratulations! You won this game.");
                break;
            } else if (userNum < compNum) {
                System.out.println("Your choice is too low. Try again:");
            } else {
                System.out.println("Your choice is too high. Try again:");
            }


            userNum = new Scanner(System.in).nextInt();
        }
    }
}

public class NumberGuessWithClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("*************************    Welcome to the game    **************************");


        GuessGame game1 = new GuessGame(random);


        int userGame = scanner.nextInt();


        game1.checkNum(userGame);
    }
}
