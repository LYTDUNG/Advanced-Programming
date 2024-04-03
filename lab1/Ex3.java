package lab1;

import java.util.Scanner;

public class Ex3 {
	public static double calculateKilometer(double miles) {
		return miles * 1.609;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Please input one number :");
		double miles = sc.nextDouble();

		double Kilometer = calculateKilometer(miles);
		System.out.println(miles + " miles = " + Kilometer + " km");

		sc.close();
	}
}