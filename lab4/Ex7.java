package lab4_5.lab4;

public class Ex7 {
    public static boolean isSymmetric(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            if (array[i] != array[n - i - 1]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isAlternatingSign(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        boolean isPositive = array[0] > 0;

        for (int num : array) {
            if ((num > 0 && !isPositive) || (num < 0 && isPositive)) {
                return false;
            }
            isPositive = !isPositive;
        }

        return true;
    }

    public static int findMax(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException("Matrix must not be null or empty");
        }

        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
            }
        }

        return max;
    }

    public static int findMin(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException("Matrix must not be null or empty");
        }

        int min = Integer.MAX_VALUE;
        for (int[] row : matrix) {
            for (int num : row) {
                if (num < min) {
                    min = num;
                }
            }
        }

        return min;
    }

    public static int sumMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException("Matrix must not be null or empty");
        }

        int sum = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                sum += num;
            }
        }

        return sum;
    }
}

