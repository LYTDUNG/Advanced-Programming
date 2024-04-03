package lab2_test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import lab2.Ex6;

public class Ex6_Test {
	@Test
	public void testIsTriangle() {
		assertTrue(Ex6.isTriangle(3, 4, 5)); // Tam giác vuông
		assertFalse(Ex6.isTriangle(1, 2, 5));// Không là tam giác
		assertFalse(Ex6.isTriangle(0, 0, 0));// Không là tam giác
		assertTrue(Ex6.isTriangle(6, 8, 10)); // Tam giác vuông cân
		assertTrue(Ex6.isTriangle(7, 7, 7)); // Tam giác đều
	}

	@Test
	public void testCalculatePerimeter() {
		assertEquals(12.0, Ex6.calculatePerimeter(3, 4, 5)); // Chu vi tam giác vuông
		assertEquals(13.0, Ex6.calculatePerimeter(5, 5, 3)); // Chu vi tam giác cân
		assertEquals(15.0, Ex6.calculatePerimeter(5, 6, 4)); // Chu vi tam giác bất kỳ
	}

	@Test
	public void testCalculateArea() {
		assertEquals(6.0, Ex6.calculateArea(3, 4, 5), 0.01); // Diện tích tam giác vuông
		assertEquals(10.825, Ex6.calculateArea(5, 5, 5), 0.01); // Diện tích tam giác cân
		assertEquals(9.92, Ex6.calculateArea(5, 6, 4), 0.01); // Diện tích tam giác bất kỳ, được làm tròn đến 2 chữ số
																// thập phân
	}

	@Test
	public void testCalculateAngle() {
		assertEquals(90.0, Ex6.calculateAngle(5, 4, 3), 0.01); // Góc vuông
		assertEquals(36.87, Ex6.calculateAngle(9, 12, 15), 0.01); // Góc trong tam giác bất kỳ, được làm tròn đến 2 chữ
																	// số thập phân

	}

}
