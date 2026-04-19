import java.util.Scanner;
public class powersOfTwo{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter a power: ");
int power = input.nextInt();

for(int number = 1; number <= power; number++){
int powerOfTwo = (int)Math.pow(2, number);

System.out.print(powerOfTwo + ", ");


}
}
}
