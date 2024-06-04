//Copyright of Trevor Seestedt 2024
import java.util.Scanner;

public class FrontEnd{
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        double balance = 100; // test before user 
        boolean cont = true;
        System.out.println("Welcome to the dice game! \n");
        System.out.println("\nBalance: "+ balance);  
        
        do { 
            System.out.print ("Wager: ");
            double wager = keyboard.nextDouble();
            if (balance <= wager) {
                System.out.print ("Error! Wager exceeds balance. \nWager: ");
                wager = keyboard.nextDouble();
            }

            System.out.print("Enter dice number: ");
            double diceChoice = keyboard.nextDouble();

            System.out.print("Input 'Over' or 'Under': ");
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
                System.out.println("Neither choice was selected. \nInput 'Over' or 'Under': ");
                ouChoice = keyboard.nextLine();
            }

        } while (cont != false);

        
    }

}
