import java.util.Arrays;

//this is brute oproch
public class missingnumber {
    public static void main(String[] args) {
        int num[] = { 3, 0, 1 };
        int answer = missednumber(num);
        System.out.println(answer);
    }

    public static int missednumber(int n[]) {
        for (int i = 0; i <= n.length; i++) {
            boolean checkpointer = false;
            for (int j = 0; j < n.length; j++) {
                if (n[j] == i) {
                    checkpointer = true;
                    break;
                }

            }
            if (!checkpointer) {
                return i;
            }
        }

        return -1;
    }

}
