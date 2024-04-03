package lab1_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import lab1.Ex2;

public class Ex2_Test {
    @Test
    public void testEx2() {
        //  x = 0
        assertEquals(8, Ex2.calculateY(0));

        //  x = 3
        assertEquals(20, Ex2.calculateY(3));

        //  x = 5
        assertEquals(28, Ex2.calculateY(5));

        //  x = -2
        assertEquals(0, Ex2.calculateY(-2));
    }
}
