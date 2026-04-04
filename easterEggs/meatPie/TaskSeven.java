import java.util.Scanner;

public class TaskSeven{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = input.nextInt();

        int square = number * number;

        System.out.printf("The square of the number is %d%n", square);
    }
}

