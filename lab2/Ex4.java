package lab2;

public class Ex4 {
	public static String findRoot(double a, double b, double c) {
		double delta = b * b - 4 * a * c;
		double x1, x2;
		if (delta > 0) {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			return String.format("Phuong trinh co hai nghiem phan biet: x1 = %15.8f, x2 = %15.8f", x1, x2);
		} else if (delta == 0) {
			x1 = -b / (2 * a);
			return String.format("Phuong trinh co mot nghiem duy nhat: x = %15.8f", x1);
		} else {
			return "Phuong trinh vo nghiem";
		}
	}
}
