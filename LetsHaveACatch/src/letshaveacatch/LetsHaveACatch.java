package letshaveacatch;

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
public class LetsHaveACatch {
    
    public static void main(String[] args) {
        try{
            System.out.println("You entered "+getWord()+", which is a word.");
            
            //final size of arraylist
            final int NUM_ELEMENTS = 3;
            //create array for testing
            String[] testData = new String[NUM_ELEMENTS];
            //fill array w/ values
            testData[0] = "zero";
            testData[1] = "one";
            testData[2] = "two";
            
            //call writeFile to put the array into a file, data.txt
            writeFile(testData,"data.txt");
            //create arraylist for in the main
            ArrayList<String> fileContents = new ArrayList<String>();
            //add all strings from method arraylist to main arraylist
            fileContents.addAll(readFile("data.txt"));
            
            //print all strings in arraylist
            for(int i =0; i < fileContents.size(); i++){
                System.out.println(fileContents.get(i));
                
            }
        }
        catch(IOException excpt){
            System.out.println(excpt.getMessage());
        }
    }
    
    public static void checkWord(String word) throws Exception{
        //checks first character of word
        if (!Character.isLetter(word.charAt(0))){
            throw new Exception("This is not a word.");
        }
        //I don't think this method needs error handling, it just throws to the main.
    }
    
    public static String getWord(){
        Scanner scnr = new Scanner(System.in);
        String input = null;
        boolean go = true;
        while(go){
            try{
                System.out.println("Enter a word.");
                input = scnr.next();
                checkWord(input);
                go = false;
            }
            catch (Exception excpt){
                System.out.println(excpt.getMessage());
            }
        }
        return input;
    }
    
    public static void writeFile(String[] arrayToWrite, String filename) throws FileNotFoundException, IOException{
        try{
            //set up file writing
            FileOutputStream fileStream = null;
            PrintWriter outFS = null;
            
            fileStream = new FileOutputStream(filename);
            outFS = new PrintWriter(fileStream);
            
            //print each index to the file
            for(int i=0; i < arrayToWrite.length;i++){
                outFS.println(arrayToWrite[i]);
            }    
            outFS.close();
        }
        catch(FileNotFoundException excpt){
            System.out.println(excpt.getMessage());
        }
    }
    
    public static ArrayList<String> readFile(String filename) throws FileNotFoundException, IOException{
        
        //create arrayList
        ArrayList<String> textLines = new ArrayList<String>();
        try{
            //Set up file reading
            FileInputStream fileByteStream = null;
            Scanner inFS = null;
            fileByteStream = new FileInputStream(filename);
            inFS = new Scanner(fileByteStream);
            
            //fill arrayList with lines from the file
            while(inFS.hasNextLine()){
                textLines.add(inFS.nextLine());
            }
            //close file
            fileByteStream.close();
            
        }
        catch(FileNotFoundException excpt){
            System.out.println(excpt.getMessage());
        }
        return  textLines;
    }
}
