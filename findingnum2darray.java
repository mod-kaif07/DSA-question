import java.util.Scanner;
public class findingnum2darray {
public static boolean output(int matrix[][], int key){
    
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==key){
                System.out.print("found key at "+i+","+j);
                return true;
            }
           
        }
       
    }
    System.out.print("key not found");
   return false;
}


     public static void main(String args[]){
        int matrix[][]= new int[3][3];
        int n= matrix.length,m=matrix[0].length;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of the matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the key to search:");
        int key = sc.nextInt();
        boolean keyFound = output(matrix, key); // Call the output method and store the result
        System.out.println("Key found: " + keyFound);
        sc.close();
        //output
        for(int i=0 ;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }System.out.println();

        }

       
      
    }
}
