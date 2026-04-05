import java.util.Scanner;

public class MinimumRunwayLength{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Airplanes acceleration in m/s^2:");
        double airplanesAcceleration = input.nextDouble();

        System.out.println("Enter the Take-off speed in m/s:");
        double TakeOffSpeed  = input.nextDouble();

      
        double minimumRunway = (TakeOffSpeed * TakeOffSpeed) / (2 * airplanesAcceleration ) ;

    

        
        System.out.printf("The Minimum Runway length is %f%n", minimumRunway);
    }
}

