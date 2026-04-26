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


     int sapaSize = guest/4;
     int smallMoney = guest / 6;
     int bigBoys = guest / 8;
     int odogwu = guest / 12;
     
        switch(pizza){
        case 1:
        System.out.println(2500 * sapaSize);
        break;
        case 2: 
        System.out.println(2900 * smallMoney);
        break;
        case 3:
        System.out.println(4000 * bigBoys);
        break;
        case 4:
        System.out.println(5200 * odogwu);
        break;
         
         
              // remainder = guest % 4
        
        
        
        }

    

        
        System.out.println();
    }
}

