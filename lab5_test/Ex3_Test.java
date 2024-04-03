package lab4_5_test.lab5_test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import lab4_5.lab5.Ex3;

public class Ex3_Test {
    @Test
    public void testTransposeMatrix() {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] expected = {
            {1, 4, 7},
            {2, 5, 8},
            {3, 6, 9}
        };

        assertArrayEquals(expected, Ex3.transposeMatrix(matrix));
    }

    @Test
    public void testSwapColumns() {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] expected = {
            {3, 2, 1},
            {6, 5, 4},
            {9, 8, 7}
        };

        assertArrayEquals(expected, Ex3.swapColumns(matrix));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTransposeMatrixWithEmptyMatrix() {
        int[][] matrix = {};
        Ex3.transposeMatrix(matrix);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTransposeMatrixWithNullMatrix() {
        int[][] matrix = null;
        Ex3.transposeMatrix(matrix);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSwapColumnsWithEmptyMatrix() {
        int[][] matrix = {};
        Ex3.swapColumns(matrix);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSwapColumnsWithNullMatrix() {
        int[][] matrix = null;
        Ex3.swapColumns(matrix);
    }
}
