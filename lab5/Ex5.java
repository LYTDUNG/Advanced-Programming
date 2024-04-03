package lab4_5.lab5;

public class Ex5 {
    public static double[][] addMatrices(double[][] A, double[][] B) {
        if (A == null || B == null || A.length == 0 || B.length == 0 || A.length != B.length || A[0].length != B[0].length) {
            throw new IllegalArgumentException("Matrices must not be null and have the same dimensions");
        }

        int rows = A.length;
        int cols = A[0].length;
        double[][] C = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        return C;
    }

    public static double[][] subtractMatrices(double[][] A, double[][] B) {
        if (A == null || B == null || A.length == 0 || B.length == 0 || A.length != B.length || A[0].length != B[0].length) {
            throw new IllegalArgumentException("Matrices must not be null and have the same dimensions");
        }

        int rows = A.length;
        int cols = A[0].length;
        double[][] D = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                D[i][j] = A[i][j] - B[i][j];
            }
        }

        return D;
    }
}

