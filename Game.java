package gameRPS;

import java.util.Random;

public class Game {
	// create an instance of random
	private Random random = new Random();
	
	// method to return a boolean
	public boolean isUserTheWinner(int userChoice) {
		int randomNum = random.nextInt(3);		
		
		// we compare for the cases that user wins and return true if so
		return (userChoice == Choice.ROCK.getValue() && randomNum == Choice.SCISSORS.getValue())
	            || (userChoice == Choice.SCISSORS.getValue() && randomNum == Choice.PAPER.getValue())
	            || (userChoice == Choice.PAPER.getValue() && randomNum == Choice.ROCK.getValue());
		
	}
		

}
