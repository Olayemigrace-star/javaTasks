import java.util.Scanner;
public class negativePattern{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter number of rows: ");
int userInput = input.nextInt();
        
for(int number = 1;number<= userInput; number++){
            
    for(int num = 1; num <= userInput; num++){
        System.out.println();      
    }
    System.out.print("*");
           
}

}
}
