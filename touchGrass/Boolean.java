import java.util.Scanner;

public class Boolean{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter any integer: ");
int number = input.nextInt();



if(number % 2 == 0)
System.out.println("It is an Even Number ");

if(number % 2 == 1)
System.out.println("It is an Odd Number ");


}


}
