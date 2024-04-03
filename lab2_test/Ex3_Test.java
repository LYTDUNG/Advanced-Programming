package lab2_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import lab2.Ex3;

public class Ex3_Test {
	@Test
	public void testFindRoot() {
		// Test cases for different coefficients a and b
		assertEquals(2.0, Ex3.findRoot(1.0, -2.0)); // x = 2
		assertEquals(-1.0, Ex3.findRoot(1.0, 1.0)); // x = -1
		assertEquals(Double.POSITIVE_INFINITY, Ex3.findRoot(0.0, 0.0)); // Infinite solutions
		assertEquals(Double.NaN, Ex3.findRoot(0.0, 2.0)); // No solution
	}
}
