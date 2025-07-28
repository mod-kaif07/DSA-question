
public class reverse {

    public static void reversearr(int arr[], int s_ix, int e_idx) {
       for(int i=s_ix,j=e_idx; i<=j; i++,j--){
        int temp= arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
       }
       // return;
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 7, 9, 12, 15};
        reversearr(arr, 0, arr.length - 1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
