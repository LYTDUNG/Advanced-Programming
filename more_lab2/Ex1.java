package more_lab2;

public class Ex1 {
    public static String checkNumber(int number) {
        if (number > 0) {
            return number + " is positive.";
        } else if (number < 0) {
            return number + " is negative.";
        } else {
            return "The number is zero.";
        }
    }

}
