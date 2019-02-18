package at.spengergasse;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MyTest {
    private static final String EOL =
            System.getProperty("line.separator");

    @Test
    public void testShowUsageWhenInsufficientArgumentsSupplied() {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        PrintStream console = System.out;
        try {
            System.setOut(new PrintStream(bytes));
            Main.main(new String[]{});
        } finally {
            System.setOut(console);
        }
        assertEquals(String.format(
                "18" + "155" + "23", EOL, EOL,EOL),
                bytes.toString());
    }
}
