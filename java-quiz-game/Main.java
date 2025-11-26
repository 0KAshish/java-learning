import java.util.Scanner;

public class Main{
    public static void main(String[] args){
                // Question Array[]

        String[] questions = {
                "1. What is the capital of France?",
                "2. Which element has the chemical symbol 'O'?",
                "3. Who wrote the play \"Romeo and Juliet\"?",
                "4. What is the largest planet in our solar system?",
                "5. In mathematics, what is the value of π (pi) approximately?"
        };

        String[][] options = {
                {"1 Berlin","2 Madrid","3 Paris","4 Rome"},
                {"1 Gold","2 Oxygen","3 Osmium","4 Iron"},
                {"1 William Shakespeare","2 Charles Dickens","3 Mark Twain","4 Jane Austen"},
                {"1 Earth","2 Jupiter","3 Saturn","4 Mars"},
                {"1 2.14","2 3.14","3 4.14","4 4.14"},
        };

        int[] answer = {3,2,1,2,2};

        // Welcome message
        System.out.println("*****************************");
        System.out.println("Welcome to java quiz program");
        System.out.println("*****************************");
        System.out.println();

        // Variable declaration
        int guess;
        int score=0;

        Scanner scanner = new Scanner(System.in);

        // Show the question
        for (int i=0; i<questions.length; i++){
            System.out.println(questions[i]);

            // Show question option
            for(String option : options[i]){
                System.out.println(option);
            }

            // Take answer form user
            System.out.print("Enter your answer: ");
            guess = scanner.nextInt();

            // Check the answer
            if(guess == answer[i]){
                System.out.println("Correct Answer");
                score++;
            }
            else{
                System.out.print("Wrong Answer: ");
                System.out.println("Correct Answer is: " + options[i][answer[i]-1]);
                System.out.println();
            }
        }
        // Display the result
        System.out.println("You have scored "+ score + " out of " +questions.length);

        // Display the final score
        scanner.close();
    }
}