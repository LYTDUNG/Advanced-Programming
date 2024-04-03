package lab4_5_test.lab5_test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import lab4_5.lab5.Ex2;

public class Ex2_Test {
    @Test
    public void testIsUpperTriangular() {
        int[][] matrix1 = {
            {1, 2, 3},
            {0, 4, 5},
            {0, 0, 6}
        };
        assertTrue(Ex2.isUpperTriangular(matrix1));

        int[][] matrix2 = {
            {1, 2, 0},
            {0, 4, 5},
            {0, 1, 6}
        };
        assertFalse(Ex2.isUpperTriangular(matrix2));
    }

    @Test
    public void testIsSymmetricAcrossMainDiagonal() {
        int[][] matrix1 = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        assertTrue(Ex2.isSymmetricAcrossMainDiagonal(matrix1));

        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        assertFalse(Ex2.isSymmetricAcrossMainDiagonal(matrix2));
    }

    @Test
    public void testIsSymmetricAcrossCenter() {
        int[][] matrix1 = {
            {1, 2, 1},
            {2, 3, 2},
            {1, 2, 1}
        };
        assertTrue(Ex2.isSymmetricAcrossCenter(matrix1));

        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        assertFalse(Ex2.isSymmetricAcrossCenter(matrix2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsUpperTriangularWithEmptyMatrix() {
        int[][] matrix = {};
        Ex2.isUpperTriangular(matrix);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsUpperTriangularWithNullMatrix() {
        int[][] matrix = null;
        Ex2.isUpperTriangular(matrix);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSymmetricAcrossMainDiagonalWithEmptyMatrix() {
        int[][] matrix = {};
        Ex2.isSymmetricAcrossMainDiagonal(matrix);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSymmetricAcrossMainDiagonalWithNullMatrix() {
        int[][] matrix = null;
        Ex2.isSymmetricAcrossMainDiagonal(matrix);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsSymmetricAcrossCenterWithEmptyMatrix() {
        int[][] matrix = {};
        Ex2.isSymmetricAcrossCenter(matrix);
    }
}
