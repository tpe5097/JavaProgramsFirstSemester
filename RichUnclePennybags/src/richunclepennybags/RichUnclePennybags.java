package richunclepennybags;

import java.util.Scanner;

/**
 * @author Tristan Epler
 */
public class RichUnclePennybags {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Enter the cost of the property: ");
        Double cost = scnr.nextDouble();
        
        System.out.println("Enter the current inflation rate: ");
        Double inflation = scnr.nextDouble();
        
        System.out.println("Enter the property appreciation rate: ");
        Double appreciationRate = scnr.nextDouble();
        
        //Net profit = (Value of property * Rate of appreciation) - (Value of property * Rate of inflation).
        Double netProfit = (cost*appreciationRate) - (cost * inflation);
        
        System.out.println("Your investment's net profit is "+netProfit);
    }
    
}
