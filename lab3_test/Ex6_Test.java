package lab3_test;

import org.junit.Test;
import static org.junit.Assert.*;

public class Ex6_Test {
    @Test
    public void testSinCosTanCotan() {
        for (int i = 0; i <= 90; i += 10) {
            double radians = Math.toRadians(i);
            double sinValue = Math.sin(radians);
            double cosValue = Math.cos(radians);
            double tanValue = Math.tan(radians);
            double cotanValue = 1.0 / tanValue;

            // test
            assertEquals(Math.sin(radians), sinValue, 0.001);
            assertEquals(Math.cos(radians), cosValue, 0.001);
            assertEquals(Math.tan(radians), tanValue, 0.001);
            assertEquals(1.0 / Math.tan(radians), cotanValue, 0.001);
        }
    }
}
