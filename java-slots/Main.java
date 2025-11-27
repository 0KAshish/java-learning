import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Java Slot Machine
        Scanner scanner = new Scanner(System.in);

        // Varaiable declaration
        int initial = 100;
        int balance = 100;
        int bet;
        String[] row;
        String playAgain;
        int payout;

        // Welcome message
        System.out.println("*************************");
        System.out.println("  Welcome Java Slots");
        System.out.println("Symbols 🍒 🍉 🍋 🔔 ⭐");
        System.out.println("*************************");

        // Play if balance >0
        while (balance > 0) {

            // Show the balance and take the bet amount input
            System.out.println("Your balance is $" + balance);
            System.out.print("Enter your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            // Checking the bet amount
            if (bet > balance) {
                System.out.println("Insufficient Funds");
            } else if (bet <= 0) {
                System.out.println("Bet Amount must be greater than 0");
            } else {
                System.out.println("Spinning...");
                balance -= bet;

            }
            // Generate Row
            row = spinRow();

            // Print Row
            printRow(row);

            // Payout
            payout = getPayout(row, bet);

            if (payout > 0) {
                System.out.println("You got $" + payout);
                balance += payout;

            } else {
                System.out.println("You Lose $" + bet);
            }

            System.out.print("Want to play again (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();

            if (!playAgain.equals("Y")) {
                break;
            }

        }
        if (balance > initial) {
            System.out.println("Good Bye Your total amount is: " + balance);
        } else {
            System.out.println("Sorry you lose your money");
        }

        scanner.close();
    }

    static String[] spinRow() {
        String[] symbols = { "🍒", "🍉", "🍋", "🔔", "⭐", };
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }

    static void printRow(String[] row) {
        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************");
    }

    static int getPayout(String[] row, int bet) {
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        } else if (row[0].equals(row[1])) {
            return switch (row[0]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 8;
                case "⭐" -> bet * 16;
                default -> 0;
            };

        } else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 8;
                case "⭐" -> bet * 16;
                default -> 0;
            };
        }

        return 0;
    }

}