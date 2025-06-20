import java.util.Arrays;
//optimal approch in copy and letcode question 229
public class majorityelementN3times {
    public static int[] majorityelement(int arr[]) {
        int n = arr.length;
        int[] arr1 = new int[arr.length];
        int index=0;

        int count = 0;
        for (int i = 0; i < n; i++) {
            count=0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count >(n/3)){
               boolean isexist = false;
               for(int z=0;z<index;z++){
                  if(arr1[z]==arr[i]){
                    isexist=true;
                  }
               }
               if(!isexist){
                arr1[index++]=arr[i];
               }

            }
        }
        int[]result= Arrays.copyOf(arr1, index);

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 3, 3, 2, 2, 2 };
        int answer[] = majorityelement(arr);
        System.out.println(Arrays.toString(answer));
    }
}