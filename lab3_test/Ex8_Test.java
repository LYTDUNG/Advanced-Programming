package lab3_test;

import lab3.Ex8;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Ex8_Test {
    @Test
    public void testSum() {
        assertEquals(15, Ex8.sum(5));
        assertEquals(28, Ex8.sum(7));
        assertEquals(55, Ex8.sum(10));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, Ex8.factorial(5));
        assertEquals(5040, Ex8.factorial(7));
        assertEquals(3628800, Ex8.factorial(10));
    }
}

