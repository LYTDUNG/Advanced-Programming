package lab1_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import lab1.Ex3;

public class Ex3_Test {
	@Test
	public void testEx3() {
		assertEquals(0, Ex3.calculateKilometer(0));
		assertEquals(1.609, Ex3.calculateKilometer(1));
		assertEquals(16.09, Ex3.calculateKilometer(10));
		assertEquals(24.135, Ex3.calculateKilometer(15),0.001);
	}
}
