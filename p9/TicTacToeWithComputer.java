import java.util.Random;
import java.util.Scanner;

public class TicTacToeWithComputer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        printBoard(board);

        while (true) {
            System.out.println("\nPlayer's turn");
            int row, col;
            while (true) {
                System.out.print("Enter a row (0,1 or 2): ");
                row = input.nextInt();
                System.out.print("Enter a column (0,1 or 2): ");
                col = input.nextInt();

                if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                    board[row][col] = 'X';
                    break;
                } else {
                    System.out.println("Invalid move! Try again.");
                }
            }

            printBoard(board);

            if (checkWinner(board, 'X')) {
                System.out.println("Game ended, Player Win");
                break;
            }
            if (isBoardFull(board)) {
                System.out.println("Game ended, It's a draw!");
                break;
            }

            System.out.println("\nComputer's turn...");
            int cpuRow, cpuCol;
            while (true) {
                cpuRow = rand.nextInt(3);
                cpuCol = rand.nextInt(3);
                if (board[cpuRow][cpuCol] == ' ') {
                    board[cpuRow][cpuCol] = 'O';
                    break;
                }
            }

            printBoard(board);

            if (checkWinner(board, 'O')) {
                System.out.println("Game ended, CPU Win");
                break;
            }
            if (isBoardFull(board)) {
                System.out.println("Game ended, It's a draw!");
                break;
            }
        }

        input.close();
    }

    public static void printBoard(char[][] board) {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) System.out.println("-----------");
        }
    }

    public static boolean checkWinner(char[][] board, char symbol) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) ||
                (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol))
                return true;
        }
        if ((board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
            (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol))
            return true;

        return false;
    }

    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ')
                    return false;
        return true;
    }
}
