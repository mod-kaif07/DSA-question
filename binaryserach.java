

public class binaryserach {

    public static int binaryserach(int array[], int n) {

        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;// this will help to find the mid terms 
            if (n == array[mid]) { //this will check the (old or new) mid value is equal to key or not
                return mid;

            }
            if (array[mid] > n) {
                end = mid - 1;   //this condition made for update the     midterms  ::left - update end 
            } else {
                start = mid + 1;//this condition made for update the     midterms  ::right - update start 
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};// Sort the array before performing binary search mens arrnage in assending or decnding order,

        // Scanner sc = new Scanner(System.in);
        System.out.print("enter key");
        int n = 18;
        int answer = binaryserach(array, n);//here i call the function 
        System.out.print(answer);// printing the value of call function

    }

}
