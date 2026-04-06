import java.util.Scanner;

public class DoublesDisplay{

  public static void main(String[] agrs)
 {
     Scanner input = new Scanner(System.in);

 System.out.print("Enter the first double ");
 double firstNumber = input.nextDouble();

 System.out.print("Enter the second double ");
 double secondNumber = input.nextDouble();

 
double sum = firstNumber + secondNumber;
double difference = firstNumber - secondNumber;
double product = firstNumber * secondNumber;

    System.out.printf("The Sum of the numbers is: %f%nThe difference of the two numbers is: %f%nThe Product of the numbers is: %f%n", sum, difference, product);


  if (firstNumber > secondNumber)

System.out.printf("%f%n is the larger value ", firstNumber);
else
System.out.println(secondNumber);


}
}
