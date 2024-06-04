//Copyright of Trevor Seestedt 2024
import java.util.Scanner;

public class FrontEndUI{
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        double balance = 100; // test before user 
        boolean cont = true;
        BackEndUI.Welcome(balance);

        do { 
            //wager has to be more than 1
            System.out.print ("\nWager: ");
            double wager = keyboard.nextDouble();
            if (balance <= wager) {
                System.out.print ("Error! Insufficient balance. \n\nWager: ");
                wager = keyboard.nextDouble();
            } 
            
            else if (wager < 1) {
                System.out.print ("Error! Wager less than $1. \n\nWager: ");
                wager = keyboard.nextDouble();
            }
            // must make it between 0 and 100 
            System.out.print("\nEnter dice number: ");
            double diceChoice = keyboard.nextDouble();
            if (diceChoice <= 0 || diceChoice > 100) {
                System.out.println("\nError! Dice choice is out of range. \n\nEnter dice number: ");
                diceChoice = keyboard.nextDouble();
            }

            System.out.print("\nInput 'Over' or 'Under': ");
            String ouChoice = keyboard.nextLine();
            if (ouChoice.isEmpty()) {
                ouChoice = keyboard.nextLine(); // Read the actual input
            }

            if (ouChoice.equalsIgnoreCase("Over") || ouChoice.equalsIgnoreCase("Under")) {
                boolean result = Dice.Game(diceChoice, ouChoice);
                if (result) {
                    System.out.println("\nWinner!");
                    balance += wager; 
                }
                else { 
                    System.out.println("\nLoser!");
                    balance -= wager; 
                } 
                System.out.println("\nBalance: "+ balance);  
            }

            else {
                System.out.println("\nNeither choice was selected. \n\nInput 'Over' or 'Under': ");
                ouChoice = keyboard.nextLine();
            }

        } while (cont != false);

        
    }

}
