public class setzeromatrix {

    public static void row(int r, int matrix[][]) {
        for (int j = 0; j < matrix[0].length; j++) { // Iterate over the row only
            if (matrix[r][j] != 0) {
                matrix[r][j] = -1;
            }
        }
    }

    public static void colum(int c, int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) { // Iterate over the column only
            if (matrix[i][c] != 0) {
                matrix[i][c] = -1;
            }
        }
    }

    public static void finalarr(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0; // Convert all marked elements to zero
                }
            }
        }
    }

    public static void printingmatrix(int matrix[][]) {
        System.out.print("[");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.print("]");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) { // Corrected condition
                if (matrix[i][j] == 0) {
                    row(i, matrix);
                    colum(j, matrix);
                }
            }

        }

        // Step 4: Convert marked elements to 0
        finalarr(matrix);

        // Print final matrix
        printingmatrix(matrix);

    }

}
