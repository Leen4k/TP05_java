import java.util.Scanner;

/**
 * test
 */

public class ex6 {

    public static String makePalindrome(String word) { 
        String reverse = new StringBuffer(word).reverse().toString(); 
        return word + reverse; 
     } 
  
     public static void main(String args[]) { 
        System.out.print("Please enter a word: "); 
        Scanner scan = new Scanner(System.in);             //To take input from user
        String word = scan.nextLine();                       
  
        String palindromeString = makePalindrome(word); 
  
        System.out.println(palindromeString); 
     } 
  
}