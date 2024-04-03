package lab4_5_test.lab4_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import lab4_5.lab4.Ex8;

public class Ex8_Test {
    @Test
    public void testFindRowWithMaxSum() {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        assertEquals(2, Ex8.findRowWithMaxSum(matrix1));

        int[][] matrix2 = {
            {-1, -2, -3},
            {4, 5, 6},
            {-7, 8, 9}
        };
        assertEquals(1, Ex8.findRowWithMaxSum(matrix2));

        int[][] matrix3 = {
            {-1, -2, -3},
            {-4, -5, -6},
            {-7, -8, -9}
        };
        assertEquals(0, Ex8.findRowWithMaxSum(matrix3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindRowWithMaxSumWithEmptyMatrix() {
        int[][] matrix = {};
        Ex8.findRowWithMaxSum(matrix);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindRowWithMaxSumWithNullMatrix() {
        int[][] matrix = null;
        Ex8.findRowWithMaxSum(matrix);
    }
}

