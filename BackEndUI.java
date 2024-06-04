import java.util.Scanner;

public class BackEndUI {
    public static void Welcome(double balance) {
        System.out.println("Welcome to the dice game!");
        System.out.println("\nBalance: "+ balance);  //create user database, each user with uuid and own bal. 
    }  

    public static double Wager(double balance) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nWager must be more than 1 dollar.");
        System.out.print ("Wager: ");
        double wager = keyboard.nextDouble();
        while (balance <= wager || wager < 1) {
            System.out.print ("Error. \n\nWager: ");
            wager = keyboard.nextDouble();
        }
        return wager; 
    }


    public static double DiceNumber() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Dice number must be between 0.01 and 100"); //implement slider in GUI
        System.out.print("\nEnter dice number: ");
        double diceChoice = keyboard.nextDouble();
        while (diceChoice <= 0 || diceChoice > 100) {
            System.out.println("\nError! Dice choice is out of range. \n\nEnter dice number: ");                
            diceChoice = keyboard.nextDouble();
        }
        return diceChoice;
    }

    public static String overUnder() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("\nInput 'Over' or 'Under': ");
        String ouChoice = keyboard.nextLine();
        while (!ouChoice.equalsIgnoreCase("Over") && !ouChoice.equalsIgnoreCase("Under")) {
            System.out.print("\nError! Choice is invalid. \nInput 'Over' or 'Under': ");
            ouChoice = keyboard.nextLine();
        }
        return ouChoice;
    }




}
