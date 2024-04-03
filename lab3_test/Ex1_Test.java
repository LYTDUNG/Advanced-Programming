package lab3_test;

import org.junit.Test;
import lab3.Ex1;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class Ex1_Test {

    @Test
    public void testInput() {
        // Define the input
        String input = "5 \n 7 \n 3 \n 0 \n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());

        // Capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        // Execute the main method
        Ex1.processInput(new Scanner(inputStream));

        // Verify the output
        String[] lines = outputStream.toString().split(System.lineSeparator());
        assertEquals("The sum is: 15", lines[0]);
        assertEquals("The average is: 5.0", lines[1]);
        assertEquals("The max number is: 7", lines[2]);
   

    }
}
