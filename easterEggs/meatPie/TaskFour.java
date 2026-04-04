import java.util.Scanner;

public class TaskFour{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the First number");
        int firstNumber = input.nextInt();

        System.out.println("Enter the Second number");
         int secondNumber = input.nextInt();

       int difference = firstNumber - secondNumber;

        System.out.printf("The difference between the two numbers is %d%n", difference);
    }
}

