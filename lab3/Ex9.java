package lab3;

public class Ex9 {
	public static double calculateWithdrawal(double P, double r, int n) {
        double F = P * Math.pow((1 + r), n);
        return F;
    }
    
    public static double calculateExpectedValue(double P, double r, int n) {
        double F = P;
        for (int i = 0; i < n; i++) {
            F *= (1 + r);
        }
        return F;
    }
}

