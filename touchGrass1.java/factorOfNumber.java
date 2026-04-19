import java.util.Scanner;
public class factorOfNumber{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int userInput = input.nextInt();
        
for(int number = 1; number <= userInput; number++){
            
if (userInput % number == 0){
System.out.println(number);
}
            
}
}
}
