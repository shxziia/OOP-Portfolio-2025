import java.util.Scanner;
import java.util.Random;

public class Rock {
    public static void main(String[] args) {
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay = "";  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
        //computer's play


        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        System.out.println("Lets play Rock, Paper and Scissors!" + "Enter your move: " + "Rock = R  Paper = P  Scissors = S");

        computerInt = generator.nextInt(3) + 1;

        if (computerInt == 1)
            computerPlay = "Rock";
        else if (computerInt == 2)
            computerPlay = "Paper";
        else if (computerInt == 3)
            computerPlay = "Scissors";


        System.out.println("Enter your move: ");
        personPlay = scan.nextLine();

        personPlay = personPlay.toUpperCase();
        System.out.println("Computer play: " + computerPlay);

        if (personPlay.equals(computerPlay)) {
            System.out.println("It's a tie!");
        } else if (personPlay.equals("R")) {
            if (computerPlay.equals("S")) {
                System.out.println("Rock crushes scissors.  You win!!");
            }
        } else if (computerPlay.equals("P")) {
            if (personPlay.equals("R")) {
                System.out.println("Paper crushes Rock.  Computer win!!");
            }
        } else if (personPlay.equals("P")) {
            if (computerPlay.equals("S")) {
                System.out.println("Scissors crushes Paper.  Computer win!!");
            }
        } else if (computerPlay.equals("R")) {
            if (personPlay.equals("P")) {
                System.out.println("Rock crushes Paper.  Computer win!!");
            }
        } else if (personPlay.equals("S")) {
            if (computerPlay.equals("P")) {
                System.out.println("Scissors crushes Paper.  You win!!");
            }

        }

    }
}