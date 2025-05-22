import java.util.Scanner;

public class SimpleQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Quiz Game!");

        // Question 1
        System.out.println("\n1. What is the capital of India?");
        System.out.println("a) Mumbai");
        System.out.println("b) Delhi");
        System.out.println("c) Kolkata");
        System.out.print("Your answer: ");
        String ans1 = scanner.nextLine();
        if (ans1.equalsIgnoreCase("b")) {
            score++;
        }

        // Question 2
        System.out.println("\n2. Who invented Java?");
        System.out.println("a) Elon Musk");
        System.out.println("b) Bill Gates");
        System.out.println("c) James Gosling");
        System.out.print("Your answer: ");
        String ans2 = scanner.nextLine();
        if (ans2.equalsIgnoreCase("c")) {
            score++;
        }

        // Question 3
        System.out.println("\n3. Which planet is known as the Red Planet?");
        System.out.println("a) Mars");
        System.out.println("b) Earth");
        System.out.println("c) Jupiter");
        System.out.print("Your answer: ");
        String ans3 = scanner.nextLine();
        if (ans3.equalsIgnoreCase("a")) {
            score++;
        }

        // Question 4
        System.out.println("\n4. What is 10 + 5?");
        System.out.println("a) 10");
        System.out.println("b) 15");
        System.out.println("c) 20");
        System.out.print("Your answer: ");
        String ans4 = scanner.nextLine();
        if (ans4.equalsIgnoreCase("b")) {
            score++;
        }

       

        // Final Score
        System.out.println("\nYou scored " + score + " out of 4.");
        scanner.close();
    }
}