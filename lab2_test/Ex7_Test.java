package lab2_test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import lab2.Ex7;

public class Ex7_Test {
	@Test
	public void testTriangleType() {
		assertEquals("Tam giac vuong", Ex7.triangleType(3, 4, 5));
		assertEquals("Tam giac thuong", Ex7.triangleType(6, 7, 8));
		assertEquals("Tam giac can", Ex7.triangleType(5, 5, 6));
		assertEquals("Tam giac vuong can", Ex7.triangleType(1, 1, Math.sqrt(2)));
		assertEquals("Tam giac đeu", Ex7.triangleType(7, 7, 7));
		assertEquals("Khong phai tam giac", Ex7.triangleType(1, 2, 5));
	}
}
