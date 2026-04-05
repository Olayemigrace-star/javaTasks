import java.util.Scanner;

public class GratuityAndTotal{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);


       System.out.println("Enter the Sub Total:");
        double subTotal = input.nextDouble();

      System.out.println("Enter the Gratuity Rate");
        double gratuityRate = input.nextDouble();

         double gratuity = (gratuityRate / 100) * subTotal;
         double total = gratuity + subTotal;

    

        
        System.out.printf("Gratuity = $%f%n Total = $%f%n ", gratuity, total);
    }
}

