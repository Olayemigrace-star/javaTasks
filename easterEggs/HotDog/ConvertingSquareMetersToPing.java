import java.util.Scanner;

public class ConvertingSquareMetersToPing{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Number in Square meters:");
        double meters = input.nextDouble();

      
        double convertingToPing = meters * 0.3025;

    

        
        System.out.printf("It is equal to %fping%n: ", convertingToPing);
    }
}

