import java.util.Scanner;

public class EnergyNeededToHeatwater{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Amount of Water in kilograms :");
        double massOfWater = input.nextDouble();

       System.out.println("Enter the Initial Temperature :");
        double initialTemperature = input.nextDouble();

       System.out.println("Enter the Final Temperature:");
        double finalTemperature = input.nextDouble();
     
         

      double Q = massOfWater * (finalTemperature - initialTemperature) * 4184;


     
        
        System.out.printf("Q = %f%n", Q);
    }
}

