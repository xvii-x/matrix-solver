import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[][] simpleMatrix = {
                {2, 3},
                {1, 4}
        };
        int[][] secondMatrix = {
                {3, 3},
                {5, 6}
        };

        MatrixSolver.printMatrix(MatrixSolver.multiplyMatrices(simpleMatrix, secondMatrix));
    }
}
