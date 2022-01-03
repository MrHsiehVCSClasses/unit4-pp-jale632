    package u4pp;

    /**
    * JAVADOC HERE
    */
import java.util.Scanner;

public class RockPaperScissors {

    /* ANY CODE YOU NEED HERE */

    /**
     * JAVADOC HERE
     */
    public static void play(Scanner sc) {

        System.out.println("Welcome to Rock Paper Scissors");

        String userPick;
        String AIPick
        int result;
        int win = 0;
        int lose = 0;
        int tie = 0;
        boolean retry = true;
    
        while(retry) 
        {
            System.out,println("Would you like to pick (R)ock, (P)aper, (S)cissors, or (A)ny:");
            String userPick = sc.nextLine();
            if (userPick.equals("A"))
            {
                userPick = randomPick();
            }
            else if(!(userPick.equals("R") || userPick.equals("r") || userPick.equals("P") || userPick.equals("p") || userPick.equals("S") || userPick.equals("s") || (userPick.equals("A") || userPick.equals("a")))
            {
                System.out.println("Invalid input, please try again"); 
            }

        userPick = userPick.toUpperCase();
        AIPick = randomPick();

        result = results(userPick, AIPick);
        
        if(result == 0){
            tie++;
            System.out.println("You both picked " + userPick + ". " + "Its a tie!");
        }
        else if(result == 1){
            win++;
            System.out.println("You picked " + userPick + ", and the computer picked " + AIPick +  ". You win!");

        }
        else 
            lose++;
            System.out.println("You Picked" + userPick + ", and Computer picked " + AIPick + ". You lose!");
        }

        System.out.println("You have " + win + " wins and " + lose + " loses and " + tie + " ties");
        System.out.println("Would you like to play again? (Y)es or (N)o: ");
        userInput 
    }


    /**
     * JAVADOC HERE
     */
    public static int results(String playerChoice, String computerChoice) {
        /* YOUR CODE HERE */
    }
    public static String randomPick(){
        String returnVariable;
        int randomNumber = int(Math.random()*3);
        if(randomNumber == 0)
        {
            returnVariable = "R";,.
            return returnVariable
        }
        else if(randomNumber == 1)
        {
            returnVariable = "P";
            return returnVariable
        }
        else 
        {
            returnVariable = "S"
            return returnVariable
        }
    }
    /* any helper methods you might need */
}