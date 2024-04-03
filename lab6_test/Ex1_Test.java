package lab6_test;
import org.junit.jupiter.api.Test;

import lab6.Ex1;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex1_Test {
    @Test
    public void testReverseString() {
        assertEquals("cba", Ex1.reverseString("abc"));
    }

    @Test
    public void testReverseString_EmptyString() {
        assertEquals("", Ex1.reverseString(""));
    }

    @Test
    public void testReverseString_SingleCharacter() {
        assertEquals("a", Ex1.reverseString("a"));
    }

    @Test
    public void testReverseString_LongString() {
        assertEquals("987654321", Ex1.reverseString("123456789"));
    }
}

