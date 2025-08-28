import java.util.Scanner;
public class ReverseOfInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an integer between 100 and 999: ");
        int number = input.nextInt();

        int digit1 = number % 10;
        int digit2 = (number / 10) % 10;
        int digit3 = number / 100;

        int reverse = digit1 * 100 + digit2 * 10 + digit3;

        System.out.println("The reverse of " + number + " is " + reverse);
    }
}
