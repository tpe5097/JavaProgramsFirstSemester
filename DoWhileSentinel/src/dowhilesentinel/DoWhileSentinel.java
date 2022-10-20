package dowhilesentinel;

import java.util.Scanner;

/**
 *
 * @author Tristan Epler
 */
public class DoWhileSentinel {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double inNum = 0;
        double total = 0;
        double avg = 0;
        int counter = 0;
        double in = 0;
        boolean isDouble = false;
        do {
            System.out.println("Enter a positive number to add to the total or enter -1 to quit.");
            isDouble = true;
            // i don't believe we have used try/catch in class yet. I found this way of making sure an input is a double here:
            //https://stackoverflow.com/questions/18817826/how-to-check-the-data-type-validity-of-users-input-java-scanner-class
            try{
            in = Double.parseDouble(scnr.next());
            } catch(NumberFormatException ignore){
                System.out.println("You did not enter a number");
                isDouble = false;
            }
            if ((in != -1) && isDouble){
                total += in;
                counter = counter+1;
                avg = total/counter;
            }
            System.out.println("Your current total is: "+total);
        } while (in != -1);
        System.out.println("Your total is: "+total);
        System.out.println("The average value is: "+avg);
    }
    
}
