package mahe.icas.cs;

import java.util.Random;

public class Die {

	private int minNum = 1;
	private int maxNum = 6;
	
	private int faceValue; //Face value of the die must be between 1 and 6.
	
	public int getFaceValue()
	{
		return faceValue;
	}
	
	private void setFaceValue( int faceValue)
	{
		this.faceValue = faceValue;
	}
	
	public void rollDie()
	{
		Random random = new Random();
		//Logic to generate random numbers between 1 and 6 only.
		int value = random.nextInt(maxNum + 1 - minNum)+ minNum;
		setFaceValue(value);
	}
}
