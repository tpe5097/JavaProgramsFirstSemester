package randomexample;

import java.util.Random;

/**
 * @author Tristan Epler
 */
public class RandomExample {

    public static void main(String[] args) {
        
        //formula: Random.nextInt((max-min)+1)+min;
        
        Random rando = new Random();
        int num1 = rando.nextInt((15-10)+1)+10;
        
        System.out.println(num1);
    }
    
}
