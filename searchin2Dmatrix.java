public class searchin2Dmatrix {
    public static boolean serachtarget(int mat[][],int t){
        int rows = mat.length;
        int cols = mat[0].length;
        int start = 0;
        int end = (rows * cols) - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midElement = mat[mid / cols][mid % cols];  // Convert 1D index to 2D indices

            if (midElement == t) {
                return true;
            }
            if (midElement > t) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr2d[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        Boolean answer= serachtarget(arr2d,16);
        System.out.println(answer);
            
    }
}
