package lab4_5_test.lab4_test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import lab4_5.lab4.Ex3;

public class Ex3_Test {
    @Test
    public void testCountPositiveNegativeZero() {
        int[] array = {1, 2, -3, 0, -5};
        assertArrayEquals(new int[]{2, 2, 1}, Ex3.countPositiveNegativeZero(array));

        int[] array1 = {0, 0, 0};
        assertArrayEquals(new int[]{0, 0, 3}, Ex3.countPositiveNegativeZero(array1));

        int[] array2 = {-1, -2, -3};
        assertArrayEquals(new int[]{0, 3, 0}, Ex3.countPositiveNegativeZero(array2));
    }

    @Test
    public void testFindMaxNegativeAndMinPositive() {
        int[] array = {1, 2, -3, 0, -5};
        assertArrayEquals(new int[]{-3, 1}, Ex3.findMaxNegativeAndMinPositive(array));

        int[] array1 = {-1, -2, -3};
        assertArrayEquals(new int[]{-1, Integer.MAX_VALUE}, Ex3.findMaxNegativeAndMinPositive(array1));

        int[] array2 = {1, 2, 3};
        assertArrayEquals(new int[]{Integer.MIN_VALUE, 1}, Ex3.findMaxNegativeAndMinPositive(array2));
    }

    @Test
    public void testIsNegativeSumEqualsPositiveSum() {
        int[] array = {-1, 9, -3, 0, -5};
        assertTrue(Ex3.isNegativeSumEqualsPositiveSum(array));

        int[] array1 = {-1, -2, -3, 6, 2};
        assertFalse(Ex3.isNegativeSumEqualsPositiveSum(array1));

        int[] array3 = {0, 0, 0};
        assertTrue(Ex3.isNegativeSumEqualsPositiveSum(array3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCountPositiveNegativeZeroWithNullArray() {
        int[] array = null;
        Ex3.countPositiveNegativeZero(array);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxNegativeAndMinPositiveWithEmptyArray() {
        int[] array = {};
        Ex3.findMaxNegativeAndMinPositive(array);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsNegativeSumEqualsPositiveSumWithNullArray() {
        int[] array = null;
        Ex3.isNegativeSumEqualsPositiveSum(array);
    }
}
