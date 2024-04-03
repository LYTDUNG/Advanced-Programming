package lab3_test;

import lab3.Ex9;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Random;

public class Ex9_Test {
	@Test
    public void testCalculateWithdrawalWithRandomValues() {
        Random random = new Random();
        double P = random.nextDouble() * 10000; // Random value for P
        double r = random.nextDouble(); // Random value for r
        int n = random.nextInt(50); // Random value for n

        double expected = Ex9.calculateExpectedValue(P, r, n);
        double result = Ex9.calculateWithdrawal(P, r, n);

        assertEquals(expected, result, 0.001); // Compare with delta for floating-point comparison
    }
}

