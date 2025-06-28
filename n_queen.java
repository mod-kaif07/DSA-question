
public class n_queen {

    public static boolean palced_queen_safe_or_not(char board[][], int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void queen(char board[][], int row) {

        if (row == board.length) {
            printboard(board);
            count ++;
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (palced_queen_safe_or_not(board, row, j)) {
                board[row][j] = 'Q';
                queen(board, row + 1);
                board[row][j] = '.';

            }

        }

    }

    public static void printboard(char board[][]) {

        System.out.println("----------Chess board----------");

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");

            }
            System.out.println();

        }

    }
    static int count =0;

    public static void main(String[] args) {
        int n = 8;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        queen(board, 0);
        System.out.println("Total  number of ways "+count);
    }
}
