import java.util.Scanner;

public class Maximum{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter the First Number: ");
int firstNumber = input.nextInt();

System.out.println("Enter the Second Number: ");
int secondNumber = input.nextInt();


if(firstNumber > secondNumber)
System.out.print(firstNumber);

if(secondNumber > firstNumber)
System.out.print(secondNumber);


}


}
