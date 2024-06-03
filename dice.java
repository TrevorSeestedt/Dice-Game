// Copyright of Trevor Seestedt 2024
import java.util.Random; 

public class Dice { 
    private double choice; 
    private String overUnder;   
    public boolean result; 

    //random number will be generated from 1 - 10000
    Random rand = new Random();
    double randomNum = (rand.nextInt(10000) / 100);

    public boolean Game(double choice, String overUnder, boolean result) {
        //if user chooses to go over 
        if (overUnder.equalsIgnoreCase("Over")) {
            if (choice > randomNum) {
                result = true; 
            }
            else {
                result = false; 
            }
        }
        //if user chooses to go under 
        else if (overUnder.equalsIgnoreCase("Under")) {
            if (choice < randomNum) {
                result =true; 
            }
            else {
                result = false; 
            }
        }
    }
}