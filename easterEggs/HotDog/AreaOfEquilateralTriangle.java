import java.util.Scanner;

public class AreaOfEquilateralTriangle{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Input the length of the triangle:");
        double triangle = input.nextDouble();

      
        double area = (1.7 / 4) * (triangle * triangle);

    

        
        System.out.printf("The area of the Equilateral triangle is %f%n: ", area);
    }
}

