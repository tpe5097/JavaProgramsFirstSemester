/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author natsi
 */
public class Test {

    /**
     * 
     */
    public static void recstr(String s, int d){
        if(d<=1){
            System.out.print(d);
        }
        else{
            s = s+"/";
            recstr(s,d-2);
            System.out.print(s+d);
        }
    }
    public static void main(String[] args) {
     String item;
      int quantity;
      int discount;

      StringWriter itemCharStream = new StringWriter();
      PrintWriter itemOSS = new PrintWriter(itemCharStream);

      item = "Headphones";
      quantity = 10;
      discount = 25;

      itemOSS.println(item + " x" + quantity);
      itemOSS.print(discount + "% off");

      System.out.print(itemCharStream.toString());
        
    }
    
}
