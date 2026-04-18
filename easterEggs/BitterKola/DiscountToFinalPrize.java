import java.util.Scanner;

public class DiscountToFinalPrize{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("Enter the total prize: ");
int prize = input.nextInt();

System.out.println("Enter the discount on purchased goods: ");
int discount = input.nextInt();

int amount = (prize) - ((discount / 100) * (prize));


System.out.println("Your balance is " + amount);
     

    }
}

