package lab4_5_test.lab5_test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import lab4_5.lab5.Ex6;

public class Ex6_Test {
    @Test
    public void testMatrixMultiplication() {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] B = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        int[][] expected = {
            {58, 64},
            {139, 154}
        };

        assertArrayEquals(expected, Ex6.matrixMultiplication(A, B));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMatrixMultiplicationWithNullMatrix() {
        int[][] A = null;
        int[][] B = null;
        Ex6.matrixMultiplication(A, B);
    }

    @Test
    public void testMatrixMultiplicationWithCompatibleDimensions() {
        int[][] A = {
            {1, 2},
            {3, 4}
        };

        int[][] B = {
            {1, 2},
            {4, 5}
        };

        int[][] expectedResult = {
            {9, 12},
            {19, 26}
        };

        int[][] result = Ex6.matrixMultiplication(A, B);

        assertArrayEquals(expectedResult, result);
    }



}

