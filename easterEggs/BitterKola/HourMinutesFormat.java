import java.util.Scanner;

public class HourMinutesFormat{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("Enter the Number of Hours: ");
int hours  = input.nextInt();

System.out.println("Enter the Number of Minutes: ");
int minutes  = input.nextInt();

int minutesToHour = (minutes / 60);
int minutesRemainder = (minutes % 60);

int newHour = (hours + minutesToHour);

    System.out.println(newHour + "hours " + minutesRemainder + "mins ");
  

    }
}

