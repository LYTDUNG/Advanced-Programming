package lab1;

import java.util.Scanner;

public class Ex4 {
    
	public static double calculateCircumference(double radius) {
        //cong thuc tinh chu vi
		return 2 * Math.PI * radius;
    }

    public static double calculateArea(double radius) {
        //cong thuc tinh dien tich
    	return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap vao ban kinh hinh tron :");
        double radius = sc.nextDouble();

        double circumference = calculateCircumference(radius);
        double area = calculateArea(radius);

        System.out.println("Chu vi la : " + circumference);
        System.out.println("Dien tich la : " + area);

        sc.close();
    }
}

