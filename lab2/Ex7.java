package lab2;

public class Ex7 {
	public static String triangleType(double a, double b, double c) {
		if (!isTriangle(a, b, c)) {
			return "Khong phai tam giac";
		} else if (a == b && b == c) {
			return "Tam giac đeu";
		} else if (a == b || b == c || a == c) {
			if (isRightTriangle(a, b, c)) {
				return "Tam giac vuong can";
			} else {
				return "Tam giac can";
			}
		} else {
			if (isRightTriangle(a, b, c)) {
				return "Tam giac vuong";
			} else {
				return "Tam giac thuong";
			}
		}
	}

	private static boolean isTriangle(double a, double b, double c) {
		return (a + b > c) && (a + c > b) && (b + c > a);
	}

	private static boolean isRightTriangle(double a, double b, double c) {
		double aSquared = a * a;
		double bSquared = b * b;
		double cSquared = c * c;

		return Math.abs(aSquared + bSquared - cSquared) < 0.0001 || Math.abs(aSquared + cSquared - bSquared) < 0.0001
				|| Math.abs(bSquared + cSquared - aSquared) < 0.0001;
	}
}
