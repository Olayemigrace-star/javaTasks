import java.util.Scanner;

public class NewtonsEquation{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the initial Velocity in meters/second :");
        double velocity = input.nextDouble();

       System.out.println("Enter the Time span in seconds:");
        double timeSpan = input.nextDouble();

       System.out.println("Enter the Acceleration in meters per seconds^2:");
        double acceleration = input.nextDouble();


      
        double distanceCovered = (velocity * timeSpan) + (0.5 * acceleration * timeSpan * timeSpan);

    

        
        System.out.printf("The Distance covered = %f%n", distanceCovered);
    }
}

