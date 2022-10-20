package flipit;

import java.util.Scanner;

/**
 *
 * @author Tristan Epler
 */
public class FlipIt {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a string to be reversed: ");
        String input = scnr.nextLine();
        String reverseInput = "";
        int position;
        char holder;
        if (input.length()<5){
            System.out.println("You did not enter a valid string.");
        }
        else{
            for (position = 0; position < input.length(); position ++){
                //System.out.println(position);
                holder = input.charAt(input.length()-(position+1));
                reverseInput += holder;
            }
            System.out.println(reverseInput);
        }
        
    }
    
}
