import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StandardDeviationTest{

    @Test
    public void testToCheckForVariance(){
        double[] numbers = {28, 22, 15, 15, 20};
        double result = StandardDeviation.variance(numbers);
        double expected = 118;
        assertEquals(expected, result);
    }
    
    
    @Test
    public void testToCheckForTheStandardDeviation(){
        double[] numbers = {28, 22, 15, 15, 20};
        double result = StandardDeviation.standardDeviation(numbers);
        double expected = 4.857983120596447;
        assertEquals(expected, result);
    }
 
    }
    
