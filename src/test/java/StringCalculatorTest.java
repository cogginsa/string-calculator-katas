import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringCalculatorTest {
    private StringCalculator stringCalculator;

    @Before
    public void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void testEmptyReturnsZero() {
        String result = stringCalculator.add("");
        assertEquals("0", result);
    }


    @Test
    public void testSingleInputReturnsSameValue() {
        String result = stringCalculator.add("3");
        assertEquals("3", result);
    }

    @Test
    public void testSumOf2Values() {
        String result = stringCalculator.add("10,20");
        assertEquals("30", result);
    }

}
