import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SimpleLoginValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
         String ldtString = ldt.format(dtf);

        System.out.println("Enter username: ");
        String username = input.nextLine();

        System.out.println("Enter password: ");
        String password = input.nextLine();

        if (username.equalsIgnoreCase("Ahmad Ali")){
            if (password.equals("12345")){
            System.out.println("Welcome Ahmad Ali. The time now is "+ldtString);
         }
            else{
            System.out.println("Password does not match");
        }}
        else {
            System.out.println("Invalid Username");
        }
    }
}
