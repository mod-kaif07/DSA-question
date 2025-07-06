public class queens_for2_queen {
    public  static  void queen(char board[][],int row){
        if(row== board.length){
            printboard(board);
            return;
        }
        for(int j=0;j<board.length;j++){
            board[row][j]='Q';
            queen(board, row+1);
            board[row][j]='.';
        }


    }
    public  static void printboard(char  board[][]){
        System.out.println("----------Chess board----------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=2;
        char board[][]= new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        queen(board, 0);
    }
}
