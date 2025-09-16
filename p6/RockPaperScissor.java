import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rock (0), paper (1), scissor (2): ");
        int userChoice = input.nextInt();

        int computerChoice = (int) (Math.random() * 3);
        if (computerChoice == 0) {
            System.out.println("The computer is rock.");
        }
        else if (computerChoice == 1) {
            System.out.println("The computer is paper.");
        }
        else {
            System.out.println("The computer is scissor.");
        }

        if (userChoice == 0) {
            System.out.println("You are rock.");
        }
        else if (userChoice == 1) {
            System.out.println("You are paper.");
        }
        else {
            System.out.println("You are scissor.");
        }

        if (userChoice == computerChoice) {
            System.out.println("It is a draw.");
        }
        else if (userChoice == 0 && computerChoice == 2) {
            System.out.println("You Win!");
        }
        else if (userChoice == 0 && computerChoice == 1) {
            System.out.println("You Lose.");
        }
        else if (userChoice == 1 && computerChoice == 0) {
            System.out.println("You Win!");
        }
        else if (userChoice == 1 && computerChoice == 2) {
            System.out.println("You Lose.");
        }
        else if (userChoice == 2 && computerChoice == 1) {
            System.out.println("You Win!");
        }
        else if (userChoice == 2 && computerChoice == 0) {
            System.out.println("You Lose.");
    }
}
}
