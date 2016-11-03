package main;
/**
 * The Text class holds and controls all text that may be printed to the user.
 * The primary reasoning for reserving all text to a specific class is to ease any process of translation.
 * @author Emil and Aleksander
 */
public class Text {


	// Creates an array of CustomFields with their separate descriptions and value.
	
	public CustomField[] fieldArray =
		{
			new CustomField(" ", 0, " "),
			new CustomField(" ", 0, "icons/BridgeIcon.png"),
			new CustomField("Tower", 250,"icons/TowerIcon.jpg"),
			new CustomField("Crater", -100,"icons/CraterIcon.jpg"),
			new CustomField("Palace Gates", +100,"icons/PalaceGatesIcon.jpg"),
			new CustomField("Cold Desert", -20,"icons/ColdDesertIcon.jpg"),
			new CustomField("Walled City", +180,"icons/WalledCityIcon.jpg"),
			new CustomField("Monastery", 0,"icons/MonasteryIcon.jpg"),
			new CustomField("Black cave", -70,"icons/BlackCaveIcon.jpg"),
			new CustomField("Huts in the mountain", +60,"icons/MountainHutIcon.jpg"),
			new CustomField("The Werewall", -80,"icons/WareWallIcon.jpg"),
			new CustomField("The Pit", -50,"icons/PitIcon.jpg"),
			new CustomField("Goldmine", +650,"icons/GoldmineIcon.jpg"),
		};
	
	/**
	 * @param getFieldDescription Returns the fieldDescription of a single field in response to the array reference
	 * @param point the reference to the fields reference in the constructed array
	 */
	public String getFieldDescription(int point)
	{ 
		
		return fieldArray[point].getFieldText();
		
	}
	
	/**
	 * @param getFieldValue Returns the fieldVaule of a single field in response to the array reference
	 * @param point the reference to the fields reference in the constructed array
	 */
	public int getFieldValue(int point)
	{
		return fieldArray[point].getValueInt();
	}
	
	public String getPicture(int point)
	{
		return fieldArray[point].getPicture();
	}

	/**
	 * @param printStartDescription prints the introduction text described in the method
	 */
	public String getStartDescription()
	{
		
		return ("Hello Players! Today we will be playing a game of dices\nThe object of the game is to get 3000 money!!\nYou will each start with 1000 money\nGood luck to both of you!\nPlayer one please start your turn\n");
		
	}

	/**
	 * @param printEndDescription prints the conclusion text described in the method
	 */
	public String getEndDescription()
	{
		return "You won the game";
		
	}

	/**
	 * @param turnDescription prints the dynamic text to the player informing of the actions being done on the specific turn
	 * @param player the Player object of whom the turn description shall be printed
	 * @param shake the Shake object signifying the dice roll of the turn
	 */
	public void turnDescription(Player player, Shaker shake)
	{
		if(shake.getShake()!=10)
			{
			System.out.println(player.getPlayerName() + " rolled " + shake + "\nYou landed on " + getFieldDescription(shake.getShake()) + "\nYour balance is changed by " + getFieldValue(shake.getShake()) + " to:" + player.getAccount().toString());
			}
		else
			{
			System.out.println(player.getPlayerName() + " rolled " + shake + "\nYou landed on " + getFieldDescription(shake.getShake()) + "\nYou get an extra turn but your balance is changed by " + getFieldValue(shake.getShake()) + " to:" + player.getAccount().toString());
			}
	}
	
	public String getTurnDescription(Player player, Shaker shake)
	{
		if(shake.getShake()!=10)
			{
			return player.getPlayerName() + " rolled " + shake + "\nYou landed on " + getFieldDescription(shake.getShake()) + "\nYour balance is changed by " + getFieldValue(shake.getShake()) + " to:\n" + player.getAccount().toString();
			}
		else
			{
			return player.getPlayerName() + " rolled " + shake + "\nYou landed on " + getFieldDescription(shake.getShake()) + "\nYou get an extra turn but your balance is changed by " + getFieldValue(shake.getShake()) + " to:\n" + player.getAccount().toString();
			}
	}

	public String getWelcome()
	{
		return "Welcome!";
	}

	public String getStartGame()
	{
		return "Start Game";
	}
	
	public String getStartField()
	{
		return "START";
	}
	
	public String getBlankSpace()
	{
		return " ";
	}
	
	public String getPlayerTurn()
	{
		return "'s turn!";
	}
	
	public String getTakeTurn()
	{
		return "Take turn!";
	}
	
	public String getEndTurn()
	{
		return "End Turn";
	}
}
