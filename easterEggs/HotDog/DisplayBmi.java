import java.util.Scanner;

public class DisplayBmi{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds :");
        double weight = input.nextDouble();

        System.out.println("Enter height in inches :");
        double height  = input.nextDouble();

        double weightinKilograms = weight * 0.45359237;
        double heightinMeters = height * 0.0254;
        double bmi = weightinKilograms / (heightinMeters * heightinMeters);
    

        
        System.out.printf("The Body mass index is %f%n", bmi);
    }
}

