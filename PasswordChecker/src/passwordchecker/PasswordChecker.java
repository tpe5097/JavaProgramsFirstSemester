package passwordchecker;

import java.util.Scanner;

/**
 *
 * @author Tristan Epler
 */
public class PasswordChecker {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("What is your password? ");
        
        String password = scnr.next();
        char char1 = password.charAt(0);
        char char2 = password.charAt(1);
        char char3 = password.charAt(2);
        
        System.out.println(char1+""+char2+""+char3);
        
        if (password.length() == 3){
            if (Character.isUpperCase(char1)||Character.isUpperCase(char2)||Character.isUpperCase(char3)){
               if (Character.isDigit(char1)||Character.isDigit(char2)||Character.isDigit(char3)){
                   System.out.println("The provided password is valid.");
               } 
            }
            else{
                System.out.println("The provided password is invalid because it must be three characters in length and include"
                    + " at least one digit and at least one uppercase character. Please try again.");
            }
        }
        else{
            System.out.println("The provided password is invalid because it must be three characters in length and include"
                    + " at least one digit and at least one uppercase character. Please try again.");
            
                
        }
    }
    
}
