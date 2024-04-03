package lab4_5_test.lab5_test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import lab4_5.lab5.Ex5;

public class Ex5_Test {
    @Test
    public void testAddMatrices() {
        double[][] A = {
            {1.5, 2.5},
            {3.5, 4.5}
        };

        double[][] B = {
            {0.5, 1.5},
            {2.5, 3.5}
        };

        double[][] expected = {
            {2.0, 4.0},
            {6.0, 8.0}
        };

        assertArrayEquals(expected, Ex5.addMatrices(A, B));
    }

    @Test
    public void testSubtractMatrices() {
        double[][] A = {
            {1.5, 2.5},
            {3.5, 4.5}
        };

        double[][] B = {
            {0.5, 1.5},
            {2.5, 3.5}
        };

        double[][] expected = {
            {1.0, 1.0},
            {1.0, 1.0}
        };

        assertArrayEquals(expected, Ex5.subtractMatrices(A, B));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddMatricesWithNullMatrix() {
        double[][] A = null;
        double[][] B = null;
        Ex5.addMatrices(A, B);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddMatricesWithDifferentDimensions() {
        double[][] A = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        double[][] B = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0}
        };

        Ex5.addMatrices(A, B);
    }
}
