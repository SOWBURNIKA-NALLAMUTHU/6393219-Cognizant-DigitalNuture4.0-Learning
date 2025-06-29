import org.junit.Test;
import static org.junit.Assert.*;

public class Calculator {

    @Test
    public void testAdd() {
        int a = 5;
        int b = 3;
        int expected = 8;
        int result = a + b;

        assertEquals(expected, result);
    }
}
