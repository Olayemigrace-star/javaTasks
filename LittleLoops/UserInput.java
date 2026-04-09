import java.util.Scanner;

 public class UserInput{
  public static void main(String[] args){
 Scanner input = new Scanner(System.in);

System.out.println("Enter a number");
     double number = input.nextDouble();

System.out.println("The numbers are; ");
  for (int i = 1; i <= number;){

  System.out.println(i);
  i = i+ 1;

 }
     

 }


 }
