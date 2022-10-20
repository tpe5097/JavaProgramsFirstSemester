package averagewitharraysbackup;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Tristan Epler
 */
public class AverageWithArraysBackup {

    public static void main(String[] args) {
        //avoid calling values() twice
        double[] arrayForPrinting = values();
        printing(arrayForPrinting,avg(arrayForPrinting));
        
    }
    
    public static double[] values(){
        Scanner scnr = new Scanner(System.in);
        int MAX_VALUES = 10;
        System.out.println("Please enter five to ten numbers all on one line, separated by spaces.");
        String rawInput = scnr.nextLine();
        String[] stringValues = rawInput.split(" ");
        
        double[] doubleValues = new double[MAX_VALUES];
        
        for(int i = 0; i<stringValues.length;i++){
            if (!stringValues[i].equals('0')){
                doubleValues[i] = Double.parseDouble(stringValues[i]);
            } 
        }
        return doubleValues;
    }
    public static double avg(double[] doubleValues){
        double sum = 0;
        int count = 0;
        for (int i = 0; i< doubleValues.length;i++){
            if (doubleValues[i] != 0){
                count ++;
                sum += doubleValues[i];
            }
        }
        return sum/count;
    }
    
    public static void printing(double[] doubleValues, double avg){
        System.out.print("The average of the numbers ");
        for (int i = 0; i<doubleValues.length;i++){
            if (doubleValues[i]  != 0){
                System.out.printf("%.2f",doubleValues[i]);
                System.out.print(", ");
            }
            
        }
    }
    
}
