
public class sum_of_subarray {

    public static void sub_array(int arr[]) {
        int count = 0;
        int sum ;
        int max_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum = sum + arr[k];
                }
                System.out.print("sum:- " + sum);
                System.out.println();
                count++;
                if (sum > max_sum) {
                    max_sum = sum;
                }
            }
            System.out.println();
        }
        System.out.println("Total number of subarray:-" + count);
        System.out.println("MAX of subarray:-" + max_sum);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10,12,14,16,18,20};
        sub_array(arr);
    }
}
