import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void testEmptyReturnsZero() {
        String result = stringCalculator.add("");
        assertEquals("0", result);
    }
}
