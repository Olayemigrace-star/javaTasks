public class ZerosToNine{
public static void main(String[] args){


    for(int thousands = 0; thousands <= 9; thousands++){
       
        for(int hundreds = 0; hundreds <= 9; hundreds++){

            for(int tens = 0; tens<= 9; tens++){

                for(int units = 0; units <= 9; units++)
                
                System.out.println(""+thousands + hundreds + tens + units);
             }
         }
      }


}
}
