import java.util.Scanner;
public class week7_stquestion2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter num1: ");
        int num1 = input.nextInt();

        System.out.println("Enter num2: ");
        int num2 = input.nextInt();
        input.nextLine();

        System.out.println("Here is the menu:");
        System.out.println("Add");
        System.out.println("Substract");
        System.out.println("Multiply");
        System.out.println("Divide");
        System.out.println("Enter your choice: ");
        String choice = input.nextLine().toLowerCase();
        System.out.println("You selected: "+choice);

        double result = 0;
        
        if (choice.equals("add")) {
            result = num1 + num2;
        }
        else if (choice.equals("substract")){
            result = num1 - num2;
        }
        else if (choice.equals("multiply")){
            result = num1 * num2;
        }
        else if (choice.equals("divide")){
            if (num2 > 0){
                result = (double) num1 / num2;
            }
            else {
                System.out.println("Invalid");
            }
        }
        else {
            System.out.println("Invalid");
        }

        System.out.println("Your answer is: "+result);

    }
}