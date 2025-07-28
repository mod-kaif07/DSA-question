public class Set_Matrix_Zero {
    public static void main(String[] args) {
        int arr[][] = {
            {0, 1, 2, 0},
            {3, 4, 5, 2},
            {1, 3, 1, 5}
        };

        setmatrixzero(arr);
        printMatrix(arr);
    }

    public static void setmatrixzero(int arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;
        
        // Temporary arrays to mark rows and columns that should be zeroed
        boolean rowFlags[] = new boolean[rows];
        boolean colFlags[] = new boolean[cols];

        // Step 1: Identify zero positions
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 0) {
                    rowFlags[i] = true;
                    colFlags[j] = true;
                }
            }
        }

        // Step 2: Set rows to zero
        for (int i = 0; i < rows; i++) {
            if (rowFlags[i]) {
                row(i, arr);
            }
        }

        // Step 3: Set columns to zero
        for (int j = 0; j < cols; j++) {
            if (colFlags[j]) {
                column(j, arr);
            }
        }
    }

    // Sets an entire row to zero
    public static void row(int i, int arr[][]) {
        for (int z = 0; z < arr[0].length; z++) {
            arr[i][z] = 0;
        }
    }

    // Sets an entire column to zero
    public static void column(int j, int arr[][]) {
        for (int z = 0; z < arr.length; z++) {
            arr[z][j] = 0;
        }
    }

    // Utility function to print the matrix
    public static void printMatrix(int arr[][]) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
