package lab2;

public class Ex2 {
	// Kiem tra xem co phai la nam nhuan hay khong
	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}

	// Tinh so ngay trong thang dua vao nam va thang
	public static int getNumberOfDays(int month, int year) {
		if (month == 2) {
			return isLeapYear(year) ? 29 : 28;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		} else {
			return 31;
		}
	}
}
