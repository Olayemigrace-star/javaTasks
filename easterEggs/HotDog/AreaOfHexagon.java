import java.util.Scanner;

public class AreaOfHexagon{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side of an hexagon :");
        double hexagon = input.nextDouble();

      
        double AreaOfHexagon = 4.326 * hexagon *hexagon;

    

        
        System.out.printf("The Area of the Hexagon is %f%n", AreaOfHexagon);
    }
}

