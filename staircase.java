public class staircase {
    public static boolean sprial(int matrix[][], int key){
          int row=0; 
          int column=matrix[0].length-1;
          while(row<matrix.length&& column>=0){
            if(key==matrix[row][column]){
                System.out.print( "key found at : ("+row+"," +column+")");
                return true;
            }
            else if (key <matrix[row][column]){
                column--;
            }
             else{
                row++;
             }   
            
          }
          
          System.out.print("key not found");
        return false;
    }
    public static void main(String args[]){
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                         {27,29,37,48},
                        {32,33,39,50}};
                        int key=33;  
           boolean answer=sprial(matrix,key) ;
                     
    }
}
