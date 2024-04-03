package lab4_5_test.lab4_test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import lab4_5.lab4.Ex4;

public class Ex4_Test {
    @Test
    public void testReverseArray() {
        int[] array1 = {1, 2, 3, 4, 5};
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, Ex4.reverseArray(array1));

        int[] array2 = {-1, -2, -3, -4, -5};
        assertArrayEquals(new int[]{-5, -4, -3, -2, -1}, Ex4.reverseArray(array2));

        int[] array3 = {1};
        assertArrayEquals(new int[]{1}, Ex4.reverseArray(array3));

        int[] array4 = {10, 20, 30, 40, 50, 60};
        assertArrayEquals(new int[]{60, 50, 40, 30, 20, 10}, Ex4.reverseArray(array4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReverseArrayWithNullArray() {
        int[] array = null;
        Ex4.reverseArray(array);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReverseArrayWithEmptyArray() {
        int[] array = {};
        Ex4.reverseArray(array);
    }
}

