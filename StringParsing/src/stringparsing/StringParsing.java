package stringparsing;

import java.util.Scanner;

/**
 *
 * @author Tristan Epler
 */
public class StringParsing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        String name = "We Are Penn State";
        String otn = "K00067895";
        
        String first = otn.substring(0,1);
        
        System.out.println(first);
        
        String second = otn.substring(1,8);
        System.out.println(second);
        
        String last = otn.substring(8,9);
        System.out.println(last);
        
        double answer = Double.parseDouble(second) % 7;
        System.out.println(answer);
    }
    
}
