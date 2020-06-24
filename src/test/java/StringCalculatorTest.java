import org.junit.Test;
import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void testEmptyReturnsZero() {
        StringCalculator stringCalculator = new StringCalculator();

        String result = stringCalculator.add("");
        assertEquals("0", result);
    }

}
