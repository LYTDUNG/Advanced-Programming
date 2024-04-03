package lab3_test;

import lab3.Ex4;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Ex4_Test {
    @Test
    public void testGreatestCommonDivisor() {
        assertEquals(5, Ex4.greatestCommonDivisor(10, 15));
        assertEquals(4, Ex4.greatestCommonDivisor(12, 16));
        assertEquals(9, Ex4.greatestCommonDivisor(27, 36));
    }

    @Test
    public void testLeastCommonMultiple() {
        assertEquals(30, Ex4.leastCommonMultiple(10, 15));
        assertEquals(48, Ex4.leastCommonMultiple(12, 16));
        assertEquals(108, Ex4.leastCommonMultiple(27, 36));
    }
}
