package lab1;

import java.util.Scanner;

public class Ex5 {
    public static String convertSecondsToHMS(int totalSeconds) {
        
    	int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;
        
        return hours + ":" + minutes + ":" + seconds;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap vao tong so giay: ");
        int totalSeconds = scanner.nextInt();
        
        String result = convertSecondsToHMS(totalSeconds);
        System.out.println(totalSeconds + " giay = " + result);
        
        scanner.close();
    }
}
