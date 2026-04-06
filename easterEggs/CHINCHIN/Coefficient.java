import java.util.Scanner;

public class Coefficient{

  public static void main(String[] agrs)
 {
     Scanner input = new Scanner(System.in);

 System.out.print("Enter the value of a ");
 double a = input.nextDouble();

System.out.print("Enter the value of b ");
 double b = input.nextDouble();

System.out.print("Enter the value of c ");
 double c = input.nextDouble();

 
double x = (c - b) / a;
    System.out.printf(" X = %f%n", x);


  if (a == 0)

System.out.println("The equation has no  unique solution ");
else
System.out.println(x);


}
}
