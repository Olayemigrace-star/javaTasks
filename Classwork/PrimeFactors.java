import java.util.Scanner;

public class PrimeFactors{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int value = input.nextInt();

        int factor = 0;
        

        for (int number = 2; number <= value;){
            if (value % number == 0) {
                value = value / number;
                factor = factor + number;
            }
            else number++;
            }
            System.out.print(factor);
        }
         
    
}

