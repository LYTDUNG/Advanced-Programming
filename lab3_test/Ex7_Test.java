package lab3_test;

import lab3.Ex7;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Ex7_Test {
    @Test
    public void testMultiplicationTable() {
        // Redirect standard output to capture printed content
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the method to print the multiplication tables
        Ex7.printMultiplicationTables();

        // Retrieve the printed content
        String printedContent = outputStream.toString();

        // Expected multiplication tables for numbers from 2 to 9
        String expected = "";
        for (int i = 2; i < 10; i++) {
            expected += "Multiplication table of " + i + ":\n";
            for (int j = 1; j <= 10; j++) {
                expected += i + " x " + j + " = " + (i * j) + "\n";
            }
            expected += "\n";
        }
        System.out.println("Expected:");
        System.out.println(expected);
        System.out.println("Actual:");
        System.out.println(printedContent);
    }
}
