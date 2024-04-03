package lab4_5.lab4;

public class Ex8 {
    public static int findRowWithMaxSum(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException("Matrix must not be null or empty");
        }

        int maxRow = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum > maxSum) {
                maxSum = rowSum;
                maxRow = i;
            }
        }

        return maxRow;
    }
}

