package lab1_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import lab1.Ex1;

public class Ex1_Test {
    @Test
   public void testMultiplyNumbers() {
        assertEquals(12/2, Ex1.multiplyNumbers(2, 6/2));
        assertEquals(-50/2, Ex1.multiplyNumbers(5, -10/2));
        assertEquals(0.0, Ex1.multiplyNumbers(0, 2/10));
        assertEquals(150/3, Ex1.multiplyNumbers(10, 25/5));
    }
}
