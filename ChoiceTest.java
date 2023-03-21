package gameRPS;

import java.util.Scanner;

public class ChoiceTest {
		// User input
		static Scanner scan = new Scanner(System.in);
        
        public static void main(String[] args) {
        	Game play = new Game();
        	System.out.println(" WELCOME");
        	System.out.println("Please enter your choice 0:\"rock\", 1:\"paper\", 2:\"scissors\" q:\"exit\" ");
        	
        	while (true) {
	        	System.out.println("-------------------------");
			    System.out.print("Enter your choice: ");
			    String userChoiceStr = scan.nextLine();
			    
			    // to end the game enter "q"
	        	if (userChoiceStr.equals("q")) {
	        		System.out.println("Come back soon!");
	        		break;
	        	}
		        
			    int userChoice = Integer.valueOf(userChoiceStr);
			         	
			    //System.out.println(play.getRandomChoice(choice));
			    System.out.println(play.isUserTheWinner(userChoice));
        	
        	
	        	
        	
        	}
}      

		
        
        
    }


