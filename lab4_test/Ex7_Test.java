package lab4_5_test.lab4_test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import lab4_5.lab4.Ex7;

public class Ex7_Test {
	@Test
	public void testIsSymmetric() {
		int[] array1 = { 4, 2, 7, 3, 7, 2, 4 };
		assertTrue(Ex7.isSymmetric(array1));

		int[] array2 = { 1, 2, 3, 4, 5 };
		assertFalse(Ex7.isSymmetric(array2));
	}

	@Test
	public void testIsAlternatingSign() {
		int[] array1 = { 2, -1, 7, -3, 4, -5, 6, -8 };
		assertTrue(Ex7.isAlternatingSign(array1));

		int[] array2 = { 1, -2, 3, -4, -5 };
		assertFalse(Ex7.isAlternatingSign(array2));
	}

	@Test
	public void testFindMax() {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		assertEquals(9, Ex7.findMax(matrix));
	}

	@Test
	public void testFindMin() {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		assertEquals(1, Ex7.findMin(matrix));
	}

	@Test
	public void testSumMatrix() {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		assertEquals(45, Ex7.sumMatrix(matrix));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testFindMaxWithEmptyMatrix() {
		int[][] matrix = {};
		Ex7.findMax(matrix);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testFindMaxWithNullMatrix() {
		int[][] matrix = null;
		Ex7.findMax(matrix);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testFindMinWithEmptyMatrix() {
		int[][] matrix = {};
		Ex7.findMin(matrix);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testFindMinWithNullMatrix() {
		int[][] matrix = null;
		Ex7.findMin(matrix);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSumMatrixWithEmptyMatrix() {
		int[][] matrix = {};
		Ex7.sumMatrix(matrix);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSumMatrixWithNullMatrix() {
		int[][] matrix = null;
		Ex7.sumMatrix(matrix);
	}
}
