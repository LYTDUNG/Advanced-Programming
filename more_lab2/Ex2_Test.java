package more_lab2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Ex2_Test {

    @Test
    public void testMonday() {
        assertEquals("Monday", "The corresponding day is: Monday", Ex2.getDayOfWeek(1));
    }

    @Test
    public void testWednesday() {
        assertEquals("Wednesday", "The corresponding day is: Wednesday", Ex2.getDayOfWeek(3));
    }

    @Test
    public void testSunday() {
        assertEquals("Sunday", "The corresponding day is: Sunday", Ex2.getDayOfWeek(7));
    }

    @Test
    public void testInvalidDay() {
        assertEquals("Invalid day", "The corresponding day is: Invalid day", Ex2.getDayOfWeek(10));
    }
}
