package com.nationwide.blackjack3.feight;

/**
 * @author Suzanne Feight
 */

public class Player {

	private String playerName;
	private final BlackjackHand hand;
	private int currentBet = 0;
	private int chips = 0;
	private final int wins = 0;

	public Player(String name) {
		
		playerName = name;
		hand = new BlackjackHand();
		chips = 200;
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
	
	public void winChips(int winChips) {
		
		chips = chips + winChips;
	}
	
	public void betChips(int betChips) {
		
		chips = chips - betChips;
		currentBet = currentBet + betChips;
	}
	
	public int getChips() {
		
		return chips;
	}
	
	public void resetCurrentBet() {
		
		currentBet = 0;
	}
	
	public int getCurrentBet() {
		
		return currentBet;
	}

}

