package lab4_5.lab5;

public class Ex4 {
    public static int[] rowSum(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException("Matrix must not be null or empty");
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] sums = new int[rows];

        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += matrix[i][j];
            }
            sums[i] = rowSum;
        }

        return sums;
    }

    public static int maxRowSumIndex(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException("Matrix must not be null or empty");
        }

        int[] sums = rowSum(matrix);
        int maxIndex = 0;
        int maxSum = sums[0];

        for (int i = 1; i < sums.length; i++) {
            if (sums[i] > maxSum) {
                maxSum = sums[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}

