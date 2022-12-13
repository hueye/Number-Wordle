//wordle
import java.util.Random;
import javax.lang.model.type.ArrayType;
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
        //System.out.print(answer);

        //the game
        System.out.print("Welcome to Number Wordle! The rules are simple: you have six tries to guess a five digit number. Please enter 5 numbers with no spaces into the terminal:");
        
        //testing the answer
        for(int timesGuessed = 0; timesGuessed < 6; timesGuessed++){
            String guess = reader.readLine();

           guess = guess.split("");
           answerArray = answer.split("");
//first number
        if(guess.split[0] = answerArray[0]){
            System.out.println(guess.split[0] + " is in the correct spot!");

        }else if(guess.split[0] = answerArray[1]){
            System.out.println(guess.split[0] + " is misplaced.");

        }else if(guess.split[0] = answerArray[2]){
            System.out.println(guess.split[0] + " is misplaced.");

        }else if(guess.split[0] = answerArray[3]){
            System.out.println(guess.split[0] + " is misplaced.");

        }else if(guess.split[0] = answerArray[4]){
            System.out.println(guess.split[0] + " is misplaced.");
        }
//second number
        if(guess.split[1] = answerArray[1]){
            System.out.println(guess.split[1] + " is in the correct spot!");

        }else if(guess.split[1] = answerArray[0]){
            System.out.println(guess.split[1] + " is misplaced.");

        }else if(guess.split[1] = answerArray[2]){
            System.out.println(guess.split[1] + " is misplaced.");

        }else if(guess.split[1] = answerArray[3]){
            System.out.println(guess.split[1] + " is misplaced.");

        }else if(guess.split[1] = answerArray[4]){
            System.out.println(guess.split[1] + " is misplaced.");
        }
//third number
        if(guess.split[2] = answerArray[2]){
            System.out.println(guess.split[2] + " is in the correct spot!");

        }else if(guess.split[2] = answerArray[0]){
            System.out.println(guess.split[2] + " is misplaced.");

        }else if(guess.split[2] = answerArray[1]){
            System.out.println(guess.split[2] + " is misplaced.");

        }else if(guess.split[2] = answerArray[3]){
            System.out.println(guess.split[2] + " is misplaced.");

        }else if(guess.split[2] = answerArray[4]){
            System.out.println(guess.split[2] + " is misplaced.");
        }
//fourth number
        if(guess.split[3] = answerArray[3]){
            System.out.println(guess.split[3] + " is in the correct spot!");

        }else if(guess.split[3] = answerArray[0]){
            System.out.println(guess.split[3] + " is misplaced.");

        }else if(guess.split[3] = answerArray[1]){
            System.out.println(guess.split[3] + " is misplaced.");

        }else if(guess.split[3] = answerArray[2]){
            System.out.println(guess.split[3] + " is misplaced.");

        }else if(guess.split[3] = answerArray[4]){
            System.out.println(guess.split[3] + " is misplaced.");
        }
//fifth number
        if(guess.split[4] = answerArray[4]){
            System.out.println(guess.split[4] + " is in the correct spot!");

        }else if(guess.split[4] = answerArray[0]){
            System.out.println(guess.split[4] + " is misplaced.");

        }else if(guess.split[4] = answerArray[1]){
            System.out.println(guess.split[4] + " is misplaced.");

        }else if(guess.split[4] = answerArray[2]){
            System.out.println(guess.split[4] + " is misplaced.");

        }else if(guess.split[4] = answerArray[3]){
            System.out.println(guess.split[4] + " is misplaced.");
        }

//win condition
        if(guess = answerArray){
            System.out.println("Congrats, you got the Number Wordle in " + timesGuessed + "tries!");
        }
//lose condition
        if(timesGuessed = 6){
            System.out.println("You're out of attempts! Nice try. Refresh to play again.");
        }
        }
    }
}