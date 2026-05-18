import java.util.Scanner;

public class Action{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter a Colour : Green, yellow or red");
String action = input.nextLine();

if (action.equalsIgnoreCase("green")){
System.out.println("GO");
}
else if (action.equalsIgnoreCase("yellow")){
System.out.println("GET READY");
}
else if (action.equalsIgnoreCase("red")){
System.out.println("STOP");
}
else 
System.out.println("Unknown /");



}
}
