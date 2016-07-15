package com.nationwide.blackjack.feight;


/**
 * @author Suzanne Feight
 */

public class Player {

	private String playerName;
	private final BlackjackHand hand;
	private final int wins = 0;

	public Player(String name) {
		
		playerName = name;
		hand = new BlackjackHand();
	}
	
	public String getPlayerName() {
		
		return playerName;
	}
	
	public void setPlayerName(String name) {
		
		playerName = name;
	}
	
	public BlackjackHand getHand() {
		
		return hand;
	}

}
