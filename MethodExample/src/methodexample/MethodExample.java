/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodexample;

import static java.lang.String.format;

/**
 *
 * @author Tristan Epler
 */
public class MethodExample {

    public static void main(String[] args) {
        
        System.out.println(printOut(""));
    }
    
    public static String printOut(String output){
        
        return format("%.2f",12.554432);
    }
    
}
