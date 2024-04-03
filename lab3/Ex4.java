package lab3;

public class Ex4 {
    public static int greatestCommonDivisor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int leastCommonMultiple(int a, int b) {
        return (a * b) / greatestCommonDivisor(a, b);
    }
}

