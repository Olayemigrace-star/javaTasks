public class ReverseOrder{

public static void main(String[] args){

int [] number = {2,3,7,9,20};
        System.out.println(largestNumber(number));
    }

public static int largestNumber(int[] number){

       int largest = number[0];

       for(int index= 1; index < number.length; index++){
           if (number[index] > largest) largest = number[index];
       }

        return largest;
    }
    }
