package lab2_test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import lab2.Ex8;

public class Ex8_Test {
	@Test
	public void testGetLunarYear() {
		assertEquals("Mậu Dần", Ex8.getLunarYear(1998));
		assertEquals("Giáp Thìn", Ex8.getLunarYear(2024));
		assertEquals("Ất Mão", Ex8.getLunarYear(1975));
		assertEquals("Canh Thân", Ex8.getLunarYear(1980));
	}
}
