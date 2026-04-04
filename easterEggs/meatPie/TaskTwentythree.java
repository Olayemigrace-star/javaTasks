import java.util.Scanner;

public class TaskTwentythree{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();

      System.out.println("Enter your lastname: ");
        String lastName = input.nextLine();


        System.out.printf("%s%s%n", firstName, lastName);
    }
}

