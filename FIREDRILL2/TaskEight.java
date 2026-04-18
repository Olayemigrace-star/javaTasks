import java.util.Scanner;
public class TaskEight{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int sum = 0;
for(int number = 1; number <=10; number++){
System.out.print("Enter a number: ");

int value = input.nextInt();
if(value < 0 && value >100){
System.out.print("invalid");
}

if(value == 0 && value < 100){
sum +=value;
System.out.println("sum is = " + sum);
}

}
System.out.println("sum is = " + sum);




}




}
