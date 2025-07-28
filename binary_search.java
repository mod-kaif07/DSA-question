
public class binary_search {

    public static int IsFound(int arr[], int key) {
        int s_idx = 0;
        int e_idx = arr.length - 1;
        while (s_idx <= e_idx) {
            //we dont inilize the mid _idx on the top because when after 
            //checking the new e_idx & s_idx then i again find the mid 
            int mid_idx = s_idx + (e_idx - s_idx) / 2;
            if (key == arr[mid_idx]) {
                return mid_idx;
            }
            if (arr[mid_idx] > key) {
                e_idx = mid_idx - 1;
            } else {
                s_idx = mid_idx + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 7, 9, 12, 15};
        int key = 12;
        int answer = IsFound(arr, key);
        System.out.println(answer);
    }
}
