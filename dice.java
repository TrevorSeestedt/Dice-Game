// Copyright of Trevor Seestedt 2024
import java.util.Random; 

public class Dice {  
    
    public static boolean Game(double choice, String overUnder) {
        Random rand = new Random();
        double randomNum = (rand.nextInt(10000) / 100);
        
        if (randomNum == 0)
            randomNum = (rand.nextInt(10000) / 100);

        System.out.println("The number is: "+ randomNum);
        if (overUnder.equalsIgnoreCase("Over")) {
            return randomNum > choice;
        } 
        
        else if (overUnder.equalsIgnoreCase("Under")) {
            return randomNum < choice;
        } 
        
        else {
            // Neither "Over" nor "Under" was selected
            return false;
        }
    }
}