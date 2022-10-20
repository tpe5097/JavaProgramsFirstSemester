package findsmallest;

import java.util.Scanner;

/**
 *
 * @author Tristan Epler
 */
public class FindSmallest {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int first = scnr.nextInt();
        System.out.println("Enter the second integer: ");
        int second = scnr.nextInt();
        System.out.println("Enter the third integer: ");
        int third = scnr.nextInt();
        
        System.out.println("The smallest values you entered was the number "+smallest(first,second,third)+".");
    }
    public static int smallest(int intOne,int intTwo,int intThree){
        if (intOne < intTwo && intOne < intThree){
            return intOne;
        }
        else if (intTwo < intOne && intTwo < intThree){
            return intTwo;
        }
        else{
            return intThree;
        }
    }
    
}
