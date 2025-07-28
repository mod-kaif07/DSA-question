
public class possible_pair {

    public static void pairs(int arr[], int s_idx, int e_idx) {
        int i = s_idx;
        int j = i + 1;
        while (i < e_idx - 1) {

            if (j < e_idx) {
                System.out.print("(" + arr[i] + ", " + arr[j] + ")");
                j++;
            }
            i++;

        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        pairs(arr, 0, arr.length);
    }
}
