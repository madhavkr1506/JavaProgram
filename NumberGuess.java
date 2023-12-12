import java.util.Scanner;
import java.util.Random;

class Game{
    private int compNum;
    public Game(Random random){
        compNum = random.nextInt(100) + 1;
    }
    public void checkNum(int userNum){
        if(userNum == compNum){
            System.out.println("Congratulation you won this game.");

        }
        else if(userNum < compNum){
            System.out.println("Your choice is too short, try again.");
        }
        else{
            System.out.println("Your choice is too long, try again.");
        }
    }
    public int getCompNum(){
        return compNum;
    }
}

public class NumberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Game game1 = new Game(random);

        int count = 0;
        while (true){
            int userMove = scanner.nextInt();
            game1.checkNum(userMove);
            count++;
            if(userMove == game1.getCompNum()){
                break;
            }

        }
        System.out.println("In your "+ count +"th attempt your choice is similar to the computer choice.");
        System.out.println("Thanks for playing this game.");
    }
}
