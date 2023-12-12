import java.util.Scanner;
import java.util.Random;
public class PracticeRockPaperScissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("***********************    Welcome to the Game    *************************");
        while (true){
            String[] AvailableMove={"rock","paper","scissor"};
            String computerMove=AvailableMove[random.nextInt(AvailableMove.length)];
            System.out.println("Computer move is = " + computerMove);
            String userMove = scanner.next().toLowerCase();
            if(!(userMove.equals("rock") || userMove.equals("paper") || userMove.equals("scissor"))){
                System.out.println("Please Enter Correct Move : 1. rock 2.Paper 3.Scissor");
                continue;
            }
            System.out.println("User move is = " + userMove);

            if ((userMove.equals("rock") && computerMove.equals("scissor")) ||
                    (userMove.equals("scissor") && computerMove.equals("paper")) ||
                    (userMove.equals("paper") && computerMove.equals("rock"))) {
                System.out.println("Congratulations! You won this game.");
            } else if (userMove.equals(computerMove)) {
                System.out.println("It's a tie.");
            } else {
                System.out.println("AHH ::) Computer won this game.");
            }


            System.out.println("Would you like to play this game one more time : Yes or No");
            String PlayAgain;
            while(true){
                PlayAgain = scanner.next().toLowerCase();
                if(!PlayAgain.equals("yes") && !PlayAgain.equals("no")){
                    System.out.println("Please Enter correct input : yes or no");
                    continue;
                }
                break;
            }
            if(PlayAgain.equals("no")){
                break;
            }
        }
    }
}