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

    @Test
    public void testSingleInput(){
        String result = stringCalculator.add("1");
        assertEquals("1", result);
    }

    @Test
    public void testReturnsSum(){
        String result = stringCalculator.add("1,2");
        assertEquals("3", result);
    }

    @Test
    public void testSplitByNewline(){
        String result = stringCalculator.add("3\n4");
        assertEquals("7", result);
    }
}
