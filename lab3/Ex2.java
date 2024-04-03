package lab3;

public class Ex2 {
    public static int countDigits(int n) {
        //integer = 0 => 1
    	if (n == 0) {
            return 1; 
        }
    	//integer !=0 => n/10 => count++
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static int reverseNumber(int n) {
    	int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }
}
