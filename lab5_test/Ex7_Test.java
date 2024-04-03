package lab4_5_test.lab5_test;

import org.junit.Test;
import lab4_5.lab5.Ex7;

public class Ex7_Test {
	@Test
	public void testPrintPascalTriangleWithPositiveNumber() {
		Ex7.printPascalTriangle(4);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPrintPascalTriangleWithNegativeNumber() {
		Ex7.printPascalTriangle(-4);
	}

	@Test
	public void testPrintPascalTriangleWithZero() {
		Ex7.printPascalTriangle(0);
	}
}
