public class practice {
    public static void spiral(int matrix[][]){
             int starting_column=0;
             int ending_column=matrix.length-1;
             int starting_row=0;
             int ending_row=matrix[0].length-1;
             while(starting_column<=ending_column&& starting_row<=ending_row){

             
             //top
             for(int j=starting_column;j<=ending_column;j++){
                System.out.print(matrix[starting_row][j]+" ");
             }
             //right
             for(int i=starting_row+1;i>=ending_row;i++){
                System.out.print(matrix[i][starting_column]+" ");
             }
             //bottom
             for(int j=ending_column-1;j>=starting_column;j--){
                if(ending_column==starting_column){
                    break;
                }
                System.out.print(matrix[ending_row][j]+" ");
             }
             //left
             for(int i=ending_row-1;i>=starting_row+1;i--){
                if(ending_column==starting_column){
                    break;
                }
                System.out.print(matrix[i][starting_column]+" ");
             }
             starting_column++;
             ending_column--;
             starting_row++;
             ending_row--;
            }
    }
    public static void main(String args[]){
        int matrix[][]={
            {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16} };
            spiral(matrix);
    }
}
