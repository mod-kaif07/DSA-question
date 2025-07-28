public class rotatematix90deg {
    public static int[][] rotate(int [][]arr){
        int n= arr.length;
        int rotatematrix[][]= new int [n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
              rotatematrix [j][(n - 1)-i]=arr[i][j];
            }
        }
        return rotatematrix;
    }
        public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
       int anserarr[][]= rotate(arr);
       System.out.println("Rotated Image");
        for (int i = 0; i < anserarr.length; i++) {
            for (int j = 0; j < anserarr.length; j++) {
                System.out.print(anserarr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
