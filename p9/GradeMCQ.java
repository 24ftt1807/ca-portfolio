import java.util.Scanner;

public class GradeMCQ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Create a 2D array for students' answers (4 students × 6 questions)
        char[][] answers = {
            {'A', 'B', 'C', 'D', 'A', 'B'},
            {'C', 'D', 'B', 'A', 'B', 'A'},
            {'D', 'D', 'A', 'B', 'B', 'A'}, 
            {'C', 'A', 'D', 'A', 'B', 'C'}  
        };

        char[] key = new char[6];

        System.out.println("Enter the key to the MCQ: ");
        for (int i = 0; i < key.length; i++) {
            key[i] = input.next().toUpperCase().charAt(0); 
        }

        System.out.println();

        for (int i = 0; i < answers.length; i++) {
            int correctCount = 0;

            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == key[j]) {
                    correctCount++;
                }
             }

            String result = (correctCount >= 3) ? "passed" : "failed";

            System.out.println("Student " + i + "'s correct count is " + correctCount + ". Therefore, he/she " + result + " the test.");
        }
    }
}
