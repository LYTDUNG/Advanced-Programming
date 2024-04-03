package lab4_5_test.lab5_test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import lab4_5.lab5.Ex4;

public class Ex4_Test {
    @Test
    public void testRowSum() {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[] expected = {6, 15, 24};
        assertArrayEquals(expected, Ex4.rowSum(matrix));
    }

    @Test
    public void testMaxRowSumIndex() {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        assertEquals(2, Ex4.maxRowSumIndex(matrix));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRowSumWithEmptyMatrix() {
        int[][] matrix = {};
        Ex4.rowSum(matrix);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRowSumWithNullMatrix() {
        int[][] matrix = null;
        Ex4.rowSum(matrix);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxRowSumIndexWithEmptyMatrix() {
        int[][] matrix = {};
        Ex4.maxRowSumIndex(matrix);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxRowSumIndexWithNullMatrix() {
        int[][] matrix = null;
        Ex4.maxRowSumIndex(matrix);
    }
}
