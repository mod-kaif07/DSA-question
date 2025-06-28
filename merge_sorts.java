
public class merge_sorts {

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void merge_sort(int arr[], int s_idx, int e_idx) {
        if (s_idx >= e_idx) {
            return;
        }
        int mid = s_idx + (e_idx - s_idx) / 2; //(s_idx+e_idx)/2
        merge_sort(arr, s_idx, mid);
        merge_sort(arr, mid + 1, e_idx);

        merge(arr, s_idx, mid, e_idx);
    }

    public static void merge(int arr[], int s_idx, int mid, int e_idx) {
        int temp[] = new int[e_idx - s_idx + 1];
        int i = s_idx; //idxing for the 1st sorted part
        int j = mid + 1; //idxing for the 2st sorted part
        int k = 0;      // this one for indexing for tem array
        while (i <= mid && j <= e_idx) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k]=arr[i];
            k++ ;
            i++;
        }
        while(j<=e_idx){
            temp[k]=arr[j];
            k++ ;
            j++;
        }
        for (k = 0, i = s_idx; k < temp.length; i++, k++) {
            arr[i]= temp[k];
        }
    }

    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        merge_sort(arr, 0, arr.length - 1);
        printarr(arr);

    }
}
