import java.util.Scanner;

public class PositiveInteger{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive integer");
        double n  = input.nextDouble();

        double positiveInteger = (n * (n + 1) / 2);

      System.out.println(positiveInteger);

       if(n > 0){

        System.out.println(positiveInteger);
       }
    else{
     System.out.print("Error");
     }

    }
}

