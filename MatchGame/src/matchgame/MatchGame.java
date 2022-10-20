/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matchgame;

import java.util.Scanner;

/**
 *
 * @author Tristan Epler
 */
public class MatchGame {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int counter = 0;
        int position = 0;
        
        System.out.println("Text: ");
        String inputWords = scnr.nextLine();
        
        System.out.println("Looking for:");
        String inputMatch = scnr.next();
       
        if(inputMatch.length() == 1){ 
            while (position != inputWords.length()){
                if(inputMatch.equalsIgnoreCase(inputWords.substring(position,position+1))){
                    counter = counter +1;
                }
                position ++;
            }
            System.out.println("There is(are) "+counter+" occurence(s) of \'"+inputMatch+"' in '"+inputWords+"'.");
        }
        else{
            System.out.println("Not a valid character.");
        }
    }
    
}
