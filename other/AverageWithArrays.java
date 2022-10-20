package averagewitharrays;

import java.util.Scanner;

/**
 *
 * @author Tristan Epler
 */
public class AverageWithArrays {

    public static void main(String[] args) {
        //avoid calling values() twice
        double[] arrayForPrinting = values();
        printing(arrayForPrinting,avg(arrayForPrinting));
    }
    
    public static double[] values(){
        Scanner scnr = new Scanner(System.in);
        int i;
        System.out.println("Please enter five to ten numbers all on one line, separated by spaces.");
        String input = scnr.nextLine();
        //create array of strings the user inputted
        String[] stringValues = input.split(" ");
        
        //convert that array to doubles
        double[] doubleValues = new double[stringValues.length];
        for (i = 0; i < stringValues.length; i++) {
            doubleValues[i] = Double.parseDouble(stringValues[i]);
        }
        return doubleValues;
    }
    public static double avg(double[] doubleValues){
        //add all numbers together
        double sum = 0;
        for (int i = 0; i< doubleValues.length;i++){
            sum += doubleValues[i];
        }
        //divide by amount of numbers
        return sum/doubleValues.length;
    }
    
    public static void printing(double[] doubleValues, double avg){
        System.out.print("The average of the numbers ");
        //logic for printing with oxford comma correctly
        for (int i = 0; i<doubleValues.length;i++){
            if (i < doubleValues.length-1){
                System.out.printf("%.2f",doubleValues[i]);
                System.out.print(", ");
            }
            else{
                System.out.print("and ");
                System.out.printf("%.2f",doubleValues[i]);
            }    
        }
        System.out.print(" is ");
        System.out.printf("%.2f",avg);
        System.out.println(".");
    }
    
}
