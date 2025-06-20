public class majorityelement {
    public static int majority(int arr[]) {
        int n = arr.length;
        int count = 0;
        int element = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                element = arr[i];
            }
            else if (arr[i] == element) {
                count++;

            } else {
                count--;
            }

        }
        int count1=0;
        for(int i=0;i<n;i++){
           if( arr[i]==element) count1++;
        }
        if(count1 > (n/2)){
            return element;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 3 };
        int answer = majority(arr);
        System.out.println(answer);
    }
}
