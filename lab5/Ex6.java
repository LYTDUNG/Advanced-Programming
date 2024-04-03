package lab4_5.lab5;

public class Ex6 {
    public static int[][] matrixMultiplication(int[][] A, int[][] B) {
        if (A == null || B == null || A.length == 0 || B.length == 0 || A[0].length != B.length) {
            throw new IllegalArgumentException("Matrices must not be null and have compatible dimensions");
        }

        int m = A.length;
        int p = A[0].length;
        int n = B[0].length;
        int[][] C = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int k = 0; k < p; k++) {
                    sum += A[i][k] * B[k][j];
                }
                C[i][j] = sum;
            }
        }

        return C;
    }
}
