import java.util.Scanner;

public class TaskTwentytwo{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        double radius = input.nextDouble();

        double area = 3.142 * radius * radius;

        System.out.println("The Area of the Circle is: "  + area);
    }
}
