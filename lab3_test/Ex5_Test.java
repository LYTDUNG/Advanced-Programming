package lab3_test;

import org.junit.Test;

import lab3.Ex5;

import java.util.ArrayList;
import static org.junit.Assert.*;

public class Ex5_Test {
    @Test
    public void testFindLargestOddDivisor() {
        assertEquals(9, Ex5.findLargestOddDivisor(18));
        assertEquals(15, Ex5.findLargestOddDivisor(30));
        assertEquals(25, Ex5.findLargestOddDivisor(50));
    }

    @Test
    public void testIsPrime() {
        assertFalse(Ex5.isPrime(1));
        assertTrue(Ex5.isPrime(2));
        assertTrue(Ex5.isPrime(3));
        assertFalse(Ex5.isPrime(4));
        assertTrue(Ex5.isPrime(5));
    }

    @Test
    public void testPrimeFactorization() {
        ArrayList<Integer> factors1 = new ArrayList<>();
        factors1.add(2); factors1.add(3);
        assertEquals(factors1, Ex5.primeFactorization(6));

        ArrayList<Integer> factors2 = new ArrayList<>();
        factors2.add(3); factors2.add(5);
        assertEquals(factors2, Ex5.primeFactorization(15));

        ArrayList<Integer> factors3 = new ArrayList<>();
        factors3.add(2); factors3.add(5);
        assertEquals(factors3, Ex5.primeFactorization(10));
    }

    @Test
    public void testPrintPrimesLessThanN() {
        System.out.println("Prime numbers smaller than 20:");
        Ex5.printPrimesLessThanN(20);
    }
}

