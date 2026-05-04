import java.util.Scanner;


public class TaskTwo{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter a value: ");
int scores = input.nextInt();

int[] array = new int[10];

    for(int number = 0; number < array.length; number++){
    System.out.println("Enter a value: ");
    scores = input.nextInt();
    array[number] = scores;
  //  System.out.print(array[number]);


}
for(int digit = 0; digit < array.length; digit++){
    System.out.print(array[digit] +", ");
    }
//System.out.print(scores);
  }  
}


