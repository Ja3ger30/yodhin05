package mahe.icas.cs;

public class Casino {

	public static void main( String[] args)
	{
		System.out.println("Welcome to the dice game!");
		
		Game g = new Game(new Player("Yodhin"));
		g.playGame();
		
		System.out.println(g.getScore());
	}
}
