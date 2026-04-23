//A ternary operator is used here, you can carry out a shorter if statement 

public class Outcome{
public static void main(String[] args) {
int count = 1;
while (count <= 20) {
System.out.print(count);
System.out.println(count % 3 == 1 ? "########" : "++++++++");
++count;
} 
}
}
