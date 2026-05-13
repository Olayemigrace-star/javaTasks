import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OshoFreePromoEngineTest{

    @Test
    public void testToCheckIfAmountIsNotValidForADiscount(){
        double totalPrice = 1000;
        String promoCode = "STARTER10";
        double result = OshoFreePromoEngine.discount(totalPrice, promoCode);
        double expected = 1000;
        assertEquals(expected, result);
    }
    
    
    
    @Test
    public void testToCalculateDiscountIfTotalPriceIsBetween5_000And14_999(){
        double totalPrice = 5000;
        String promoCode = "STARTER10";
        double result = OshoFreePromoEngine.discount(totalPrice, promoCode);
        double expected = 4500;
        assertEquals(expected, result);
    }
    
    
    @Test
    public void testToCalculateDiscountIfTotalPriceIsBetween15_000And29_999(){
        double totalPrice = 18000;
        String promoCode = "BIGBOY20";
        double result = OshoFreePromoEngine.discount(totalPrice, promoCode);
        double expected = 14400;
        assertEquals(expected, result);
    }
    
    
    @Test
    public void testToCalculateDiscountIfTotalPriceIsGreaterThan30_000(){
        double totalPrice = 30000;
        String promoCode = "OSHOFREE35";
        double result = OshoFreePromoEngine.discount(totalPrice, promoCode);
        double expected = 19500;
        assertEquals(expected, result);
    }
    
    
    
    @Test
    public void testToCheckIfInvalidPromoCodeWasEntered(){
        double totalPrice = 30000;
        String promoCode = "ADDIDAS";
        double result = OshoFreePromoEngine.discount(totalPrice, promoCode);
        double expected = 19500;
        assertEquals(expected, result);
    }
    
    @Test
    public void testToCheckIfInvalidAmountWasEntered(){
        double totalPrice = -30000;
        String promoCode = "OSHOFREE35";
        double result = OshoFreePromoEngine.discount(totalPrice, promoCode);
        double expected = 19500;
        assertEquals(expected, result);
    }
    
    
    
    
    
}
