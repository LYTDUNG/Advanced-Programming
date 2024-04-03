package lab4_5.lab5;

import java.util.Scanner;

public class Ex7 {

	public static void printPascalTriangle(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("n must be a non-negative integer");
		}

		for (int line = 0; line <= n; line++) {
			for (int i = 0; i <= line; i++) {
				System.out.print(binomialCoefficient(line, i) + " ");
			}
			System.out.println();
		}
	}

	private static int binomialCoefficient(int n, int k) {
		if (k == 0 || k == n) {
			return 1;
		}

		int[][] dp = new int[n + 1][k + 1];

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= Math.min(i, k); j++) {
				if (j == 0 || j == i) {
					dp[i][j] = 1;
				} else {
					dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
				}
			}
		}

		return dp[n][k];
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows for Pascal's triangle: ");
		int n = scanner.nextInt();
		scanner.close();
		printPascalTriangle(n);
	}
}
