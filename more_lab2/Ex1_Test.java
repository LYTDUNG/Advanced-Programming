package more_lab2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Ex1_Test {
    @Test
    public void testPositive() {
        int positiveNumber = 10;
        assertEquals("Positive number", "10 is positive.", Ex1.checkNumber(positiveNumber));
    }

    @Test
    public void testNegative() {
        int negativeNumber = -5;
        assertEquals("Negative number", "-5 is negative.", Ex1.checkNumber(negativeNumber));
    }

    @Test
    public void testZero() {
        int zero = 0;
        assertEquals("Zero", "The number is zero.", Ex1.checkNumber(zero));
    }
}
