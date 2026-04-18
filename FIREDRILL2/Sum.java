public class Sum{
public static void main(String[] args){

//print the sum of the integers between 2 and 20

int value = 0;

for(int number = 2; number <= 20; number += 2){
System.out.println(number);
value += number;
}

System.out.printf("The sum of the integers are %d%n",  value);


}
}
