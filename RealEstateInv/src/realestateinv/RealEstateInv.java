package realestateinv;

import java.util.Scanner;

/**
 * @author Tristan Epler
 */
public class RealEstateInv {

    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter property value: ");
        Double price = scnr.nextDouble();
        
        System.out.println("Enter annual rent income: ");
        Double annInc = scnr.nextDouble();
        
        double ruleCalc = annInc/price;
        
        if(ruleCalc >= .10)
        {
            System.out.println("Solid Investment");
        }
        else
        {
            System.out.println("Risky Investment");
        }
    }
}