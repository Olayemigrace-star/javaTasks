import java.util.Scanner;
public class Thief{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

String code = "";
while (true){
System.out.print("Enter the contol key: ");
code = input.nextLine().trim();
if (code.equalsIgnoreCase("thief")) break ;

}

System.out.println("thieffff");

}
}
