package lab3;

import java.util.ArrayList;

public class Ex5 {
	// Method finds the largest odd divisor of a given number. 
    public static int findLargestOddDivisor(int n) {
        for (int i = n; i >= 1; i--) {
            if (n % i == 0 && i % 2 != 0) {
                return i;
            }
        }
        return -1; 
    }

    // Method to check whether a number is prime or not.
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to factorize a number into its prime factors.
    public static ArrayList<Integer> primeFactorization(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        int divisor = 2;
        while (n > 1) {
            if (n % divisor == 0) {
                factors.add(divisor);
                n /= divisor;
            } else {
                divisor++;
            }
        }
        return factors;
    }

    // Method to find and print all prime numbers smaller than n.
    public static void printPrimesLessThanN(int n) {
        System.out.println("Prime numbers smaller than " + n + ":");
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
