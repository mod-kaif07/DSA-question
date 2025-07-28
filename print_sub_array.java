
public class print_sub_array {

    public static void sub_array(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
                count++;
            }
            System.out.println();
        }
        System.out.println("Total number of subarray:-"+count);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        sub_array(arr);
    }
}
