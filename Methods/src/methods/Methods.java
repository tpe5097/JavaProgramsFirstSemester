package methods;

import java.util.Scanner;

/**
 *
 * @author Tristan Epler
 */
public class Methods {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        //I call a method inside a print statement here. might be better to do outside with a string variable. not sure.
        System.out.println("You entered a number that is "+oddOrEven(scnr.nextInt())+".");
        
        System.out.println("Please enter the radius of the circle: ");
        System.out.println("Your circle's area is "+circleRadius(scnr.nextDouble())+".");
        //get month number
        int rand = randOneTwelve();
        //convert month number to month string
        String month = month(rand);
        //generate year
        int year = year();
        System.out.println(month+" "+year+"."); 
    }
    public static String oddOrEven(int number){
        if (number % 2 == 0){
            return "even";
        }
        else{
            return "odd";
        }
    }
    public static double circleRadius(double radius){
        //formula for area, radius*radius is the same as radius squared
        return Math.PI * radius*radius;
    }
    public static int randOneTwelve(){
        int rand = (int)(Math.random()*12)+1;
        return rand;
    }
    public static String month(int monthNum){
        String month = "";
        //use switch here because each number corresponds to one string
        switch(monthNum){
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
        }
        return month;
    }
    public static int year(){
        int year = (int)(Math.random()*((2020-1999)+1))+1999;
        return year;
    }
    
}
