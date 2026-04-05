import java.util.Scanner;

public class RemainingNumbersOfDaysForMinuites{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of minutes: ");
        double totalMinutes = input.nextDouble();

      
        double maximumYears = totalMinutes / 525600;
        double remainingDays = (totalMinutes % 525600) / 1440;


    

        
        System.out.printf("The maximum number of years and days for the minuite is: %fyears and %fdays%n", maximumYears,remainingDays);
    }
}

