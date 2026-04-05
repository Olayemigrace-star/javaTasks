import java.util.Scanner;

public class MilestoKilometerConverter{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number in miles");
        double miles = input.nextDouble();

      
        double kilometers = 1.6 * miles;

    

        
        System.out.printf("It is %f%n kilometers", kilometers);
    }
}

