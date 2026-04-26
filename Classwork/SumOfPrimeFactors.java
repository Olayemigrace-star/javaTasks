import java.util.Scanner;

public class SumOfPrimeFactors{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int value = input.nextInt();

        int sumOfFactor = 0;
        int count = 2;

        for (;value > 1;){
            if (value % count == 0) {
                value = value / count;
                sumOfFactor = sumOfFactor + count;
            }else {
            count++;
            }
        }
         System.out.print(sumOfFactor);
    }
}

