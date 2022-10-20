package leapyear;

/**
 *
 * @author Tristan Epler
 */
public class LeapYear {

    public static void main(String[] args) {
        //do this 5 times
        for (int x = 0; x<5; x++){
            //generate rand. number between 1967 and 2050
            int year = (int)(Math.random()*((2050-1967)+1))+1967;
            
            //ask method for true/false and output accordingly
            if (isLeapYear(year)){
                System.out.println(year+" is a leap year.");
            }
            else {
                System.out.println(year+ " is not a leap year.");
            }
        }
    }
    public static boolean isLeapYear(int year){
        //very confusing logic to determine if year is a leap year. returns a boolean
            if (year % 4 == 0){
                if (year % 100 == 0){
                    //netbeans says this is redundant. leaving in to better show rules for leap years.
                    if (year % 400 == 0){
                        return true;
                    }
                    else{
                        return false;
                    }
                    }
                else{
                    return true;
                }
            }
            else{
                return false;
            }
    }
    
}
