package lab2_test;

import static org.junit.Assert.*;
import org.junit.Test;

import lab2.Ex1;

public class Ex1_Test {

	@Test
	public void testFindMax() {
		assertEquals(5.0, Ex1.findMax(5.0, 3.0), 0.0);
		assertEquals(8.0, Ex1.findMax(4.0, 8.0), 0.0);
		assertEquals(10.0, Ex1.findMax(10.0, 10.0), 0.0);
	}
}
