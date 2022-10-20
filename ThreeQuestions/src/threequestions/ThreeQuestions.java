package threequestions;

import java.util.Scanner;

/**
 * @author Tristan Epler
 */
public class ThreeQuestions {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("What is your first name? ");
        String firstName = scnr.next();
        
        System.out.println("What is your last name? ");
        String lastName = scnr.next();
        
        System.out.println("What is your favorite color? ");
        String color = scnr.next();
        
        System.out.println("Your name is "+firstName+" "+lastName+" and your favorite color is "+color+".");
    }
    
}
