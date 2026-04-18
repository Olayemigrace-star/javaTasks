import java.util.Scanner;

public class Input{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

            System.out.println("Enter a number ");
            int value = input.nextInt();

            int sum = 0;
            for(;value > 0;){
                int extract = value % 10;
                sum = sum + extract;          
                value = value / 10;   

            }


        System.out.println(sum);
    }


}
