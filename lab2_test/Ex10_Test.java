package lab2_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import lab2.Ex10;

public class Ex10_Test {
    @Test
    public void testNextDay() {
        assertEquals("2/3/1996", Ex10.nextDay(1, 3, 1996));
        assertEquals("1/3/1996", Ex10.nextDay(29, 2, 1996));
        assertEquals("1/12/2000", Ex10.nextDay(30, 11, 2000));
        assertEquals("1/1/2001", Ex10.nextDay(31, 12, 2000));
        assertEquals("2/3/2000", Ex10.nextDay(1, 3, 2000));
        assertEquals("29/2/2000", Ex10.nextDay(28, 2, 2000));
        assertEquals("Ngày không hợp lệ", Ex10.nextDay(32, 1, 2000));
        assertEquals("Ngày không hợp lệ", Ex10.nextDay(30, 2, 2001));
        assertEquals("Ngày không hợp lệ", Ex10.nextDay(31, 4, 2000));
    }
}
