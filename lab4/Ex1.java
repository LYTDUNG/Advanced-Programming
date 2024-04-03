package lab4_5.lab4;

public class Ex1 {
    public static int[] findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return new int[]{index, max};
    }

    public static int[] findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        
        int min = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return new int[]{index, min};
    }

    public static int calculateSum(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
