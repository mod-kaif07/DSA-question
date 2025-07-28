
public class add_emelent_btw_array {

    public static int[] add_emelent(int arr[], int size,
            int new_element, int inserting_postion) {

        int[] newarr = new int[size + 1];
        for (int i = 0; i < inserting_postion; i++) {
            newarr[i] = arr[i];
        }

        newarr[inserting_postion] = new_element;

        for (int i = inserting_postion; i < size; i++) {
            newarr[i + 1] = arr[i];
        }
        return newarr;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        int new_element = 7;
        int inserting_postion = 2;
        int new_Array[] = add_emelent(arr, arr.length, new_element, inserting_postion);
        for (int i = 0; i < new_Array.length; i++) {
            System.out.println(new_Array[i] + " ");
        }

    }
}
