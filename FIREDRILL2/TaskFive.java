import java.util.Scanner;
public class TaskFive{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int sum = 0;
int count= 0;

for(int number = 1; number <=10; number++){
System.out.print("Enter a number: ");

int value = input.nextInt();
if(value % 2 == 0){
sum = sum + value;
count ++;
}

}

int average = sum / count ;
System.out.println("The average is = " + average);




}




}
