package mahe.icas.cs;

public class Game {
	
	private Player player;
	private Die die1;
	private Die die2;
	private int val1, val2;
	
	public Game(Player player)
	{
		this.player = player;
	}
	
	
	public void playGame()
	{
		die1 = new Die();
		die2 = new Die();
		
		die1.rollDie();
		val1 = die1.getFaceValue();
		
		die2.rollDie();
		val2 = die2.getFaceValue();
	}
	
	public String getScore()
	{
		System.out.println("Player name: " + player.getPlayerName()); 
		int total = val1 + val2;		
		return new String("Score : "+ val1 + "," + val2 + " = " + total );
	}
}

