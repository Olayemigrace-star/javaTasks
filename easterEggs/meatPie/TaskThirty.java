import java.util.Scanner;

public class TaskThirty{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num1 = input.nextInt();

       System.out.println("Enter another number");
        int num2 = input.nextInt();


        int sum = num1 + num2;
        int product = num1 * num2;
  
        

        System.out.printf("The sum of the two numbers is %d and the product is %d%n", sum, product);
    }
}
