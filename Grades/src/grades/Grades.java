package grades;

import java.util.Arrays;

/**
 *
 * @author Tristan Epler
 */
public class Grades {

    public static void main(String[] args) {
        int NUM_COLS = 5;
        int NUM_ROWS = 5;
        int i;
        int j;
        int[][] scores = new int[NUM_ROWS][NUM_COLS];
        
        //I would prefer to use a for loop here, it would be easier to understand
        int currRow = 0;
        int currCol = 0;
        while(currRow < NUM_ROWS){
            //have to reset current column to 0 every time
            currCol = 0;
            while (currCol < NUM_COLS){
                int randVal = (int)(Math.random()*((100-50)+1))+50;
                scores[currRow][currCol] = randVal;
                currCol ++;
            }
            currRow ++;
        }
        
        //create array to hold avgs so i can use a loop to output them
        double[] avgScores = new double[NUM_ROWS];
        for(i=0;i<NUM_ROWS;i++){
            double sum = 0.0;
            for(j =0; j< NUM_COLS; j++){
                sum += scores[i][j];
            }
            avgScores[i] = sum/ NUM_ROWS;
        }
        
        //testing (method for testing found on here: https://www.java67.com/2014/03/how-to-print-array-in-java-example-tutorial.html
        //System.out.println("scores:"+Arrays.deepToString(scores));
        //System.out.println("avgScores:"+Arrays.toString(avgScores));
        
        for(i = 0; i<NUM_ROWS;i++){
            //It is only possible to get .0 .2 .4 .6 or .8 after dividing by 5. formatting to 2 decimals is unnecessary.
            System.out.print("Average of row "+(i+1)+": ");
            System.out.printf("%.2f",avgScores[i]);
            System.out.println();
        }
    }
    
}
