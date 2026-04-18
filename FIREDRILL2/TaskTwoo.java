import java.util.Scanner;
public class TaskOnee{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int sum = 0;
int count = 0;
double average = 0;
for(int number = 1; number <=10; number++){
System.out.print("Enter a number: ");

int value = input.nextInt();

sum += value;
count ++;
}
average = sum / count;

System.out.println("Average is = " + average);




}




}
