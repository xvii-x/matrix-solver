public class MatrixSolver {
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.print("( ");
            for (int number : row)
                System.out.printf("%d ", number);
            System.out.print(")");
            System.out.println();
        }
    }
    public static int getMatrixOrder(int[][] matrix) {
        return matrix.length;
    }

    public static int getMatrixDeterminant(int[][] matrix) {
        return 0;
    }

    public static int solveSecondOrder(int[][] matrix) {
        int plus = 1, minus = 1;
        int rowNumber = 0;
        for (int[] row : matrix) {
            rowNumber += 1;

            if (rowNumber % 2 != 0) {
                plus *= row[0];
                minus *= row[1];
            } else {
                plus *= row[1];
                minus *= row[0];
            }
        }

        return plus - minus;
    }

    public static void multiplyOnConstant(int[][] matrix, int constant) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= constant;
            }
        }
    }

    public static int[][] multiplyMatrices(int[][] first, int[][] second) {
        if (first == null || second == null || first.length == 0 || second.length == 0) {
            System.err.println("Wrong matrix provided!");
            return new int[0][0];
        }

        int[][] result = new int[first.length][second[0].length];

        for (int i = 0; i < first.length; i++) { // Rows in first matrix
            for (int j = 0; j < second[0].length; j++) { // Columns in second matrix
                for (int k = 0; k < first[0].length; k++) { // Overall size (first matrix column / second matrix row)
                    result[i][j] += first[i][k] * second[k][j];
                }
            }
        }

        return result;
    }
}
