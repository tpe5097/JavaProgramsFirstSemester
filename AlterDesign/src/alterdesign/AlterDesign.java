package alterdesign;

import java.util.Scanner;

/**
 *
 * @author Tristan Epler
 */
public class AlterDesign {

    public static void main(String[] args) {
        //User values
        Scanner scnr = new Scanner(System.in);
        
        //I am not sure how we have done input 
        System.out.println("An integer value between 1 and 10 (inclusive) for the number of rows to be printed: ");
        int rows = 0;
        while(!(rows >0 && rows < 11 )){
            rows = scnr.nextInt();
            if (!(rows >0 && rows < 11 )){
                System.out.println("Please enter a number of rows between 1 and 10. ");
            }
        }
        
        
        System.out.println("A second integer value between 1 and 10 (inclusive) for the number of columns to be printed: ");
        int columns = 0;
        while(!(columns >0 && columns < 11 )){
            columns = scnr.nextInt();
            if (!(columns >0 && columns < 11 )){
                System.out.println("Please enter a number of columns between 1 and 10. ");
            }
        }
        
        System.out.println("A string value for the starting string of the design: ");
        String firstString = scnr.next();
        System.out.println("A string value for the second string of the design: ");
        String secondString = scnr.next();
        System.out.println("A string value that separates the first two strings: ");
        String separator = scnr.next();
        //for loop variables
        int x;
        int y;
        System.out.println();
        for(y = 0; y < rows; y++){
            if(y%2 ==0){
                for (x = 0; x< columns;x++){
                    if (x%2 == 0){
                        System.out.print(firstString);
                    }
                    else{
                        System.out.print(secondString);
                    }
                    if(x < columns-1){
                        System.out.print(separator);
                    }
                }
            }
            else{
                for (x = 0; x< columns;x++){
                    if (x%2 == 0){
                        System.out.print(secondString);
                    }
                    else{
                        System.out.print(firstString);
                    }
                    if(x < columns-1){
                        System.out.print(separator);
                    }
                }
            }
            System.out.println();
        }
        
    }
    
}
