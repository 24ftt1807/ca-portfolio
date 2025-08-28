import java.util.Scanner;
public class MoneyChanger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1 to convert bnd to rm and 2 vice versa: ");
        int choice = input.nextInt();

        System.out.println("Enter the amount to be converted: ");
        double amount = input.nextDouble();

        double result = (choice == 1) ? (amount * 3) : (amount / 3.0);

        System.out.println("The change is $"+result);
    }
}
