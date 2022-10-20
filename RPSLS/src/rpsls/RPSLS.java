package rpsls;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tristan Epler
 */
public class RPSLS {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int computerGuess = 0;
        int userGuess = 0;
        int userWins = 0, ties = 0, computerWins=0;
        
        String answer = welcome();
        
        if (answer.equalsIgnoreCase("rules")){
            try{
                readRules();
            }
            catch(FileNotFoundException fne){
                System.out.println("Something went wrong! Just give it a try.");
            }
        }
        else if(answer.equalsIgnoreCase("n")){
            //exit program
            System.out.println("Goodbye.");
            return;
        }
        
        do{
            System.out.println("Please enter your guess 1)Rock 2)Paper 3)Scissors 4)Lizard 5)Spock (-1 to quit)");
            userGuess = scnr.nextInt();
            
            if (userGuess == -1){
                //exit loop
                break;
            }
            
            //convert user guess to name
            String uGuess = convertName(userGuess);
            System.out.println("Your guess:"+uGuess);
            
            //generate computer guess
            Random rand = new Random();
            computerGuess = rand.nextInt(5)+1;
            String cGuess = convertName(computerGuess);
            System.out.println("Computer guess:"+cGuess);
            
            //determine winner
            String winner = whoWins(userGuess,computerGuess);
            
            if(winner.contains("User")){
                userWins++;
                System.out.println(winner);
            }
            else if(winner.equalsIgnoreCase("Tie")){
                ties++;
                System.out.println(winner);
            }
            else{
                computerWins++;
                System.out.println(winner);
            }
                
        }while(userGuess != -1);
        
        System.out.println("User: "+userWins+" Ties: "+ties+" Computer: "+computerWins);
        
        try{
            writeGameData(userWins,computerWins,ties);
        }
        catch (FileNotFoundException fne){
            System.out.println("Aw Snap! Something went really wrong."+fne.getMessage());
        }
    }
    public static String welcome(){
        boolean ready = false;
        
            //setup scanner for user input
            Scanner scnr = new Scanner(System.in);
            
            String answer;
            System.out.println("#################################################");
            System.out.println("Welcome to Rock, Paper, Scissors, Lizard, Spock!");
            System.out.println("Created by Tristan Epler");
            System.out.println();
            System.out.println("To learn the rules, type the word \"rules\"");
            System.out.println("Shall we play the game? (Y/N)");
            System.out.println("#################################################");
            System.out.print("Answer: ");
            
            answer = scnr.next();
            return answer;
//            if(response.equalsIgnoreCase("Y")){
//                return true;
//            }
//            else if(response.equalsIgnoreCase("rules")){
//                rules();
//                System.out.println("\nShall we play the game? (Y/N)");
//                if(scnr.next().equalsIgnoreCase("Y")){
//                    return true;
//                }
//                else{
//                    return false;
//                }
//            }
//            else{
//                return false;
//            }
//            
    }
    public static void readRules() throws FileNotFoundException{
        //Set up file reading
        FileInputStream fileByteStream = null;
        Scanner inFS = null;
        fileByteStream = new FileInputStream("rules.txt");
        inFS = new Scanner(fileByteStream);
        while(inFS.hasNextLine()){
            System.out.println(inFS.nextLine());
        }        
    }
    public static String convertName(int guessNum){
        //convert num to actor
        String answer = "";
        switch(guessNum){
            case 1:
                answer = "Rock";
                break;
            case 2:
                answer = "Paper";
                break;
            case 3:
                answer = "Scissors";
                break;
            case 4:
                answer = "Lizard";
                break;    
            case 5:
                answer = "Spock";
                break;   
        }
        return answer;
    }
    public static void writeGameData(int userWins, int computerWins, int ties) throws FileNotFoundException{
        int totalGames = userWins + computerWins +ties;
        double winningPercentage = ((double)userWins/(double)totalGames);
        
        PrintWriter pw = new PrintWriter("GameData.txt");
        
        pw.println("Out of a total of "+ totalGames+" games.");
        pw.println("User won "+userWins+" game(s).");
        pw.println("Computer won "+computerWins+" game(s).");
        pw.printf("Your winning percentage is %.0f%% \n",winningPercentage*100);
        pw.println("Thank you for playing Rock, Paper, Scissors, Lizard, Spock!\n");
        pw.println("Have you seen Dr. Falken?");
        
        pw.close();
        
    }
    public static String whoWins( int userGuess, int computerGuess){
        String whoWon;
        //compare answers to find who won
        
        if(userGuess==computerGuess){
            whoWon = "Tie";
        }
        else if(userGuess == 1 && (computerGuess == 4 || computerGuess == 3)){
            if (computerGuess == 4){
                whoWon = "Rock crushes Lizard - User Wins!";
            }
            else{
                whoWon = "Rock crushes Scissors - User Wins!";
            }
        }
        else if (userGuess == 2 && (computerGuess == 1 || computerGuess == 5)){
            if (computerGuess == 1){
                whoWon = "Paper covers Rock - User Wins!";
            }
            else{
                whoWon = "Paper disproves Spock - User Wins!";
            }
        }
        else if (userGuess == 3 && (computerGuess == 2 || computerGuess == 4)){
            if (computerGuess == 2){
                whoWon = "Scissors cuts Paper - User Wins!";
            }
            else{
                whoWon = "Scissors decapitates Lizard - User Wins!";
            }
        }
        else if (userGuess == 4 && (computerGuess == 5 || computerGuess == 2)){
            if(computerGuess == 5){
                whoWon = "Lizard poisons Spock - User Wins!";
            }
            else{
                whoWon = "Lizard eats Paper - User Wins!";
            }
        }
        else if (userGuess == 5 && (computerGuess == 1 || computerGuess == 3)){
            if(computerGuess == 1){
                whoWon = "Spock vaporizes Rock - user Wins!";
            }
            else{
                whoWon = "Spock smashes Scissors - User Wins!";
            }
        }
        else{
            whoWon = "Computer Wins!";
        }
        return whoWon;
    }
}
