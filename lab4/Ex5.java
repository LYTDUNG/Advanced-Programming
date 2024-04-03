package lab4_5.lab4;

import java.util.ArrayList;
import java.util.List;

public class Ex5 {
    public static boolean containsElement(int[] array, int x) {
        if (array == null || array.length == 0) {
            return false;
        }

        for (int num : array) {
            if (num == x) {
                return true;
            }
        }

        return false;
    }

    public static int countOccurrences(int[] array, int x) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int count = 0;
        List<Integer> positions = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                count++;
                positions.add(i);
            }
        }

        // Print positions if needed
        if (!positions.isEmpty()) {
            System.out.print("The element " + x + " appears at positions: ");
            for (int position : positions) {
                System.out.print(position + " ");
            }
            System.out.println();
        }

        return count;
    }

    public static int[] removeElements(int[] array, int x) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        List<Integer> newArray = new ArrayList<>();

        for (int num : array) {
            if (num != x) {
                newArray.add(num);
            }
        }

        int[] result = new int[newArray.size()];
        for (int i = 0; i < newArray.size(); i++) {
            result[i] = newArray.get(i);
        }

        return result;
    }
}

