package lab2_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import lab2.Ex4;

public class Ex4_Test {
	@Test
	public void testFindRoot() {
		// Test when there are two distinct roots
		String expectedRoots = String.format("Phuong trinh co hai nghiem phan biet: x1 = %15.8f, x2 = %15.8f", 3.0,
				-2.0);
		assertEquals(expectedRoots, Ex4.findRoot(1.0, -1.0, -6.0));

		// Test when there is a single root
		String expectedSingleRoot = String.format("Phuong trinh co mot nghiem duy nhat: x = %15.8f", 1.0);
		assertEquals(expectedSingleRoot, Ex4.findRoot(1.0, -2.0, 1.0));

		// Test when there are no roots
		String expectedNoRoots = "Phuong trinh vo nghiem";
		assertEquals(expectedNoRoots, Ex4.findRoot(2.0, 1.0, 2.0));
	}
}
