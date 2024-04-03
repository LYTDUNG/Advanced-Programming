package lab4_5_test.lab5_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import lab4_5.lab5.Ex1;

public class Ex1_Test {
    @Test
    public void testFindMax() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertEquals(9, Ex1.findMax(matrix));
    }

    @Test
    public void testFindMin() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertEquals(1, Ex1.findMin(matrix));
    }

    @Test
    public void testSumMatrix() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertEquals(45, Ex1.sumMatrix(matrix));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxWithEmptyMatrix() {
        int[][] matrix = {};
        Ex1.findMax(matrix);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxWithNullMatrix() {
        int[][] matrix = null;
        Ex1.findMax(matrix);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMinWithEmptyMatrix() {
        int[][] matrix = {};
        Ex1.findMin(matrix);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMinWithNullMatrix() {
        int[][] matrix = null;
        Ex1.findMin(matrix);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSumMatrixWithEmptyMatrix() {
        int[][] matrix = {};
        Ex1.sumMatrix(matrix);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSumMatrixWithNullMatrix() {
        int[][] matrix = null;
        Ex1.sumMatrix(matrix);
    }
}

