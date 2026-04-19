import java.util.Scanner;

public class Quotient{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter the First Number: ");
int firstNumber = input.nextInt();

System.out.println("Enter the Second Number: ");
int secondNumber = input.nextInt();


int quotient = firstNumber / secondNumber;

System.out.print(quotient);


}


}
