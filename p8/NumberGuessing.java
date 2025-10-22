import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }

        for (int i = 0; i < numbers.length; i++) {
            int randomIndex = rand.nextInt(numbers.length);
            int temp = numbers[i];
            numbers[i] = numbers[randomIndex];
            numbers[randomIndex] = temp;
        }

        int chances = 10; 
        int score = 0;    

        System.out.println("Guess 4 numbers (no duplicates):");

        while (chances > 0) {
            int[] guess = new int[4];
            for (int i = 0; i < 4; i++) {
                guess[i] = input.nextInt();
            }

            score = 0;
            
            for (int i = 0; i < 4; i++) {
                if (guess[i] == numbers[i]) {
                    score++;
                }
            }

            chances--;

            if (score == 4) {
                System.out.println("You have score " + score + " out of the 4 numbers. You win!");
                break;
            } else if (chances == 0) {
                System.out.println("You have score " + score + " out of the 4 numbers.");
                System.out.println("No chances left. You lose!");
                System.out.print("The correct numbers were: ");
                for (int i = 0; i < 4; i++) {
                    System.out.print(numbers[i] + " ");
                }
                System.out.println();
            } else {
                System.out.println("You have score " + score + " out of the 4 numbers. You have " + chances + " chances left.");
                System.out.println();
                System.out.println("Guess 4 numbers (no duplicates):");
            }
        }
    }
}
