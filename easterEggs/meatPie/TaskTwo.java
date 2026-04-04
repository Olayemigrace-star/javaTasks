import java.util.Scanner;

public class TaskTwo{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is your age?");
         int userAge = input.nextInt();

        System.out.printf("You are %d years old\n",userAge);
    }
}

