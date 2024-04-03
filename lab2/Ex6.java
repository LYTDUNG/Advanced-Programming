package lab2;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ba so a, b, c: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();

		if (isTriangle(a, b, c)) {
			double perimeter = calculatePerimeter(a, b, c);
			double area = calculateArea(a, b, c);
			double angleA = calculateAngle(a, b, c);
			double angleB = calculateAngle(b, c, a);
			double angleC = calculateAngle(c, a, b);

			System.out.println("Chu vi cua tam giac la: " + perimeter);
			System.out.println("Dien tich cua tam giac la: " + area);
			System.out.println("Goc A: " + angleA);
			System.out.println("Goc B: " + angleB);
			System.out.println("Goc C: " + angleC);
		} else {
			System.out.println("Ba so khong tao thanh tam giac.");
		}
		scanner.close();
	}

	public static boolean isTriangle(double a, double b, double c) {
		return (a + b > c) && (a + c > b) && (b + c > a);
	}

	public static double calculatePerimeter(double a, double b, double c) {
		return a + b + c;
	}

	public static double calculateArea(double a, double b, double c) {
		double p = calculatePerimeter(a, b, c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	public static double calculateAngle(double x, double y, double z) {
		double cosA = (y * y + z * z - x * x) / (2 * y * z);
		// Đảm bảo cosA nằm trong khoảng [-1, 1] để tránh lỗi khi tính arccosin
		cosA = Math.max(-1, Math.min(1, cosA));
		double angleA = Math.toDegrees(Math.acos(cosA));
		return angleA;
	}

}
