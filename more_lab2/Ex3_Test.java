package more_lab2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Ex3_Test {

    @Test
    public void testCalculateSalaryRegularHours() {
        double regularRate = 10.0;
        int hoursWorked = 40;
        double expectedSalary = 400.0; // 10.0 * 40
        assertEquals(expectedSalary, Ex3.calculateSalary(regularRate, hoursWorked), 0.0);
    }

    @Test
    public void testCalculateSalaryOvertimeHours() {
        double regularRate = 10.0;
        int hoursWorked = 45;
        double expectedSalary = 475.0; // (10.0 * 40) + (15.0 * 5)
        assertEquals(expectedSalary, Ex3.calculateSalary(regularRate, hoursWorked), 0.0);
    }

    @Test
    public void testCalculateSalaryHigherRegularRate() {
        double regularRate = 15.0;
        int hoursWorked = 50;
        double expectedSalary = 750.0; // (15.0 * 40) + (22.5 * 10)
        assertEquals(expectedSalary, Ex3.calculateSalary(regularRate, hoursWorked), 0.0);
    }
}
