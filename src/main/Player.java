package main;
/**
 * @author Jens & Morten C
 * Edited by Aleksander
 * Player class is created to keep track of the player's name, and to create an instance of the Account class.
 */
public class Player {
	
	//Creation of attributes

	private String nameOfPlayer;
	private Account myAcc;
	
	/**
	 * Creates the constructor
	 * @param name Reserves space for the player's name.
	 * @param Account creates the instance of an Account within the player object.
	 */
	public Player (String name)
	{
		nameOfPlayer = name;
		myAcc = new Account();
	}
	
	/**
	 * Sets the player's name
	 * @param name Sets the players name
	 * @return
	 */
	public void setPlayerName(String name)
	{
		nameOfPlayer = name;
	}
	
	/**
	 * Returns the player's name.
	 * @return
	 */
	public String getPlayerName()
	{
		return nameOfPlayer;
	}
	
	/**
	 * Returns the instance of the Account type within the player object.
	 * @return myAcc
	 */
	public Account getAccount()
	{
		return myAcc;
	}
	
	/**
	 * Converts the Balance from an integer to a string.
	 */
	public String toString()
	{
		return nameOfPlayer;
	}
		
	/**
	* Calculates the player's balance. This is done by having the (int currentShakerValue) added to the score. 
	* @param currentShakerValue Adds the current shaker points to the total score.
	* @return
	*/

}