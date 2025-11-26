import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
               Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number;
        int total =0;

        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        if(number>0 && number <11){
            for(int i=0; i<number; i++){
                int dice = random.nextInt(6) + 1;
                System.out.println("Your dice number is: "+dice);
                asciiDie(dice);
                total += dice;
            }
            System.out.println("Total of dice: " + total);
        } else {
            System.out.println("Enter a number Between 1-10");
        }
        scanner.close();
    }
    static void asciiDie(int number){
        String die1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String die2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;
        String die3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;
        String die4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;
        String die5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String die6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch (number){
            case 1 -> System.out.println(die1);
            case 2 -> System.out.println(die2);
            case 3 -> System.out.println(die3);
            case 4 -> System.out.println(die4);
            case 5 -> System.out.println(die5);
            case 6 -> System.out.println(die6);
            default ->System.out.println("Out of Range");
        }
    }
}