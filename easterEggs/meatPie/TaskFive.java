import java.util.Scanner;

public class TaskFive{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your First number");
        int firstNumber = input.nextInt();

        System.out.println("Enter the Second number");
         int secondNumber = input.nextInt();

        int product = firstNumber + secondNumber;

        System.out.printf("The product is %d%n", product);
    }
}

