import java.util.Arrays;
import java.util.Scanner;
public class ex4 {
   public static void main(String args[]){
      Scanner s = new Scanner(System.in);
      int size = 13;
      int myArray[] = new int [size];
      int sum = 0;

      for(int i=1; i<size; i++){
        System.out.println("Profit for month"+ i);
         myArray[i] = s.nextInt();
         sum = sum + myArray[i];
      }
      System.out.println("The profits of each months are: "+Arrays.toString(myArray));
      System.out.println("Total profits for 12 months : "+sum);
   }
}