import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

  
    String ready = scan.nextLine();

    if (ready.equals("yes")){
        System.out.println("\nGreat!");
        System.out.println("Rock - Paper - Scisscors, Shoot!");
        String choice = scan.nextLine();
        String computerChoice = computerChoice();
        String result = result(choice, computerChoice);
        printResult(choice, computerChoice, result);
    } else {
        System.out.println("Darn! Some other time.");
    }         

        scan.close();
    }

    /**
     * Function name: computerChoice - picks randomly between rock paper and scissors
     * @return a choice (String).
     * 
     * Inside the function:
     *   1. Picks a random number between 0 and 2.
     *   2. if 0: returns the choice 'rock'
     *      if 1: returns the choice 'paper'
     *      if 2: returns the choice 'scissors'
     */

     public static String computerChoice() {
        double random = Math.random() * 3; // range 0 - 2.9999
        int integer = (int)random;

        switch (integer) {
            case 0: return "rock"; 
            case 1: return "paper"; 
            case 2: return "scissors";
            default: return ""; //impossible
        
        }
     }

    /**
     * Function name: result - It returns the result of the game.
     *  @param yourChoice (String)
     *  @param computerChoice (String) 
     *  @return result (String) 

     * Inside the function:
     *   1. result is "You win" if:
     * 
     *       You: "rock"      Computer: "scissors"
     *       You: "paper"     Computer: "rock"
     *       You: "scissors"  Computer: "paper"
     * 
     *   2. result is "You lose" if:
     * 
     *       Computer: "rock"      You: "scissors"
     *       Computer: "paper"     You: "rock"
     *       Computer: "scissors"  You: "paper"
     * 
     *   3. result is "It's a tie" if:
     * 
     *       your choice equals computer choice.
     *   
     */

    public static String result(String yourChoice, String computerChoice) {
        String result = "";

        if (yourChoice.equals("rock" ) && computerChoice.equals("scissors")) {
            result = "You win!";
        } else if (computerChoice.equals("rock") && yourChoice.equals("scissors")) {
            result = "You lose!";
        } else if (yourChoice.equals("paper" ) && computerChoice.equals("rock")) {
            result = "You win!";
        } else if (computerChoice.equals("paper") && yourChoice.equals("rock")) {
            result = "You lose!";
        } else if (yourChoice.equals("scissors" ) && computerChoice.equals("paper")) {
            result = "You win!";   
        } else if (computerChoice.equals("scissors") && yourChoice.equals("paper")) {
            result = "You lose!";
        } else if (computerChoice.equals(yourChoice)){
            result = "It's a tie.";
        }

        return result;
      }

    /**
     * Name: printResult - It prints everything (your choice, computer choice, result)
     * @param yourChoice (String)
     * @param computerChoice (String)
     * @param result (String)
     * 
     * Inside the function:
     * 
     *  1. prints everything:
     *      – prints: You chose:          <your choice>
     *      – prints: The computer chose: <computer choice>
     *      – prints: <result>
     */

     public static void printResult(String yourChoice, String computerChoice, String result){
        System.out.println("\nYou chose: \t " + yourChoice);
        System.out.println("The computer chose:\t" + computerChoice);
        System.out.println(result);
     }

}
