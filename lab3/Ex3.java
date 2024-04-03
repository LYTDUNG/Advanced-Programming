package lab3;

import java.util.Scanner;

public class Ex3 {
    public static int yearsToDoubleAge(int fatherAge, int sonAge) {
        int years = 0;
        while (fatherAge != 2 * sonAge) {
            fatherAge++;
            sonAge++;
            years++;
        }
        return years;
    }

  //  Test fatherage and sonage in main 
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Father's age: ");
        int fatherAge = scanner.nextInt();
        System.out.printf("Son's age: ");
        int sonAge = scanner.nextInt();
        scanner.close();

        int yearsNeeded = yearsToDoubleAge(fatherAge, sonAge);
        System.out.println("After " + yearsNeeded + " years, the father's age will be double the son's age.");
    }
}
