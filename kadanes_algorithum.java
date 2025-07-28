
public class kadanes_algorithum {

    public static int max_sum_array(int arr[], int size) {
        int max = Integer.MIN_VALUE;
        int end = 0;
        for (int i = 0; i < size; i++) {
            end = end + arr[i];
            if (max < end) {
                max = end;
            }
            if (end < 0) {
                end = 0;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        int answer = max_sum_array(arr, arr.length);
        System.out.println("max sum of array :- " + answer);
    }
}



