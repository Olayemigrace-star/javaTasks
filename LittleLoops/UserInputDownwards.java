import java.util.Scanner;

 public class UserInputDownwards{
  public static void main(String[] args){
 Scanner input = new Scanner(System.in);

System.out.println("Enter a number");
     int number = input.nextInt();

System.out.println("The numbers are; ");
  for (int i = number; i <= 1;){

  System.out.println(i);
  i = i- 1;

 }
     

 }
}
