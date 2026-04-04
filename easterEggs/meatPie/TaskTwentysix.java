import java.util.Scanner;

public class TaskTwentysix{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Name: ");
        String name = input.nextLine();

      System.out.println("Enter your Age: ");
        int age = input.nextInt();


        System.out.printf("I am %s and i am %d years old %n", name, age);
    }
}

