import java.util.Scanner;

public class TaskThree{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the First number");
        int firstNumber = input.nextInt();

        System.out.println("Enter the Second number");
         int secondNumber = input.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.printf("The sum is %d%n", sum);
    }
}

