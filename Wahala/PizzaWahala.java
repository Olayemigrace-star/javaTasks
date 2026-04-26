import java.util.Scanner;

public class PizzaWahala{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of people: ");
        int guest = input.nextInt();
        System.out.print("""
                   TYPE OF PIZZA               | SLICES AVAILABLE | PRICES
              1. Sapa Size --------------------|     4            |  2500
              2. Small Money ------------------|     6            |  2900
              3. Big Boys ---------------------|     8            |  4000
              4. Odogwu -----------------------|     12           |  5200
                          
                          
                                \n""");
                                
        System.out.println("Pick a number for the type of pizza you want: ");
        int pizza = input.nextInt();


     int sapaSize = guest / 4;
     int smallMoney = guest / 6;
     int bigBoys = guest / 8;
     int odogwu = guest / 12;
     
     
     int remainder;
     int totalPrice;
     
     if (pizza == 1){
     remainder = guest % 4;
     totalPrice = 2500 * sapaSize;
     System.out.println("You will buy " + sapaSize + "boxes of pizza");
     System.out.println("After serving all your guest, you will be left with " + remainder + "slices");
     System.out.println("The total amount you are paying is:  " + totalPrice);
     }
      
      else if (pizza == 2){ 
         
     remainder = guest % 6;
     totalPrice = 2900 * smallMoney;
     System.out.println("You will buy " + smallMoney + "boxes of pizza");
     System.out.println("After serving all your guest, you will be left with " + remainder);
     System.out.println("The total amount you are paying is:  " + totalPrice);
     }
              
       else if (pizza == 3){ 
         
     remainder = guest % 8;
     totalPrice = 4000 * bigBoys;
     System.out.println("You will buy " + bigBoys + "boxes of pizza");
     System.out.println("After serving all your guest, you will be left with " + remainder + "slices");
     System.out.println("The total amount you are paying is:  " + totalPrice);
     }
       
        else if (pizza == 4){ 
         
     remainder = guest % 12;
     totalPrice = 5200 * odogwu;
     System.out.println("You will buy " + odogwu + "boxes of pizza");
     System.out.println("After serving all your guest, you will be left with " + remainder + "slices");
     System.out.println("The total amount you are paying is:  " + totalPrice); }
     
        }

    

        
        
}

