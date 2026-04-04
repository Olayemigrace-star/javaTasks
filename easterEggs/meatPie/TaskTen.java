import java.util.Scanner;

public class TaskTen{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int digit = input.nextInt();

        int number = digit * 2;

        System.out.printf("The double of the number is %d%n", number);
    }
}

