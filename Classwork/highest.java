public class highest{

public static int maximum (int numberOne, int numberTwo, int numberThree){

int highestNumber = numberOne;
 
if (numberTwo > numberOne){
highestNumber = numberTwo;
}

if (numberThree > numberOne)
highestNumber = numberThree;


return highestNumber;
}

public static void main(String[] args){
System.out.println(maximum(5, 6, 9));

}

}
