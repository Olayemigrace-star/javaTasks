import java.util.Scanner;

public class HypotenuseOfTriangle{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first length of the Triangle");
        double firstLength = input.nextDouble();

        System.out.println("Enter the second length of the Triangle");
        double secondLength = input.nextDouble();

     
        double hypotenuse  = (firstLength * firstLength) + (secondLength * secondLength);

      

        System.out.printf("The hypotenuse of the Iriangle is %f%n", hypotenuse);
      
      
    }
}

