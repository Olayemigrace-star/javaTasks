import java.util.Scanner;

public class VolumeOfTriangularPrism{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Input the length of the triangle:");
        double lengthofTriangle = input.nextDouble();

      
        double prism = (1.7 / 4) * (lengthofTriangle * lengthofTriangle * lengthofTriangle);

    

        
        System.out.printf("The volume of the prism is %f%n: ", prism);
    }
}
