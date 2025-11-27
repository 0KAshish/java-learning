import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        //Java Slot Machine
        Scanner scanner = new Scanner(System.in);

        //Varaiable declaration
        int balance = 100;
        int bet;
        String[] row;
        String playAgain;

        //Welcome message
        System.out.println("*************************");
        System.out.println("  Welcome Java Slots");
        System.out.println("Symbols 🍒 🍉 🍋 🔔 ⭐");
        System.out.println("*************************");

        //Play if balance >0
        while(balance>0){

            //Show the balance and take the bet amount input
            System.out.println("Your balance is $" + balance);
            System.out.print("Enter your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            // Checking the bet amount
            if(bet>balance){
                System.out.println("Insufficient Funds");
            }else if(bet <= 0){
                System.out.println("Bet Amount must be greater than 0");
            } else {

            }

        }



        scanner.close();
    }
}