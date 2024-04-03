package lab2_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import lab2.Ex5;

public class Ex5_Test {
	@Test
	public void testIntersectionLength() {
		assertEquals(2.0, Ex5.findIntersectionLength(1.0, 5.0, 3.0, 7.0));
		assertEquals(0.0, Ex5.findIntersectionLength(1.0, 3.0, 4.0, 7.0));
		assertEquals(1.0, Ex5.findIntersectionLength(2.0, 4.0, 1.0, 3.0));
		assertEquals(0.0, Ex5.findIntersectionLength(1.0, 2.0, 3.0, 4.0));
	}

	@Test
	public void testUnionLength() {
		assertEquals(6.0, Ex5.findUnionLength(1.0, 5.0, 3.0, 7.0));
		assertEquals(6.0, Ex5.findUnionLength(1.0, 3.0, 4.0, 7.0));
		assertEquals(3.0, Ex5.findUnionLength(2.0, 4.0, 1.0, 3.0));
		assertEquals(3.0, Ex5.findUnionLength(1.0, 2.0, 3.0, 4.0));
	}
}
