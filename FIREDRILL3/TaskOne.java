import java.util.Scanner;


public class TaskOne{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
int[] array = new int[9];
System.out.println("Enter a value: ");
int scores = input.nextInt();

for(int number = 0; number < array.length; number++){
System.out.println("Enter a value: ");
scores = input.nextInt();
array[number] = scores;

System.out.println(array[number]);
}
System.out.print(scores);
}

}
