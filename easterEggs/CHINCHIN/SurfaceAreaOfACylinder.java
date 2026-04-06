import java.util.Scanner;

public class SurfaceAreaOfACylinder{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the Cylinder");
        double radius = input.nextDouble();

        System.out.println("Enter the height of the Cylinder");
        double height = input.nextDouble();

        double surfaceArea = (2 * 3.142 * radius * height) + (2 * 3.142 * radius * radius);

        double volume = ( 3.142 * radius * radius * height);


        System.out.printf("The Surface Area of the Cylinder is : %f%n", surfaceArea);

        System.out.printf("The Volume of the Cylinder is : %f%n", volume);
    }
}

