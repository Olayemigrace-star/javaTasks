public class BackToSender{
public static int riderPayment (int successfulDelivery){


int payment = 0;
if (successfulDelivery < 50){

payment = (successfulDelivery * 160) + 5000;
}
else if (successfulDelivery >= 50 && successfulDelivery <= 59){

payment = (successfulDelivery * 200) + 5000;
}
else if (successfulDelivery >= 60 && successfulDelivery <= 69){

payment = (successfulDelivery * 250) + 5000;
}
else if (successfulDelivery >= 70){

payment = (successfulDelivery * 500) + 5000;
}

return payment;
}
public static void main(String[] args){

System.out.println(riderPayment(55));

System.out.println(riderPayment(67));
}



}
