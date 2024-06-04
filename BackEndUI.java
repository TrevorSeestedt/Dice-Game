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


}
