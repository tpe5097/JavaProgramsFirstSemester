package getinput;

import java.util.Scanner;


        
/**
 *
 * @author Tristan Epler
 */
public class GetInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("Please enter a word.");
        Scanner scnr = new Scanner(System.in);
        String input = scnr.next();
       
        System.out.println(input);
    }
    
}
