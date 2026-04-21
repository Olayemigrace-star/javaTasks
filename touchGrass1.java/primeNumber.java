import java.util.Scanner;
public class primeNumber{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = input.nextInt();

if(number % 2 == 1 && number % number == 0)
{
System.out.print("It is a Prime Number ");
}
else
{
System.out.println("It is not a prime Number ");
}




}




}
