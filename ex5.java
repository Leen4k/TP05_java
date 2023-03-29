import java.util.*;   
class ex5 
{  
   public static void loop(String original){
      String reverse ="";
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
      System.out.println(original+" is palindrome.");
      else  
      System.out.println(original+" is not palindrome.");
   }

      public static void reverse(String original) { 
         String palindromeString = new StringBuffer(original).reverse().toString(); 
         if(original.equals(palindromeString)){
            System.out.println(original+" is palindrome.");
         }else{
            System.out.println(original+" is not palindrome.");
         }
      }
   
   public static void main(String args[])  
   {  
      String original;
      Scanner in = new Scanner(System.in);  
      System.out.println("Choose method (REV, LOOP):");
      String input = in.nextLine(); 
      if(input.toLowerCase().contains("rev")){
         System.out.println("Enter a string/number to check if it is a palindrome **REV METHOD**");    
         original = in.nextLine();    
         loop(original);
      }else if(input.toLowerCase().contains("loop")){
         System.out.println("Enter a string/number to check if it is a palindrome **LOOP METHOD**");    
         original = in.nextLine();    
         reverse(original);
      }else{
         System.out.println("hikhik");
      }


 
   }  
}  