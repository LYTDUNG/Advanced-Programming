package lab4_5_test.lab4_test;

import org.junit.Test;

import lab4_5.lab4.Ex1;

import static org.junit.Assert.*;

public class Ex1_Test {
    @Test
    public void testFindMax() {
        int[] arr = {1, 3, 5, 2, 4};
        int[] result = Ex1.findMax(arr);
        assertArrayEquals(new int[]{2, 5}, result);
    }

    @Test
    public void testFindMin() {
        int[] arr = {1, 3, 5, 2, 4};
        int[] result = Ex1.findMin(arr);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void testCalculateSum() {
        int[] arr = {1, 3, 5, 2, 4};
        int sum = Ex1.calculateSum(arr);
        assertEquals(15, sum);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxWithNullArray() {
        int[] arr = null;
        Ex1.findMax(arr);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMinWithEmptyArray() {
        int[] arr = {};
        Ex1.findMin(arr);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateSumWithNullArray() {
        int[] arr = null;
        Ex1.calculateSum(arr);
    }
}
