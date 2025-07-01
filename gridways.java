
public class gridways {

    public static int countways(int n, int m, int i, int j) {
        if (i == n-1 && j==m-1) {
            return 1;
        } else if (i == n || j == m) {
            return 0;
        }
        int w1 = countways(n, m, i, j + 1);
        int w2 = countways(n, m, i + 1, j);
        return w1 + w2;
    }
   
    public static void main(String[] args) {
        int n = 3, m = 3;
        int answer = countways(n, m, 0, 0);
        System.out.println("No= way to reached at "+n+","+m+" to last "+answer);
    }
}
