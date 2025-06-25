import java.util.Arrays;

public class mergeshortarray {
    public static void merge_sort(int a[], int b[]) {
        int mergeArray[] = new int[a.length];
        int j=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                mergeArray[i] = a[i];

            } else {
                mergeArray[i] = b[j++];
               
            }
        }
        sortingArray(mergeArray);
        System.out.println(Arrays.toString(mergeArray) + ",");

    }
    public static void sortingArray(int ma[]) {
        int n = ma.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n  - 1; j++) {
                if (ma[j] > ma[j + 1]) {
                    // Swap ma[j] and ma[j + 1]
                    int temp = ma[j];
                    ma[j] = ma[j + 1];
                    ma[j + 1] = temp;
                }
            }
        }
    }
    

    public static void main(String[] args) {
        int num1[] = { 1, 2, 3, 0, 0, 0 };
        int num2[] = { 2, 5, 6 };
        merge_sort(num1, num2);

    }
}
