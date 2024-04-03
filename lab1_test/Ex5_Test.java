package lab1_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import lab1.Ex5;

public class Ex5_Test {
    @Test
    public void testTimeConversion() {
        assertEquals("0:0:0", Ex5.convertSecondsToHMS(0));
        assertEquals("0:0:1", Ex5.convertSecondsToHMS(1));
        assertEquals("0:1:0", Ex5.convertSecondsToHMS(60));
        assertEquals("1:0:0", Ex5.convertSecondsToHMS(3600));
        assertEquals("0:33:19", Ex5.convertSecondsToHMS(1999));
        assertEquals("23:59:59", Ex5.convertSecondsToHMS(86399));
        assertEquals("24:0:0", Ex5.convertSecondsToHMS(86400));
        assertEquals("123:45:6", Ex5.convertSecondsToHMS(445506));
    }
}
