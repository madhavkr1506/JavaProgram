import java.util.Locale;
import java.util.Scanner;
import java.util.Random;


public class RockPaperScissor {
    private static boolean isValidMove(String move){
        return move.equals("rock") || move.equals("paper") || move.equals("scissor");
    }

    private static String computerMove(Random random){
        int randomNumber=random.nextInt(3);
        switch(randomNumber){
            case 0 :
                return "rock";
            case 1 :
                return "paper";
            case 2 :
                return "scissor";
            default :
                return " ";
        }
    }

    private static String gameWinner(String userMove, String computerMove){
        if(userMove.equals(computerMove)){
            return "IT IS A TIE.";
        }
        else if((userMove.equals("rock") && computerMove.equals("scissor")) || (userMove.equals("paper") && computerMove.equals("rock")) || (userMove.equals("scissor") && computerMove.equals("paper"))){
            return "CONGRATULATION ! YOU WON THIS GAME";
        }
        else{
            return "SORRY ::) COMPUTER WON THIS GAME, BETTER LUCK NEXT TIME";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("WELCOME TO THE GAME, GOOD TO SEE YOU HERE");
        while(true) {
            String userTurn = scanner.nextLine().toLowerCase();
            if (!isValidMove(userTurn)) {
                System.out.println("IT IS NOT A VALID MOVE, PLEASE ENTER A VALID MOVE [rock, paper, scissor]");
                continue;
            }
            String computerTurn = computerMove(random);
            System.out.println("COMPUTER MOVE IS = " + computerTurn);
            String result = gameWinner(userTurn,computerTurn);
            System.out.println(result);

            System.out.print(" DO YOU WANT TO PLAY ONR MORE ROUND = ");
            String newGame=scanner.nextLine().toLowerCase();
            if(!newGame.equals("yes")){
                break;
            }

        }
        System.out.println("THANKS FOR PLAYING THIS GAME. HOPE WE WILL MEET AGAIN HERE.");
    }
}
