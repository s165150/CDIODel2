package main;
public class Rule {
	
	//Rule for Werewall (Used for -80 points and eksta turn)
	public boolean ruleWolf(Shaker shaker)
	{
		if (shaker.getShake() == 10)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Rule used for winner
	public boolean winner(Player player)
	{
	if(player.getAccount().getBalance() >= 3000)
	{
	System.out.println(player.getAccount());
	return true;
	}
	return false;
	}
}