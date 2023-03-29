import java.util.Scanner;
import TP5.*;

public class ex7 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a sentence: ");
        String sentence = input.nextLine();
        MessageCoder.encoder(sentence);

        System.out.println("Do you want to decode this message?");
        String yes = input.nextLine();
  
        switch (yes){
            case "y":
            MessageCoder.decoder(MessageCoder.encoder(sentence));
            break;
            default:
            System.out.println("bye bye");
        }

    

        // System.out.println("The replaced string is: " + sentence);   
        // System.out.println("The replaced string is: " + sentence);    
    }  
}
