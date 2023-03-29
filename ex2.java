import java.util.Scanner;

import TP5.*;
public class ex2
{

   public static void main(String args[]) 
   {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter starting number: ");
      int starting = sc.nextInt();
      System.out.println("Enter ending number: ");
      int ending = sc.nextInt();
      System.out.println("Enter step up: ");
      int steping = sc.nextInt();

      RangeUtil r = new RangeUtil(starting, ending, steping);

      if (starting < ending){
         for (r.start=r.start; r.start <= r.end; r.start+=r.step) 
         {    
            if (r.start % 2 != 0)  
               System.out.print(r.start + " ");   
         }    
      }else{
         for (r.start=r.start; r.start >= r.end; r.start-=r.step) 
         {    
            if (r.start % 2 != 0)  
               System.out.print(r.start + " ");   
         }   
      }



     
     

 
   

         
      

   }    
}
