import java.util.Scanner;
public class LargestArr{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int grade[] = new int[5];
        int largest;

        for(int i = 1; i <= 5; i++){
            System.out.print("Enter a number: ");
            int grade[i] = input.nextInt();


            largest = grade[0];
            if (grade[1] > largest)
                largest = grade[1];
            else if (grade[2] > largest)
                largest = grade[2];
            else if(grade[3] > largest)
                largest = grade[4];
            else if(grade[4] > largest)
                largest = grade[4];

        }
        
         System.out.println(largest);

    }
}
