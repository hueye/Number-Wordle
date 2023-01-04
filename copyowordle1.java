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
        
    public static ArrayList<String> correct = new ArrayList<String>();
    public static ArrayList<String> answerArray = new ArrayList<String>();
    public static ArrayList<String> guessArray = new ArrayList<String>();

    public static void main(String[] args){
        //random number generator
        for(int newNumber = 0; newNumber < 5; newNumber++){
            Random rand = new Random();
            newNumber = rand.nextInt(9);
        }

        correct.add(newNumber.toString());
        correct = correct.split("");

        //the game
        System.out.print("Welcome to Number Wordle! The rules are simple: you have six tries to guess a five digit number. Please enter 5 numbers with no spaces into the terminal:");

        //testing the answer
        for(int timesGuessed = 0; timesGuessed < 6; timesGuessed++){
            String guess = reader.readLine();
        
                guessArray = guess.split("");
                answerArray = correct.split("");
 
//first number
        if(guess.split[0] == correct.split[0]){
            System.out.println(correct.split[0] + " is in the correct spot!");

        }else if(guess.split[0] == correct.split[1]){
            System.out.println(guess.split[0] + " is misplaced.");

        }else if(guess.split[0] == correct.split[2]){
            System.out.println(guess.split[0] + " is misplaced.");

        }else if(guess.split[0] == correct.split[3]){
            System.out.println(guess.split[0] + " is misplaced.");

        }else if(guess.split[0] == correct.split[4]){
            System.out.println(guess.split[0] + " is misplaced.");
        }
        
//second number
        if(guess.split[1] == correct.split[1]){
            System.out.println(guess.split[1] + " is in the correct spot!");

        }else if(guess.split[1] == correct.split[0]){
            System.out.println(guess.split[1] + " is misplaced.");

        }else if(guess.split[1] == correct.split[2]){
            System.out.println(guess.split[1] + " is misplaced.");

        }else if(guess.split[1] == correct.split[3]){
            System.out.println(guess.split[1] + " is misplaced.");

        }else if(guess.split[1] == correct.split[4]){
            System.out.println(guess.split[1] + " is misplaced.");
        }
//third number
        if(guess.split[2] == correct.split[2]){
            System.out.println(guess.split[2] + " is in the correct spot!");

        }else if(guess.split[2] == correct.split[0]){
            System.out.println(guess.split[2] + " is misplaced.");

        }else if(guess.split[2] == correct.split[1]){
            System.out.println(guess.split[2] + " is misplaced.");

        }else if(guess.split[2] == correct.split[3]){
            System.out.println(guess.split[2] + " is misplaced.");

        }else if(guess.split[2] == correct.split[4]){
            System.out.println(guess.split[2] + " is misplaced.");
        }
//fourth number
        if(guess.split[3] == correct.split[3]){
            System.out.println(guess.split[3] + " is in the correct spot!");

        }else if(guess.split[3] == correct.split[0]){
            System.out.println(guess.split[3] + " is misplaced.");

        }else if(guess.split[3] == correct.split[1]){
            System.out.println(guess.split[3] + " is misplaced.");

        }else if(guess.split[3] == correct.split[2]){
            System.out.println(guess.split[3] + " is misplaced.");

        }else if(guess.split[3] == correct.split[4]){
            System.out.println(guess.split[3] + " is misplaced.");
        }
//fifth number
        if(guess.split[4] == correct.split[4]){
            System.out.println(guess.split[4] + " is in the correct spot!");

        }else if(guess.split[4] == correct.split[0]){
            System.out.println(guess.split[4] + " is misplaced.");

        }else if(guess.split[4] == correct.split[1]){
            System.out.println(guess.split[4] + " is misplaced.");

        }else if(guess.split[4] == correct.split[2]){
            System.out.println(guess.split[4] + " is misplaced.");

        }else if(guess.split[4] == correct.split[3]){
            System.out.println(guess.split[4] + " is misplaced.");
        }

//win condition
        if(guessArray == answerArray){
            System.out.println("Congrats, you got the Number Wordle in " + timesGuessed + "tries!");
        }
//lose condition
        if(timesGuessed == 6){
            System.out.println("You're out of attempts! Nice try. Refresh to play again.");
        }
        }
    }
}