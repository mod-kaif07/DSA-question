
public class queen {

    public static boolean isSafe(char board[][], int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        for(int i= row-1,j=col-1 ; i>=0&& j>=0; i--,j--){
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for(int i= row-1,j=col+1 ; i>=0&& j<board.length ; i--,j++){
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void printboad(char board[][]) {

        System.out.println("-----chess borad----------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void queen(char board[][], int row) {
        if (row == board.length) {
           printboad(board);
            count++;
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = 'Q';
                queen(board, row + 1);
                board[row][i] = '.';
            }
        }
    }
    static long count;

    public static void main(String[] args) {
        int n = 10;
        char board[][] = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '.';
            }
        }
        queen(board, 0);
        System.out.println("Number of ways " + count);

    }
}
