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

    @Test
    public void testSumOfNewLineSeparatedValues() {
        String result = stringCalculator.add("1\n2");
        assertEquals("3", result);
    }

    @Test
    public void testSumOf3Values() {
        String result = stringCalculator.add("10,20,40");
        assertEquals("70", result);
        String resultByNewline = stringCalculator.add("10\n20\n40");
        assertEquals("70", resultByNewline);
    }

//    @Test(expected=NegativeNumberException.class)
//    public void testNegativeNumbersException() throws Exception {
//        String result = stringCalculator.add("-1,2,-3");
//        assertEquals("0", result);
//    }

    @Test
    public void testNumbersOver1000AreIgnored() {
        String result = stringCalculator.add("10,20,40,1002");
        assertEquals("70", result);
    }

    @Test
    public void testCustomDelimiters() {
        String result = stringCalculator.add("//#\n1#2");
        assertEquals("3", result);
    }

}
