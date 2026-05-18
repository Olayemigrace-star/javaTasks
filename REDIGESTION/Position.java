import java.util.Scanner;

public class Position{

public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter a number");
int number = input.nextInt();

if (number == 7){
System.out.println("CORRECT");

}
else if (number > 7){
System.out.println("ABOVE");
}
else
System.out.println("BELOW");

}
}

