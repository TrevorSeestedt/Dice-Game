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
            BackEndUI.Wager(balance);

            //user chooses number between 0.01 and 100 make it between 0 and 100 
            BackEndUI.DiceNumber();

            //user prompted with over under
            BackEndUI.overUnder();

            //result 
            boolean result = Dice.Game(BackEndUI.DiceNumber(), BackEndUI.overUnder());

            //loss or win and balance change
            if (result) {
                System.out.println("\nWinner!");
                balance += BackEndUI.Wager(balance);                    
                System.out.println("\nBalance: "+ balance);   
            } else { 
                System.out.println("\nLoser!");
                balance -= BackEndUI.Wager(balance);
                System.out.println("\nBalance: "+ balance);   
            } 
            //continue
            System.out.println("Would you like to continue ('Yes' or 'No')?");
            cont = keyboard.nextBoolean();
        } while (cont != false);

        
    }

}
