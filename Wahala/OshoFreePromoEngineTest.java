import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OshoFreePromoEngineTest{

    @Test
    public void testToCheckIfAmountIsNotValidForADiscount(){
        double totalPrice = 1000;
        String promoCode = "STARTER10";
        double result = OshoFreePromoEngine.discount(totalPrice);
        double expected = 1000;
        assertEquals(expected, result);
    }
    
    
    
    @Test
    public void testToCalculateDiscountIfCartTotalIsBetween5_000And14_999(){
        double totalPrice = 5000;
        String promoCode = "STARTER10";
        double result = OshoFreePromoEngine.discount(totalPrice);
        double expected = 4500;
        assertEquals(expected, result);
    }
}
