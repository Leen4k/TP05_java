import java.util.Scanner;
import TP5.*;
 
class ex3 {
  public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A where A: (0<A<500).");
        
        int input = sc.nextInt();
        
        if (input<=0){
            System.out.println("Please enter a number that is greater than zero:");
        }else{
            RangeUtil r = new RangeUtil(input, 500, 1);

            System.out.print("List of even numbers from 1 to "+r.end+": ");  
            for (r.start = r.start; r.start<=r.end; r.start+=r.step)   
            {  

            if (r.start%2==0)   
            {  
            System.out.print(r.start + " ");  
            }  
            }  

        }
    }
}
