public class sorted{

public static void main(String[] args){

int [] number = {2,3,7,9,20};
        System.out.println(decreasing(int[] number));
    }

public static int decreasing(int[] number){
//
//       for(int value = number.length; value > 0; value--){
//          int len = decrease[value];
//
//        return len;
//    }
//    }
//  
    
    int[] reverseNumber = new int [number.length];
        int reverseCount = 0;

        for (int index = number.length - 1; index >= 0; index--){
        
            reverseNumber[reverseCount] = number[index];
            reverseCount++;
        }
        return reverseNumber;
        }
        }
