package lab2;

public class Ex9 {
    private static final String[] ones = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
    private static final String[] teens = {"mười", "mười một", "mười hai", "mười ba", "mười bốn", "mười lăm", "mười sáu", "mười bảy", "mười tám", "mười chín"};
    private static final String[] tens = {"", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};
    private static final String HUNDRED = "trăm";
    private static final String EMPTY = "không";

    public static String convert(int number) {
        if (number < 0 || number >= 1000) {
            return "Số không hợp lệ";
        }

        if (number == 0) {
            return EMPTY;
        }

        String words = "";

        if (number >= 100) {
            words += ones[number / 100] + " " + HUNDRED + " ";
            number %= 100;
        }

        if (number >= 10 && number <= 19) {
            if (number % 10 == 0) {
                words += teens[0];
            } else {
                words += teens[number % 10];
            }
        } else {
            words += tens[number / 10];
            if (number % 10 > 0) {
                words += " " + ones[number % 10];
            }
        }

        return words.trim();
    }
}
