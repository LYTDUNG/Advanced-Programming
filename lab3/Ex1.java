package lab3;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Enter integer(Enter 0 to end):");
        Scanner scanner = new Scanner(System.in);
        processInput(scanner);
        scanner.close();
    }

    public static void processInput(Scanner scanner) {
        int sum = 0;
        int count = 0;
        int max = Integer.MIN_VALUE;

        int number = scanner.nextInt();

        while (number != 0) {
            sum += number;
            count++;
            if (number > max) {
                max = number;
            }
            number = scanner.nextInt();
        }

        double average = count > 0 ? (double) sum / count : 0;

       System.out.println("The sum is: " + sum);
       System.out.println("The average is: " + average);
       System.out.println("The max number is: " + (count > 0 ? max : "There is no maximum number entered "));
    }
}
