import java.util.Scanner;
public class Grades{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
//Write a program that tells the students to enter their scores (10 scores ) and print the average, which will determine their grades

int sum = 0;
int count =  0;
for(int number =1; number <= 10; number++){
System.out.println("Enter your scores");

int grade = input.nextInt();

count++;
sum += grade;

}
int average = sum / count;

if(average >= 90 && average <= 100 ){
System.out.print("You got an A ");
}
if(average >= 80 && average <= 90){
System.out.print("You got a B ");
}
if(average >= 70 && average <= 80 ){
System.out.print("You got a C ");
}
if(average >= 60 && average<= 70 ){
System.out.print("You got a D ");
}
if(average >= 0 && average <= 59 ){
System.out.print("You got an F ");
}





}

}
