package lab4_5.lab4;

public class Ex2 {
    public static int findMaxFrequency(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int max = array[0];
        int maxFrequency = 1;

        for (int i = 1; i < array.length; i++) {
            int currentFrequency = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    currentFrequency++;
                }
            }
            if (currentFrequency > maxFrequency) {
                max = array[i];
                maxFrequency = currentFrequency;
            }
        }

        return max;
    }
}
