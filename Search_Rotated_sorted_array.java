
public class Search_Rotated_sorted_array {

    public static int Serach(int arr[], int target, int s_idx, int e_idx) {
        if (s_idx > e_idx) {
            return -1;
        }

        int mid_idx = s_idx + (e_idx - s_idx) / 2;
        //when target element at the mid FOUND 
        if (target == arr[mid_idx]) {
            return mid_idx;
        }

        //if target is found on L1
        if (arr[s_idx] <= arr[mid_idx]) {
            //case a:left
            if (arr[s_idx] <= target && target <= arr[mid_idx]) {
                return Serach(arr, target, s_idx, mid_idx - 1);
            } else {
                //case b:right
                return Serach(arr, target, mid_idx + 1, e_idx);
            }

        } //if target is found on L2
        else {
            //case c:right
            if (arr[mid_idx] <= target && target >= arr[e_idx]) {
                return Serach(arr, target, mid_idx + 1, e_idx);
            } 
            //case d: left
            else {
                return Serach(arr, target, s_idx, mid_idx - 1);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 2;
        int target_idx = (Serach(arr, target, 0, arr.length));
        System.out.println(target_idx);
    }
}
