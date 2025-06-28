
public class Quick_sorts {

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quick_sort(int arr[], int s_idx, int e_idx) {
        if (s_idx >= e_idx) {
            return;
        }
        int p_idx = partiation(arr, s_idx, e_idx);
        quick_sort(arr, s_idx, p_idx - 1);
        quick_sort(arr, p_idx + 1, e_idx);

    }

    public static int partiation(int arr[], int s_idx, int e_idx) {
        int piviot = arr[e_idx];
        int i = s_idx - 1;
        for (int j = s_idx; j < e_idx; j++) {
            if (arr[j] <= piviot) {
                i++; //making the space for smaller elemtent then pivot;
                //swaping
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                
            }
        }
        //this swaping for the piviot elemnt to place it at right place 
        i++;
        int temp=piviot;
        arr[e_idx]=arr[i];
        arr[i]=temp;
        return i;
    }

    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        quick_sort(arr, 0, arr.length - 1);
        printarr(arr);

    }
}
