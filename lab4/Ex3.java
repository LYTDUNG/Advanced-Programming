package lab4_5.lab4;

import java.util.Scanner;

public class Ex3 {
    public static int[] countPositiveNegativeZero(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int num : array) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        return new int[]{positiveCount, negativeCount, zeroCount};
    }

    public static int[] findMaxNegativeAndMinPositive(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int maxNegative = Integer.MIN_VALUE;
        int minPositive = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < 0 && num > maxNegative) {
                maxNegative = num;
            }
            if (num > 0 && num < minPositive) {
                minPositive = num;
            }
        }

        return new int[]{maxNegative, minPositive};
    }

    public static boolean isNegativeSumEqualsPositiveSum(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int negativeSum = 0;
        int positiveSum = 0;

        for (int num : array) {
            if (num < 0) {
                negativeSum += num;
            } else {
                positiveSum += num;
            }
        }

        return negativeSum == -positiveSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();

        int[] counts = countPositiveNegativeZero(array);
        System.out.println("Positive count: " + counts[0]);
        System.out.println("Negative count: " + counts[1]);
        System.out.println("Zero count: " + counts[2]);

        int[] maxMin = findMaxNegativeAndMinPositive(array);
        System.out.println("Max negative: " + maxMin[0]);
        System.out.println("Min positive: " + maxMin[1]);

        boolean isEqual = isNegativeSumEqualsPositiveSum(array);
        System.out.println("Is negative sum equal to positive sum? " + isEqual);
    }
}
