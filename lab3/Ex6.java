package lab3;

public class Ex6 {
    public static void main(String[] args) {
        for (int i = 0; i <= 90; i += 10) {
            double radians = Math.toRadians(i);
            double sinValue = Math.sin(radians);
            double cosValue = Math.cos(radians);
            double tanValue = Math.tan(radians);
            double cotanValue = 1.0 / tanValue;

            System.out.println("Angle " + i + " degrees:");
            System.out.println("Sin: " + sinValue);
            System.out.println("Cos: " + cosValue);
            System.out.println("Tang: " + tanValue);
            System.out.println("Cotang: " + cotanValue);
            System.out.println();
        }
    }
}
