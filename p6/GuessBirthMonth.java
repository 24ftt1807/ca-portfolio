import java.util.Scanner;

public class GuessBirthMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month = 0;

        System.out.println("Is your birth month in Set 1? ");
        System.out.println("1 3 5 7 9 11");
        System.out.println("Enter 0 for No and 1 for Yes: ");
        int answer = input.nextInt();
        if (answer == 1){
            month += 1;
        }

        System.out.println("Is your birth month in Set 2? ");
        System.out.println("2 3 6 7 10 11");
        System.out.println("Enter 0 for No and 1 for Yes: ");
        int answer1 = input.nextInt();
        if (answer1 == 1){
            month += 2;
        }

        System.out.println("Is your birth month in Set 3? ");
        System.out.println("4 5 6 7 12");
        System.out.println("Enter 0 for No and 1 for Yes: ");
        int answer2 = input.nextInt();
        if (answer2 == 1){
            month += 4; 
        }

        System.out.println("Is your birth month in Set 4? ");
        System.out.println("8 9 10 11 12");
        System.out.println("Enter 0 for No and 1 for Yes: ");
        int answer3 = input.nextInt();
        if (answer3 == 1){
            month += 8;
        }

        String birthMonth = "";
        switch (month) {
            case 1:
                birthMonth = "January";
                break;
            case 2:
                birthMonth = "February";
                break;
            case 3:
                birthMonth = "March";
                break;
            case 4:
                birthMonth = "April";
                break;
            case 5:
                birthMonth = "May";
                break;
            case 6:
                birthMonth = "June";
                break;
            case 7:
                birthMonth = "July";
                break;
            case 8:
                birthMonth = "August";
                break;
            case 9:
                birthMonth = "September";
                break;
            case 10:
                birthMonth = "October";
                break;
            case 11:
                birthMonth = "November";
                break;
            case 12:
                birthMonth = "December";
                break;
            default:
                System.out.println("Invalid Birth Month");
                break;
        }
        System.out.println("You are born in "+ birthMonth);
    }
}
