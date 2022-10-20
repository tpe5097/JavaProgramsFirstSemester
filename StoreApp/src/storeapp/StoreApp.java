/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storeapp;

import static java.lang.String.format;
import java.util.Scanner;

/**
 * @author Tristan Epler
 */
public class StoreApp {
    
    public static void bannerPrinter(){
        //prints out stylized banner with my name
        System.out.println("*******************************************************\n" +
        "======+ Welcome to Tristan's Store Application! +======\n" +
        "*******************************************************");
    }
    public static String productsBuilder(){
        //build the catalog of products
        String productsCatalog = "Apples    Bananas   Carrots   Durian    Eggs      ";
        return productsCatalog;
    }
    public static boolean getOrder(String currentStock){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter a product name:");
        String request = scnr.next();
        //is the user's order in the catalog?
        return currentStock.contains(request);
    }
    public static double getPrice(){
        double longPrice = (Math.random()*((150-50)+1))+50;
        //I had a lot of trouble formatting the output correctly here.
        //found the format technique from zybooks chapter 7
        String shortPrice = format("%.2f",longPrice); 
        // found Double.parseDouble(String) from https://beginnersbook.com/2013/12/how-to-convert-string-to-double-in-java/
        //I feel like there was a way to do this without changing from a double to string back to double, not sure what it was
        return Double.parseDouble(shortPrice);
    }
    public static double calculateSalesTax(double price){
        //used the same method as getPrice() to format correctly
        double longTax = price*.06;
        String shortTax = format("%.2f",longTax);
        return Double.parseDouble(shortTax);
    }
    public static double getTotal(double price, double tax){
        //originally didn't format this because i thought a double w/ 2 decimal places plus another double w/ two decimal places 
        //would only be another double w/ two decimal places, but it sometimes returned values like 89.05000000000001
        double longTotal = price + tax;
        String shortTotal = format("%.2f",longTotal);
        return Double.parseDouble(shortTotal);
    }
    public static void printTotal(double total){
        System.out.println("Your sale total is: $"+total);
    }
    public static void main(String[] args) {
        bannerPrinter();
        //I used variables instead of a complicated statement calling productsBuilder() inside of getOrder
        String catalog = productsBuilder();
        if (getOrder(catalog)){
            double basePrice = getPrice();
            double tax = calculateSalesTax(basePrice);
            Double total = getTotal(basePrice, tax);
            //only printing the total because that's all the directions said to print
            printTotal(total);
        }
        else{
            System.out.println("The product was not found.");
        }
    }
    
}
