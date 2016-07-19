package com.nationwide.blackjack.walker;
import java.util.ArrayList;

public class Player {
	
	ArrayList<Card> playerHand = new ArrayList<Card>();
	Deck deck = new Deck();
	int handValue;
	double bet;
	double chipValue = 200;
	int playerNumber;
	
	public Player(){
		
	}
	
	public Player (int playerNumber){
		this.playerNumber = playerNumber;
	}
	
	public void handValue(){
			handValue = 0;
		for (Card card : playerHand){
			handValue = handValue + card.getNumValue();
		}
		if ((handValue > 21) && this.checkForAce()){
					handValue = handValue - 10;
		} 
		if (handValue > 21){
			handValue = -1;
		}
	}
	
	public int getHandValue(){
		return handValue;
	}
	
	public boolean checkForAce(){
		boolean hasAce = false;
		for (Card card : playerHand){
			if (card.getValue() == "String"){
				hasAce = true;
			}
		}
		return hasAce;
	}
	
	public void printHand(){
		
		System.out.print("Player " + getPlayerNumber() + ":     ");
		
		for (Card card : playerHand){
			
			String format = (card.getValue() + " of " + card.getSuit());
			
			if (format.length() < 15){
				while (format.length() <= 15){
					format = format + " ";
				}
			}
			
			System.out.print(format + "     ");
		}
		
		System.out.println("Hand Value: " + getHandValue());
	}
	
	public void addCard(Card topCard){
		playerHand.add(topCard);
		handValue();
	}
	
	public void addWinnings(double winnings){
		chipValue = chipValue + winnings;
	}

	public double getChipValue() {
		return chipValue;
	}

	public void setChipValue(double chipValue) {
		this.chipValue = chipValue;
	}

	public double getBet() {
		return bet;
	}

	public void setBet(double bet) {
		this.bet = bet;
	}

	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}
	
	public int getPlayerNumber(){
		return playerNumber;
	}
	
}
