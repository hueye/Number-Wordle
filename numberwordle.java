//wordle
//to run, type java wordlep1.java into the terminal :)
//note 12/16 - maybe change variables?
import java.util.Random;
import javax.lang.model.type.ArrayType;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Wordle {
    public static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

            public static List<String> correct = new ArrayList<String>();
            public static List<String> guessArray = new ArrayList<String>();

    public static void main(String[] args){
        //random number generator
        for(int newNumber = 0; newNumber < 5; newNumber++){
            Random rand = new Random();
            newNumber = rand.nextInt(9);
        }

        correct.add(newNumber.toString());

        //the game
        System.out.print("Welcome to Number Wordle! The rules are simple: you have six tries to guess a five digit number. Please enter 5 numbers with no spaces into the terminal:");

        //testing the answer
        for(int timesGuessed = 0; timesGuessed < 6; timesGuessed++){
            String guess = reader.readLine();
        
                guessArray = guess.split(""); //this is the guess array
                correct = correct.split(""); //this is the correct array

//first number
        if(guessArray[0] == correct[0]){
            System.out.println(correct[0] + " is in the correct spot!");

        }else if(guessArray[0] == correct[1]){
            System.out.println(correct[0] + " is misplaced.");

        }else if(guessArray[0] == correct[2]){
            System.out.println(correct[0] + " is misplaced.");

        }else if(guessArray[0] == correct[3]){
            System.out.println(correct[0] + " is misplaced.");

        }else if(guessArray[0] == correct[4]){
            System.out.println(correct[0] + " is misplaced.");
        }
        
//second number
        if(guessArray[1] == correct[1]){
            System.out.println(correct[1] + " is in the correct spot!");

        }else if(guessArray[1] == correct[0]){
            System.out.println(correct[1] + " is misplaced.");

        }else if(guessArray[1] == correct[2]){
            System.out.println(correct[1] + " is misplaced.");

        }else if(guessArray[1] == correct[3]){
            System.out.println(correct[1] + " is misplaced.");

        }else if(guessArray[1] == correct[4]){
            System.out.println(correct[1] + " is misplaced.");
        }
//third number
        if(guessArray[2] == correct[2]){
            System.out.println(correct[2] + " is in the correct spot!");

        }else if(guessArray[2] == correct[0]){
            System.out.println(correct[2] + " is misplaced.");

        }else if(guessArray[2] == correct[1]){
            System.out.println(correct[2] + " is misplaced.");

        }else if(guessArray[2] == correct[3]){
            System.out.println(correct[2] + " is misplaced.");

        }else if(guessArray[2] == correct[4]){
            System.out.println(correct[2] + " is misplaced.");
        }
//fourth number
        if(guessArray[3] == correct[3]){
            System.out.println(correct[3] + " is in the correct spot!");

        }else if(guessArray[3] == correct[0]){
            System.out.println(correct[3] + " is misplaced.");

        }else if(guessArray[3] == correct[1]){
            System.out.println(correct[3] + " is misplaced.");

        }else if(guessArray[3] == correct[2]){
            System.out.println(correct[3] + " is misplaced.");

        }else if(guessArray[3] == correct[4]){
            System.out.println(correct[3] + " is misplaced.");
        }
//fifth number
        if(guessArray[4] == correct[4]){
            System.out.println(correct[4] + " is in the correct spot!");

        }else if(guessArray[4] == correct[0]){
            System.out.println(correct[4] + " is misplaced.");

        }else if(guessArray[4] == correct[1]){
            System.out.println(correct[4] + " is misplaced.");

        }else if(guessArray[4] == correct[2]){
            System.out.println(correct[4] + " is misplaced.");

        }else if(guessArray[4] == correct[3]){
            System.out.println(correct[4] + " is misplaced.");
        }

//win condition
        if(guessArray == correct){
            System.out.println("Congrats, you got the Number Wordle in " + timesGuessed + "tries!");
        }
//lose condition
        if(timesGuessed == 6){
            System.out.println("You're out of attempts! Nice try. Refresh to play again.");
        }
        }
    }
}
