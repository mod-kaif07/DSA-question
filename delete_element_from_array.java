public class delete_element_from_array {
    public  static void delete_element(int arr[],int delete_ele){
        int found=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(delete_ele==arr[i]){
                 found=i;
            }

        }
        for(int i=found;i<arr.length-1;i++){
            arr[i]=arr[i-1];
        }
        
    }
 public static void main(String[] args) {
     int arr[]={2,4,6,8,10};
     delete_element(arr,8);
     System.out.println(arr+" ");
 }   
}
