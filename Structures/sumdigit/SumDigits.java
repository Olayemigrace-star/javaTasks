public class SumDigits{

    public static void main(String[] args){
    int integer = 345;
    System.out.println(sumOfDigits(integer));

}

public static int sumOfDigits(int integer){

    int sum = 0;
    int eachDigit = 0;
    for (;integer > 0; integer /= 10){
        eachDigit = integer % 10; 
        sum += eachDigit;
    }

    return sum;
    }
}
