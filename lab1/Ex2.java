package lab1;

import java.util.Scanner;

public class Ex2 {
	public static int calculateY(int x) {

		return 4 * (x - 3) + 20;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Nhap tu ban phim mot so nguyen x
		System.out.print("Nhap gia tri cua x: ");
		int x = sc.nextInt();

		// y duoc tinh theo x
		int y = 4 * (x - 3) + 20;

		// In gia tri cua y ra man hinh
		System.out.println("Gia tri cua y la: " + y);

		// Đong Scanner
		sc.close();
	}

}
