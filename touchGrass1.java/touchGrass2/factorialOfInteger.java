import java.util.Scanner;

public class factorialOfInteger{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter any integer: ");
int number = input.nextInt();

int product = 1;
for(;number >= 1; number--)

product = product * number;

System.out.println(product);

}


}
