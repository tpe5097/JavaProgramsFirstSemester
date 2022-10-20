package gpba;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tristan Epler
 */
public class GPBA {

    public static void main(String[] args) {
        
        
        
        try{
            //have to delete file b/c i only append later. found here: https://www.geeksforgeeks.org/delete-file-using-java/
            File file = new File("stockReturns.txt");
            file.delete();

            Scanner scnr = new Scanner(System.in);

            ArrayList<String> data = new ArrayList<>();
            ArrayList<String> companies = new ArrayList<>();
            //load data
            data = readData();
            
            //determine distinct companies
            companies = getDistinctCompany(data);
            
            System.out.println("**Ticker,Company**");
            for (String element: companies){
                System.out.println(element);
            }
            String keepGoing = "";
            do{
                System.out.println(ytd(data, getChoice()));
                System.out.println("Do you want to see another stock's YTD? 'Y/N'");
                keepGoing = scnr.next();
            }while(keepGoing.equals("Y"));
            
            
            
        }
        catch (Exception ex) {
            System.out.println("Something went wrong.");
        }
    }
    
    public static ArrayList<String> readData() throws FileNotFoundException, IOException{
        //create arrayList
        ArrayList<String> textLines = new ArrayList<>();
        try{
            //Set up file reading
            FileInputStream fileByteStream = null;
            Scanner inFS = null;
            fileByteStream = new FileInputStream("stockpricedata.txt");
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

    public static ArrayList<String> getDistinctCompany(ArrayList<String> data) {
        ArrayList<String> company = new ArrayList<>();
        String LastNewTicker = "";
        
        String newCompany[] = data.get(1).split(",");
        
        company.add(newCompany[0] + "," + newCompany[1]);
        LastNewTicker = newCompany[0];
        
        for(int z = 1; z < data.size(); z++){
            if(!data.get(z).contains(LastNewTicker)){
                newCompany = data.get(z).split(",");
                company.add(newCompany[0] + "," + newCompany[1]);
                LastNewTicker = newCompany[0];
            }
        }
        return company;
    }
    
    public static String getChoice(){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Which stock ticker would you like to see? ");
        String choice = scnr.next();
        return choice;
    }
    
    public static double ytd(ArrayList<String> data, String stockTicker){
        
        boolean foundStart = false;
        int beginPoint = 0;
        int endPoint = 0;
        ArrayList<String> company = new ArrayList<>();
        String currentTicker;
        
        
        
        for(int i = 0; i < data.size(); i++){
            //find lines with the chosen ticker
            if (data.get(i).contains(stockTicker)){
                //first time, set a beginning index
                if (!foundStart){
                    beginPoint = i;
                    foundStart = true;
                }
                //when the next line in data doesn't have the ticker, or the current line is the last line, set the endpoint at the current line
                else if (i == data.size()-1 || !data.get(i+1).contains(stockTicker)){
                    endPoint = i;
                }
            }
        }
        
        //get value after 3rd comma from the end and beginning of the section
        String[] endState = data.get(endPoint).split(",");
        double endPrice = Double.parseDouble(endState[3]);
        
        String[] beginState = data.get(beginPoint).split(",");
        double beginPrice = Double.parseDouble(beginState[3]);
        
        double ytdReturns = ((endPrice - beginPrice)/beginPrice)*100;
        
        //adds result to stockReturns.txt
        writeResult(ytdReturns,beginState[0]);
        
        return ytdReturns;
    }
    
    public static void writeResult(double result, String stockTicker){
        try {
            //set up file writing
            FileOutputStream fileStream = null;
            PrintWriter outFS = null;
            
            //write without overwriting w/ that true below
            fileStream = new FileOutputStream("stockReturns.txt",true);
            outFS = new PrintWriter(fileStream);
            
            outFS.println(stockTicker+": "+result);
            
            outFS.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
