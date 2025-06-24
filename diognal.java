
public class diognal {

    public static int Diognal(int matr[][]) {
        int sum = 0;
        for (int i = 0; i < matr.length; i++) {
            // for(int j=0;j<matr[0].length;j++){
            //       if(i==j){
            //         sum= sum+matr[i][j];
            //       }
            //       else if(i+j==matr.length-1){
            //         sum=sum+matr[i][j];
            //       }

            //this new approach having O(n) time complexibity
            //primary diogonal
            sum = sum + matr[i][i];
            //seconday diogonal
            if (i != matr.length - 1 - i) {
                sum = sum + matr[i][matr.length - i - 1];
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        int matr[][] = {{1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}};
        int answer = Diognal(matr);
        System.out.print("Diogonal sum" + answer);
    }
}
