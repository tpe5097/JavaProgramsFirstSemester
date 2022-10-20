package realestateacres;

import java.util.Scanner;

/**
 *
 * @author Tristan Epler
 */
public class RealEstateAcres {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Enter the length of the property (in feet): ");
        Double length = scnr.nextDouble();
        
        System.out.println("Enter the width of the property (in feet): ");
        Double width = scnr.nextDouble();
        
        System.out.println("Enter the price of the property: ");
        Double price = scnr.nextDouble();
        
        Double acres = (length*width)/43560;
        Double costPerAcre = price/acres;
        
        System.out.print("The property being evaluated is ");
        System.out.format("%.2f",acres);
        System.out.print(" acres with a cost of ");
        System.out.format("%.2f",costPerAcre);
        System.out.println(" per acre.");
    }
    
}