package lab4_5_test.lab4_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import lab4_5.lab4.Ex2;

public class Ex2_Test {
    @Test
    public void testFindMaxFrequency() {
        int[] array1 = {1, 2, 3, 4, 5, 5, 5};
        assertEquals(5, Ex2.findMaxFrequency(array1));

        int[] array2 = {5, 5, 5, 5, 5, 5};
        assertEquals(5, Ex2.findMaxFrequency(array2));

        int[] array3 = {1, 2, 3, 4};
        assertEquals(1, Ex2.findMaxFrequency(array3));

        int[] array4 = {1};
        assertEquals(1, Ex2.findMaxFrequency(array4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxFrequencyWithNullArray() {
        int[] array = null;
        Ex2.findMaxFrequency(array);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxFrequencyWithEmptyArray() {
        int[] array = {};
        Ex2.findMaxFrequency(array);
    }
}
