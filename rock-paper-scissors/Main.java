import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Rock Paper Scissor
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock","paper","scissor" };
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        System.out.println("------------------------------------------------");
        System.out.println("---- Welcome to Rock Paper and Scissor Game ----");
        System.out.println("------------------------------------------------");
        System.out.println();

        do {
            System.out.print("Make your choice (rock, paper, scissor): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissor")){
                System.out.println("Invalid choice");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice " + computerChoice);

            if(playerChoice.equals(computerChoice)){
                System.out.println("It's a tie!");

            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissor")) ||
                    (playerChoice.equals("scissor") && computerChoice.equals("paper")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            do {
                System.out.print("Want to play again (yes/no): ");
                playAgain = scanner.nextLine().toLowerCase();
            } while (!playAgain.equals("yes") && !playAgain.equals("no"));
            
        } while (playAgain.equals("yes"));
        
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("------ Thanks for playing -----------");
        System.out.println("-------------------------------------");



        scanner.close();
    }
}