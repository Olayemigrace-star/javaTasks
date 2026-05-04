import java.util.Scanner;
public class trying{
    public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter your digits: ");
int digit = input.nextInt();

int square = 1;
for(;digit>0;){
    
        int value = digit % 10;
        digit = digit / 10;
        
        
square = value * value;
 
System.out.print(square);
       
      }


 
}
}
