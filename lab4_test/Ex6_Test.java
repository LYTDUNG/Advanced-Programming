package lab4_5_test.lab4_test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import lab4_5.lab4.Ex6;

public class Ex6_Test {
	@Test
	public void testIsIncreasing() {
		int[] array1 = { 1, 2, 3, 4, 5 };
		assertTrue(Ex6.isIncreasing(array1));

		int[] array2 = { 1, 2, 3, 5, 4 };
		assertFalse(Ex6.isIncreasing(array2));

		int[] array3 = { -1, 0, 0, 1 };
		assertTrue(Ex6.isIncreasing(array3));
	}

	@Test
	public void testSortIncreasing() {
		int[] array1 = { 5, 4, 3, 2, 1 };
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, Ex6.sortIncreasing(array1));

		int[] array2 = { 1, 2, 3, 3, 2, 1 };
		assertArrayEquals(new int[] { 1, 1, 2, 2, 3, 3 }, Ex6.sortIncreasing(array2));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testIsIncreasingWithNullArray() {
		int[] array = null;
		Ex6.isIncreasing(array);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testIsIncreasingWithEmptyArray() {
		int[] array = {};
		Ex6.isIncreasing(array);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSortIncreasingWithNullArray() {
		int[] array = null;
		Ex6.sortIncreasing(array);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSortIncreasingWithEmptyArray() {
		int[] array = {};
		Ex6.sortIncreasing(array);
	}
}
