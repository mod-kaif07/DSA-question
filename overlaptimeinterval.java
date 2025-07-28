import java.util.Arrays;

public class overlaptimeinterval {
    public static int [][]checkforoverlap(int a[][]){
        int n= a.length;
        int withoutOverlapMatrix[][] = new int[n][n];
        withoutOverlapMatrix[0][0]=a[0][0];
          for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]>a[i+1][j-1]){
                    withoutOverlapMatrix[i][j]=a[i+1][j];
                }else{
                    withoutOverlapMatrix[i][j]=a[i][j];
                }
                if((i>n) &&(j>n) ){
                    withoutOverlapMatrix[i][j]=a[i][j];
                }

            }
          }
        return withoutOverlapMatrix;

    }

    public static void main(String[] args) {
        int timeslots[][] = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        int answer[][] = checkforoverlap(timeslots);
         System.out.println("Merged Intervals:");
        for (int[] interval : answer) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
