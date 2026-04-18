import java.util.Scanner;
public class TaskFour{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int sum = 0;
for(int number = 1; number <=10; number++){
System.out.print("Enter a number: ");

int value = input.nextInt();
if(number % 2 == 0){
sum = sum + value;
}

}
System.out.println("sum is = " + sum);




}




}
