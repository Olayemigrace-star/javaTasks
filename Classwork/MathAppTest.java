import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathAppTest{

    @Test
    public void testToCheckForAddition(){
        int number1 = 20;
        int number2 = 9;
        String plus = "+";
        int result = MathApp.add(number1, number2, plus);
        int expected = 29;
        assertEquals(expected, result);
    }
    
    @Test
    public void testToCheckForProduct(){
        int number1 = 20;
        int number2 = 9;
        String product = "*";
        int result = MathApp.multiply(number1, number2, product);
        int expected = 180;
        assertEquals(expected, result);
    }
    }
  
