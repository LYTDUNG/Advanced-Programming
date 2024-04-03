package lab1;

import java.util.Scanner;

public class Ex1 {
    public static float multiplyNumbers(int a, float b) {
        return a * b;
    }

    public static void main(String[] args) {
        //bat dau nhap tu ban phim
    	Scanner sc = new Scanner(System.in);
        //hien thi ra thong bao 
        System.out.println("Please input one integer and one floating-point number :");
        //nhap tu ban phim mot so nguyen x
        int num1 = sc.nextInt();
        //nhap tu ban phim mot so thap phan y
        float num2 = sc.nextFloat();
        //nhan hai so x va y 
        float product = multiplyNumbers(num1, num2);
        //in ra man hinh 
        System.out.println("Input values are " + num1 + " and " + num2 + ", their product is " + product);
        //ket thuc nhap scanner
        sc.close();
    } 
}
