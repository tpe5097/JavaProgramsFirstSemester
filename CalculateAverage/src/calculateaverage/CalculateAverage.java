package calculateaverage;

import java.util.Scanner;

/**
 *
 * @author Tristan Epler
 */
public class CalculateAverage {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Please enter the first number: ");
        Double numOne = scnr.nextDouble();
        
        System.out.println("Please enter the first number: ");
        Double numTwo = scnr.nextDouble();
        
        System.out.println("Please enter the first number: ");
        Double numThree = scnr.nextDouble();
        
        Double avg = (numOne + numTwo + numThree)/3;
               
        System.out.print("The average of the numbers " );
        System.out.format("%.2f", numOne);
        System.out.print(", ");
        System.out.format("%.2f", numTwo);
        System.out.print(", and ");
        System.out.format("%.2f", numThree);
        System.out.print(" is ");
        System.out.format("%.2f", avg);
        System.out.println(".");
               
    }
    
}
