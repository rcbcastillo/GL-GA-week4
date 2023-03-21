package gameRPS;

public enum Choice {
	ROCK(0), PAPER(1), SCISSORS(2);
	
	/* Convert the identifier name to a number*/
	private int value;
	
	
	// Constructor
	Choice(int value) {
		this.value = value;
	}
	
		
	public int getValue() {
		return value;
	}
}
