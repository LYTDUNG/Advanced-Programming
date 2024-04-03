package lab2;

public class Ex3 {
	// Tim nghiem cua phưong trinh ax + b = 0
	public static double findRoot(double a, double b) {
		double root;
		if (a == 0) {
			if (b == 0) {
				// Phương trinh vo so nghiem
				root = Double.POSITIVE_INFINITY;
			} else {
				// Phương trình vo nghiem
				root = Double.NaN;
			}
		} else {
			// Phuong trinh co mot nghiem
			root = -b / a;
		}
		return root;
	}
}
