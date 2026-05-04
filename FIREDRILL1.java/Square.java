import java.util.Scanner;

public class Square{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter an integer ");
int integer = input.nextInt();

int square = 1;
for(; integer > 0;){

int extract = integer % 10;
integer = integer / 10;

square = extract * extract;
System.out.println("The Square of the digits is " + square);

}
//for(integer = inpu; integer  > 0, integer/=10)



}

}
