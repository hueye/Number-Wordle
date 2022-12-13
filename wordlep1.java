//wordle
import java.util.Random;
import javax.lang.model.type.ArrayType;
import java.awt.Color;
import java.sql.Array;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Wordle {
    static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
        
    static ArrayList<String> answer = new ArrayList<String>();
    static ArrayList<String> answerArray = new ArrayList<String>();

    public static void main(String[] args){
        //random number generator
        for(int random = 0; random < 5; random++){
            Random rand = new Random();
                random = rand.nextInt(9);
        }

        answer.add(random.toString());
        answer = answer.split("");
        System.out.print(answer);

        //the game
        System.out.print("Welcome to Number Wordle! Please enter 5 numbers with no spaces into the terminal:");
        
        //testing the answer
        for(int timesGuessed = 0; timesGuessed < 6; timesGuessed++){
            String guess = reader.readLine();

           guess = guess.split("");
           answerArray = answer.split("");

        if(guess.split[0] = answerArray[0]){
            System.out.println(guess.split[0] + " is in the correct spot!");
        }

            
        }
    }
}