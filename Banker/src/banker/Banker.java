package banker;

import java.util.Scanner;

/**
 *
 * @author Tristan Epler
 */
public class Banker {

    public static void main(String[] args) {
        double balance = 500;
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Enter the number of your desired transaction type. \n 1. Balance \n 2. Deposit \n 3. Withdrawal \n 4. Quit");
        String cmd = scnr.next();
        
        if(cmd.equalsIgnoreCase("Balance") || cmd.equals("1")){
            System.out.printf("Your current balance is $"+"%.2f",balance);
            System.out.println();
        }
        else if (cmd.equalsIgnoreCase("Deposit")|| cmd.equals("2")){
            System.out.println("How much would you like to deposit?");
            double deposit = scnr.nextDouble();
            balance += deposit;
            System.out.printf("Your current balance is $"+"%.2f",balance);
            System.out.println();
        }
        else if (cmd.equalsIgnoreCase("Withdrawal")|| cmd.equals("3")){
            System.out.println("How much would you like to withdraw?");
            double withdraw = scnr.nextDouble();
            if (withdraw > balance){
                System.out.printf("Insufficient funds. Your current balance is $"+"%.2f",balance);
                System.out.println();
            }
            else{
                balance -= withdraw;
                System.out.printf("Your current balance is $"+"%.2f",balance);
                System.out.println();
            }
        }
        else if (cmd.equalsIgnoreCase("Quit")|| cmd.equals("4")){
            System.out.println("Thank you and Good-bye!");
        }
    }
    
}
