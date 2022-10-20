package rockpaperscissorslizardspock;

import java.util.Scanner;

/**
 *
 * @author Tristan Epler
 */
public class RockPaperScissorsLizardSpock {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userGuess;
        do{
        System.out.println("Please enter the number of one of the following options: \n 1. Rock \n 2. Paper \n 3. Scissors \n 4. Lizard \n 5. Spock \n -1. Quit");
        userGuess = scnr.nextInt();
        int computerGuess = (int)(Math.random()*5)+1;
        
        String uGuess = convertName(userGuess);
        System.out.println("Your guess: "+uGuess);
        String cGuess = convertName(computerGuess);
        System.out.println("Computer's guess: "+cGuess);
        System.out.println(whoWins(userGuess,computerGuess));
        
//        3Scissors cuts 2paper, 
//        2paper covers 1rock, 
//        1rock crushes 4lizard, 
//        4lizard poisons 5Spock, 
//        5Spock smashes 3scissors, 
//        3scissors decapitates 4lizard, 
//        4lizard eats 2paper, 
//        2paper disproves 5Spock, 
//        5Spock vaporizes 1rock, 
//        1rock crushes 3scissors
        }while (userGuess != -1);
        
    }
    
    public static String whoWins(int userGuess, int computerGuess){
        String whoWon = "";
        if (userGuess == computerGuess){
            whoWon = "Tie";
        }
        else if(userGuess == 1 && (computerGuess == 4 || computerGuess == 3)){
            whoWon = "user";
        }
        else if (userGuess == 2 && (computerGuess == 1 || computerGuess == 5)){
            whoWon = "user";
        }
        else if (userGuess == 3 && (computerGuess == 2 || computerGuess == 4)){
            whoWon = "user";
        }
        else if (userGuess == 4 && (computerGuess == 2 || computerGuess == 5)){
            whoWon = "user";
        }
        else if (userGuess == 5 && (computerGuess == 1 || computerGuess == 3)){
            whoWon = "user";
        }
        else{
            whoWon = "computer";
        }
        return whoWon;
    }
    
    public static String convertName(int guessNum){
        // convert number to word for each choice
        
        String answer = "";
        
        switch (guessNum){
            case 1:
                answer = "Rock";
                break;
            case 2:
                answer = "Paper";
                break;
            case 3:
                answer = "Sciessors";
                break;
            case 4:
                answer = "Lizard";
                break;
            case 5:
                answer = "Spock";
                break;
            default:
                answer = "Bad guess";
                break;
        }
        
        return answer;
    }
}
