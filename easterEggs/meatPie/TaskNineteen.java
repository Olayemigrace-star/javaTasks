import java.util.Scanner;

public class TaskNineteen{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        float digit = input.nextFloat();

        float number = digit % 2;

        System.out.println("The remainder when divided by 2 is: " + number);
    }
}

