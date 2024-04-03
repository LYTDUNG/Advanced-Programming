package lab3_test;

import lab3.Ex2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Ex2_Test {
    @Test
    public void testCountDigits() {
        assertEquals(1, Ex2.countDigits(0));
        assertEquals(1, Ex2.countDigits(5));
        assertEquals(3, Ex2.countDigits(123));
        assertEquals(5, Ex2.countDigits(12345));
        assertEquals(10, Ex2.countDigits(1234567890));
    }

    @Test
    public void testReverseNumber() {
        assertEquals(0, Ex2.reverseNumber(0));
        assertEquals(5, Ex2.reverseNumber(5));
        assertEquals(321, Ex2.reverseNumber(123));
        assertEquals(54321, Ex2.reverseNumber(12345));
        assertEquals(987654321, Ex2.reverseNumber(123456789));
    }
}
