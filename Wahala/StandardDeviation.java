public class StandardDeviation{

public static double variance (double[] numbers){
   double average = 1;
   double count = 0;
   double sum = 0;
   double variance = 1;
   double square = 1;
   double addition = 0;
   
   
   for(int i = 0; i < numbers.length; i++){
   sum += numbers[i];
   count++;
   }
   average = sum / count;
   
   for(int j = 0; j < numbers.length; j++){
   variance = numbers[j] - average;
   square = variance * variance;
   addition += square;
   }
  return addition; 
}
public static double standardDeviation (double[] numbers){
   double average = 1;
   double count = 0;
   double sum = 0;
   double variance = 1;
   double square = 1;
   double addition = 0;
   
   
   for(int i = 0; i < numbers.length; i++){
   sum += numbers[i];
   count++;
   }
   average = sum / count;
   
   for(int j = 0; j < numbers.length; j++){
   variance = numbers[j] - average;
   square = variance * variance;
   addition += square;
   }
   
   double division = addition / 5;
   double deviation = Math.sqrt(division);
   
   return deviation;
}
}





