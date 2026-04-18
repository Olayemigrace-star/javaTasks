import java.util.Scanner;
public class TaskOnee{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int sum = 0;
for(int number = 1; number <=10; number++){
System.out.print("Enter a number: ");

int value = input.nextInt();

sum = sum + value;
}
System.out.println("sum is = " + sum);




}




}
