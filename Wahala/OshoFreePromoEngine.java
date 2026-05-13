public class OshoFreePromoEngine{

public static double discount(double totalPrice, String promoCode){
double discount = 0;

if (totalPrice >= 5000 && totalPrice < 15000 && promoCode.toLowerCase().equalsIgnoreCase("STARTER10")){

discount = totalPrice - ( (0.1) * totalPrice);
}

else if (totalPrice >= 15000 && totalPrice < 30000 && promoCode.toLowerCase().equalsIgnoreCase("BIGBOY20")){

discount = totalPrice - ( (0.2) * totalPrice);
}

else if (totalPrice >= 30000 && promoCode.toLowerCase().equalsIgnoreCase("OSHOFREE35")){

discount = totalPrice - ( (0.35) * totalPrice);
}
else{
discount = totalPrice;
}


return discount;

}


}

