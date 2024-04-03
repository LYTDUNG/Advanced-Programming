package lab2;

public class Ex10 {
    public static String nextDay(int d, int m, int y) {
        if (!isValidDate(d, m, y)) {
            return "Ngày không hợp lệ";
        }

        // Tìm ra ngày hôm sau
        if (d == 30 && (m == 4 || m == 6 || m == 9 || m == 11)) {
            d = 1;
            m++;
        } else if (d == 31 && m != 12) {
            d = 1;
            m++;
        } else if (d == 31 && m == 12) {
            d = 1;
            m = 1;
            y++;
        } else if (m == 2 && isLeapYear(y) && d == 29) {
            d = 1;
            m++;
        } else if (m == 2 && !isLeapYear(y) && d == 28) {
            d = 1;
            m++;
        } else {
            d++;
        }

        // Trả về ngày hôm sau
        return d + "/" + m + "/" + y;
    }

    private static boolean isValidDate(int d, int m, int y) {
        // Kiểm tra năm, tháng và ngày có hợp lệ không
        if (y < 1 || m < 1 || m > 12 || d < 1) {
            return false;
        }
        if (m == 4 || m == 6 || m == 9 || m == 11) {
            return d <= 30;
        } else if (m == 2) {
            if (isLeapYear(y)) {
                return d <= 29;
            } else {
                return d <= 28;
            }
        } else {
            return d <= 31;
        }
    }

    private static boolean isLeapYear(int y) {
        // Kiểm tra năm nhuận
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }
}
