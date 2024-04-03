package lab2_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import lab2.Ex9;

public class Ex9_Test {
    @Test
    public void testConvert() {
        // Test for valid numbers
        assertEquals("một", Ex9.convert(1));
        assertEquals("mười", Ex9.convert(10));
        assertEquals("mười một", Ex9.convert(11));
        assertEquals("mười hai", Ex9.convert(12));
        assertEquals("mười lăm", Ex9.convert(15));
        assertEquals("hai mươi một", Ex9.convert(21));
        assertEquals("ba mươi hai", Ex9.convert(32));
        assertEquals("năm mươi", Ex9.convert(50));
        assertEquals("bảy mươi tám", Ex9.convert(78));
        assertEquals("chín mươi chín", Ex9.convert(99));
        assertEquals("một trăm", Ex9.convert(100));
        assertEquals("một trăm mười", Ex9.convert(110));
        assertEquals("một trăm mười một", Ex9.convert(111));
        assertEquals("một trăm mười hai", Ex9.convert(112));
        assertEquals("một trăm mười lăm", Ex9.convert(115));
        assertEquals("một trăm hai mươi một", Ex9.convert(121));
        assertEquals("một trăm ba mươi hai", Ex9.convert(132));
        assertEquals("một trăm năm mươi", Ex9.convert(150));
        assertEquals("một trăm bảy mươi tám", Ex9.convert(178));
        assertEquals("một trăm chín mươi chín", Ex9.convert(199));

        // Test for invalid numbers
        assertEquals("Số không hợp lệ", Ex9.convert(-1));
        assertEquals("Số không hợp lệ", Ex9.convert(1000));
    }
}
