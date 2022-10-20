package maxvalue;

import java.util.Random;

/**
 *
 * @author Tristan Epler
 */
public class MaxValue {

    public static void main(String[] args) {
        Random randGen = new Random();
        int num1 = randGen.nextInt(301)+150;
        System.out.println(num1);
        
        int num2 = randGen.nextInt(301)+150;
        System.out.println(num2);
        
        if(num1>num2){
            System.out.println("You entered "+num1+" and "+num2+", where "+num1+" is the larger value.");
        }
        else{
            System.out.println("You entered "+num1+" and "+num2+", where "+num2+" is the larger value.");
        }
    }
    
}
