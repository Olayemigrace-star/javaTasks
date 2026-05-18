public class OshoFreePromoEngine{

public static double discount(double totalPrice, String promoCode){
discount = 0;

if (totalPrice >= 5000 && totalPrice <= 14999 && promoCode.equals("STARTER10")){
discount = totalPrice - (0.1 * totalPrice);
}

else if (totalPrice >= 15000 && totalPrice <= 29999){
discount = totalPrice - (0.1 * totalPrice);
}


}

}
