package lab4_5.lab4;

import java.util.Arrays;

public class Ex6 {
    public static boolean isIncreasing(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }

        return true;
    }

    public static int[] sortIncreasing(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        return sortedArray;
    }
}

