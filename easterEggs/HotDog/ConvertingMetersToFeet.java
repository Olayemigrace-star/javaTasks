import java.util.Scanner;

public class ConvertingMetersToFeet{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number in meters:");
        double meters = input.nextDouble();

      
        double convertingToFeet = meters * 3.2786;

    

        
        System.out.printf("It is equal to %ffeet %n: ", convertingToFeet);
    }
}

