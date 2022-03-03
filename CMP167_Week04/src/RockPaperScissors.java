/**
 * 
 ?* @author Richard_T.
 */
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Random rand = new Random();
	
	System.out.println("Enter 1 for Scissors, 2 for Rock or 3  for Paper");
	int userSelection = input.nextInt();
	
	int pcSelection = rand.nextInt(3)+1;
	
	//if user wins
	if ((userSelection == 1 && pcSelection == 3) ||
			(userSelection == 2 && pcSelection == 1) ||
				(userSelection == 3 && pcSelection == 2)) {
		System.out.println("User Enters: " + userSelection + " & PC Entered: "+ pcSelection);
		System.out.println("You win!");
		
	}
	//if user ties
	else if (userSelection == pcSelection) {
		System.out.println("User Enters: " + userSelection + " & PC Entered: "+ pcSelection);
		System.out.println("Its a Tie!");	
	}
	//if user lose
	else {
		System.out.println("User Enters: " + userSelection + " & PC Entered: "+ pcSelection);
		System.out.println("You lose, PC wins!");
	}
  }
}
