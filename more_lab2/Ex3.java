package more_lab2;

public class Ex3 {

    public static double calculateSalary(double regularRate, int hoursWorked) {
        double totalSalary;

        if (hoursWorked <= 40) {
            totalSalary = regularRate * hoursWorked;
        } else {
            int regularHours = 40;
            int overtimeHours = hoursWorked - regularHours;
            double overtimeRate = 1.5 * regularRate;
            totalSalary = (regularRate * regularHours) + (overtimeRate * overtimeHours);
        }

        return totalSalary;
    }

    public static void main(String[] args) {
        double regularRate = 10.0; // Regular hourly rate
        int hoursWorked = 45; // Total hours worked

        double totalSalary = calculateSalary(regularRate, hoursWorked);

        System.out.println("Total salary: $" + totalSalary);
    }
}
