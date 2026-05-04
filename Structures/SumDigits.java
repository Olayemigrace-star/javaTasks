public class SumDigits{

public static void main(String[] args){
int integer = (345);
System.out.print(sumOfDigits(sum));


}

public static int sumOfDigits(int integer){

//integer = ();
int sum = 0;
for (int i = integer; integer > 0; i--){
int value = integer % 10; 
integer = integer / 10;
sum += value;
}

return sum;
}
}
