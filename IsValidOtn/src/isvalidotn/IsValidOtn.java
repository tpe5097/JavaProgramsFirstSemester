/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isvalidotn;

import java.util.Scanner;

/**
 *
 * @author Tristan Epler
 */
public class IsValidOtn {
    public static void main(String[] args) {
        //Sample K1234567
        
        boolean isValid = false;
        
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter OTN: ");
        String input = scnr.next();
        
        //String should have 8 chars
        if(input.length() != 8)
        {
            System.out.println("OTN is not valid.");
            
            return; //exit process
        }
        else
        {
           char firstChar = input.charAt(0);
            if(Character.isLetter(firstChar))
            {
                String nextSix = input.substring(1,7);
                String check = input.substring(7,8);
                
                double nextSixNum = Double.parseDouble(nextSix);
                int checkNum = Integer.parseInt(check);
                
                if(nextSixNum % 7 == checkNum)
                {
                    isValid = true;
                }
                else
                {
                    System.out.println("OTN is not valid.");
                }
            }
            else
            {
                System.out.println("OTN is not valid.");
            }
        }
        
        if(isValid)
        {
            System.out.println("OTN is valid.");
        }
    }
}
