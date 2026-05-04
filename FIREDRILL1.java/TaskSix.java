  public class TaskSix{
  public static void main(String[] args){


    for(int i = 1; i<= 10; i++)
  {

      if(i % 4 == 0)
       {
          for(int multiples = 1; multiples <= 5; multiples++)
          {

           System.out.print((int) Math.pow(i, multiples));
         
          }
          System.out.print(" ");
        }
        
    }
    System.out.println();
}



}



