package lab3_test;

import lab3.Ex3;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Ex3_Test {
    @Test
    public void testYearsToDoubleAge() {
        assertEquals(27, Ex3.yearsToDoubleAge(35, 4));
        assertEquals(23, Ex3.yearsToDoubleAge(39, 8));
        assertEquals(10, Ex3.yearsToDoubleAge(52, 21));
        assertEquals(0, Ex3.yearsToDoubleAge(62, 31));
        
        assertEquals(18, Ex3.yearsToDoubleAge(24, 3));
        assertEquals(24, Ex3.yearsToDoubleAge(32, 4));
    }
}
