import java.util.Scanner;
public class MathQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int min = 0, max=100;
        int range = (max-min)+1; 
        int randomNumber1 = (int)(Math.random()*(range)+min);
        System.out.println("random number1: "+randomNumber1);
        int randomNumber2 = (int)(Math.random()*(range)+min);
        System.out.println("random number1: "+randomNumber2);

        System.out.println("What is " + randomNumber1 + " + " +randomNumber2 + "?");
        int userSum = input.nextInt();
        int correctSum = randomNumber1 + randomNumber2;

        if (userSum == correctSum) {
            System.out.println(randomNumber1 + " + " + randomNumber2 + " = " + userSum + " is true");
        } 
        else {
            System.out.println(randomNumber1 + " + " + randomNumber2 + " = " + userSum + " is false (Correct: " + correctSum + ")");
        }

        System.out.println("What is " + randomNumber1 + " % " + randomNumber2 + " ?");
        int userModulus = input.nextInt();

        int correctModulus = randomNumber1 % randomNumber2;
        if (userModulus == correctModulus) {
            System.out.println(randomNumber1 + " % " + randomNumber2 + " = " + userModulus + " is true");
        } else {
            System.out.println(randomNumber1 + " % " + randomNumber2 + " = " + userModulus + " is false (Correct: " + correctModulus + ")");
        }

        input.close();

    }
}
    

