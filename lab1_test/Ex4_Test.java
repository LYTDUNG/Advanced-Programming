package lab1_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import lab1.Ex4;

public class Ex4_Test {
    @Test
    public void testCalculateCircumference() {
        assertEquals(31.41592653589793, Ex4.calculateCircumference(5));
        assertEquals(62.83185307179586, Ex4.calculateCircumference(10));
    }

    @Test
    public void testCalculateArea() {
        assertEquals(78.53981633974483, Ex4.calculateArea(5));
        assertEquals(314.1592653589793, Ex4.calculateArea(10));
    }
}

