import java.util.Random;
import java.util.Scanner;

public class Numbergame {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Random rand = new Random();
       int numtoguess = rand.nextInt(100)+1;
       boolean hasguessed = false ;
       System.out.println("Welcome to the Number Guessing Game!");
       System.out.println("I have selected a number between 0 and 99.");
       System.out.println("You have  5 attempts to guess the number.");
        
       for(int numoftries = 0 ; numoftries < 5 ; numoftries++){
        System.out.println("ENTER THE NUMBER YOU HAVE GUESSED ");
        int guess = sc.nextInt();

        if(guess < numtoguess ){
            System.out.println("YOUR GUESS IS LOW");
        }
       else if (guess > numtoguess){
          System.out.println("YOUR ANSWER IS HIGH");
       }
       else if ( guess < 1 || guess > 100 ){
         System.out.println("INVALID NUMBER ,YOU SHOULD ENTER A DIGIT BETWEEN 1 TO 100");
       }
       else{
        hasguessed = true ;
        System.err.println("CONGRATS! YOU HAVE GUESSED THE NUMBER " + (numoftries + 1));
       break;
    }
       }
       if(!hasguessed){
        System.out.println("SORRY , YOU HAVE USED ALL YOUR ATTEMPTS \n THE CORRECT NUMBER IS "+ numtoguess);
       }

       sc.close();
        }
    }

