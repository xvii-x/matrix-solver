class Main {
    public static void main(String[] args) {
        int[][] simpleMatrix = {
                {2, 31, 131},
                {63, 2, 42},
                {1, 42, 5}
        };
        int[][] secondMatrix = {
                {3, 3, 3},
                {343, 3, 1},
                {87, 4, 2}
        };

        MatrixSolver.printMatrix(MatrixSolver.multiplyMatrices(simpleMatrix, secondMatrix));
    }
}
