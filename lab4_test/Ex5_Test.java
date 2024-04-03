package lab4_5_test.lab4_test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import lab4_5.lab4.Ex5;

public class Ex5_Test {
    @Test
    public void testContainsElement() {
        int[] array = {1, 2, 3, 4, 5};
        assertTrue(Ex5.containsElement(array, 3));
        assertFalse(Ex5.containsElement(array, 6));
    }

    @Test
    public void testCountOccurrences() {
        int[] array = {1, 2, 3, 4, 5, 3};
        assertEquals(2, Ex5.countOccurrences(array, 3));
        assertEquals(0, Ex5.countOccurrences(array, 6));
    }

    @Test
    public void testRemoveElements() {
        int[] array = {1, 2, 3, 4, 5, 3};
        assertArrayEquals(new int[]{1, 2, 4, 5}, Ex5.removeElements(array, 3));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 3}, array); // Original array should remain unchanged
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveElementsWithNullArray() {
        int[] array = null;
        Ex5.removeElements(array, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveElementsWithEmptyArray() {
        int[] array = {};
        Ex5.removeElements(array, 3);
    }
}
