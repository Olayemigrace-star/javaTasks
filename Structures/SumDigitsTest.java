import org.junit.jupiter.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumDigitsTest {
    @Test
    public void testToCalculateTheSumOfIntegers(){
        int number = 123;
        int expectedValue = 6;
        int actualValue = SumDigits.sumOfDigits(number);
        assertEquals(expectedValue, actualValue);
    }
}
