package lab2;

public class Ex5 {
	public static double findIntersectionLength(double a1, double b1, double a2, double b2) {
		double intersectionLength = Math.min(b1, b2) - Math.max(a1, a2);
		return intersectionLength < 0 ? 0 : intersectionLength;
	}

	public static double findUnionLength(double a1, double b1, double a2, double b2) {
		double unionLength = Math.max(b1, b2) - Math.min(a1, a2);
		return unionLength;
	}
}
