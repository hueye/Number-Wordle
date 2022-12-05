import java.util.Random;
import java.awt.Color;
import java.util.Arrays;

public class Wordle {
    public static void main(String[] args){
        //choosing a random number
        int min = 10000;
        int max = 99999;

        int[] answer = new int[]{0, 0, 0, 0, 0};
        int randomAnswer = new Random().nextInt(answer.length);
        int choice = numbers[randomNumber];

        System.out.println("Welcome to Number Wordle! Please enter 5 numbers with no spaces into the terminal.");

        /* slightly incoherent code (ignore)

        System.out.println("Random value in int from "+min+" to "+max+ ":");
      int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
      System.out.println(random_int);*/

        //colors
        Color yellow = new Color(255, 255, 0);
        Color green = new Color(0, 255, 0);
        Color black = new Color(0, 0, 0);

        //the guess (need to maximize efficiency. for now, make a separate if else statement for each number of the guess)
        //guess first number
        
        if{
          int guess[0] = answer[0];
            System.out.print(guess[0](Color.green));
        }else if{
          guess[0] = answer[1,2,3,4];
            System.out.print(guess[0](Color.yellow));
        }else{
          System.out.print(guess[0](Color.black));}
        //guess second number
        if{
          guess[1] = answer[1];
            System.out.print(guess[1](Color.green));
        }else if{
          guess[1] = answer[0,2,3,4];
            System.out.print(guess[1](Color.yellow));
        }else{
           System.out.print(guess[1](Color.black));}
        //guess third number
        if{
          guess[2] = answer[2];
            System.out.print(guess[2](Color.green));
        }else if{
          guess[2] = answer[0,1,3,4];
            System.out.print(guess[2](Color.yellow));
        }else{
          System.out.print(guess[2](Color.black));}
        //guess fourth number
        if{
          guess[3] = answer[3];
            System.out.print(guess[3](Color.green));
        }else if{
          guess[3] = answer[0,1,2,4];
            System.out.print(guess[3](Color.yellow));
        }else{
          System.out.print(guess[3](Color.black));}
        //guess fifth number
        if{
          guess[4] = answer[4];
            System.out.print(guess[4](Color.green));
        }else if{
          guess[4] = answer[0,1,2,3];
            System.out.print(guess[4](Color.yellow));
        }else{
          System.out.print(guess[4](Color.black));}
        
        if guess[] = choice[];
        System.out.println("Congratulations, you win!");

    }
}
