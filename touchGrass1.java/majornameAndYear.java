import java.util.Scanner;
public class majornameAndYear{
public static void main(String[] args){

Scanner input = new Scanner(System.in);


        System.out.print(String.format("""
                                        I = Information Management
                                        C = Computer Science
                                        A = Accounting  \n"""
));


System.out.print("Enter the first character of your major degree: ");
String major = input.nextLine();

 System.out.print(String.format("""
                                 1 = Freshman
                                 2 = Sophomore
                                 3 = Junior  
                                 4 = Senior   \n"""
              

                              ));


System.out.print("Enter the digit representing your year: ");
int yearStatus = input.nextInt();


            switch(major){
            case "I": System.out.print("Your major is Information Management\n");
                      break;

            case "C": System.out.print("Your major is Computer Science\n");
                      break;

            case "A": System.out.print("Your major is Accounting\n");
                      break;
            
            default: System.out.print("Invalid\n");
                     break;
        }
               



            switch(yearStatus){
            case 1: System.out.print("You are a Freshman\n");
                    break;

            case 2: System.out.print("You are a Sophomore\n");
                    break;

            case 3: System.out.print("You are a Junior\n");
                    break;

            case 4: System.out.print("You are a Senior\n");
                    break;

            default: System.out.print("Invalid\n");
                     break;
        }

        
    }
}
