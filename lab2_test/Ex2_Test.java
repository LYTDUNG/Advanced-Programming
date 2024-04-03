package lab2_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import lab2.Ex2;

public class Ex2_Test {
	@Test
	public void testIsLeapYear() {
		// Kiem tra nam nhuan
		assertEquals(true, Ex2.isLeapYear(2000));
		assertEquals(true, Ex2.isLeapYear(2004));
		assertEquals(true, Ex2.isLeapYear(2020));

		// Kiem tra nam khong nhuan
		assertEquals(false, Ex2.isLeapYear(1900));
		assertEquals(false, Ex2.isLeapYear(2001));
		assertEquals(false, Ex2.isLeapYear(2100));
	}

	@Test
	public void testGetNumberOfDays() {
		// Kiem tra so ngay trong thang dua vao thang va nam
		assertEquals(31, Ex2.getNumberOfDays(1, 2022)); // 1/2022
		assertEquals(28, Ex2.getNumberOfDays(2, 2022)); // 2/2022 (nam khong nhuan)
		assertEquals(29, Ex2.getNumberOfDays(2, 2020)); // 2/2020 (nam nhuan)

	}
}
