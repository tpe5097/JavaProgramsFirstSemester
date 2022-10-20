package finalproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tristan Epler
 */
public class FinalProject {

     public static void main(String[] args) {

        int scoreVals[] = generateScoresArray();
        String fileName = writeFile(scoreVals);
        ArrayList<Integer> dataVals = readFile(fileName);
        printChart(dataVals);

    }
    public static int[] generateScoresArray(){
        int[] scoresArray = new int[3];
        
        scoresArray[0] = (int)(Math.random()*((5-1)+1))+1;
        scoresArray[1] = (int)(Math.random()*((5-1)+1))+1;
        scoresArray[2] = (int)(Math.random()*((5-1)+1))+1;
        
        return scoresArray;
        
    }
    
    public static String writeFile(int[] goalsScored){
        //This method requires a parameter, an integer array with goals scored, 
        //and writes the scores in the array to a file. The method must catch a file not found exception.
        //Return the name of file as a string.
        String filename = "ScoreFile.txt";
        try{
            //set up file writing
            FileOutputStream fileStream = null;
            PrintWriter outFS = null;
            
            
            fileStream = new FileOutputStream(filename);
            outFS = new PrintWriter(fileStream);
            
            //print each index to the file
            for(int i=0; i < goalsScored.length;i++){
                outFS.println(goalsScored[i]);
            }
            outFS.close();
        }
        catch(FileNotFoundException excpt){
            System.out.println(excpt.getMessage());
        }
        
        return filename;
        
    }
    
    public static ArrayList<Integer> readFile(String filename){
         
        //This method takes a string with the filename as a parameter. 
        //It reads the goals scored values from the file created in the writeToFile method (#2 above). 
        //Add the goal data values to an integer arraylist which the method returns. 
        //The method must catch a file not found exception. It returns the integer arraylist with the goal data values read from the file.
        
        //create arrayList
        ArrayList<Integer> goalArrayList = new ArrayList<>();
        try{
            //Set up file reading
            FileInputStream fileByteStream = null;
            Scanner inFS = null;
            fileByteStream = new FileInputStream(filename);
            inFS = new Scanner(fileByteStream);
            
            //fill arrayList with ints from the file
            while(inFS.hasNextInt()){
                goalArrayList.add(inFS.nextInt());
            }
            //close file
            fileByteStream.close();
            
        }
        catch(FileNotFoundException excpt){
            System.out.println(excpt.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
         }
        return  goalArrayList;
    }
    
    public static void printChart(ArrayList<Integer> goalArrayList){
        //This method takes an integer arraylist that contains the goals scored and returns nothing. 
        //The method prints a chart to the console formatted like the example at the beginning. 
        //Use an asterisk to represent each goal scored –-> one * for each goal scored. 
        //Also output the number of the period (i.e. 1, 2, or 3) with the highest number of goals scored.
        
        System.out.println("Period   Goals");
        for(int i = 0; i < goalArrayList.size(); i++){
            System.out.print((i+1)+"        ");
            int x = 0;
            while(x< goalArrayList.get(i)){
                System.out.print("*");
                x++;
            }
            System.out.println();
        }
        
        int highestScoreIndex = 0;
        for(int j = 0; j < (goalArrayList.size()); j++){
            if(j+1 < goalArrayList.size() && goalArrayList.get(j+1)>goalArrayList.get(highestScoreIndex)){
                highestScoreIndex = j+1;
            }
        }
        System.out.println("Period "+(highestScoreIndex+1)+" has the highest number of goals scored.");
    }
    
}
