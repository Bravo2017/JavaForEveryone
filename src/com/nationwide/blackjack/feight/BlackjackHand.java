package com.nationwide.blackjack.feight;

import java.util.ArrayList;

/**
 * @author Suzanne Feight
 */

public class BlackjackHand {
	
	private final ArrayList<Card> blackjackHand;
	
	public BlackjackHand() {
		
		blackjackHand = new ArrayList<Card>();
	}
	
	public void addCard(CardSuit suit, CardFace face) {
		
		blackjackHand.add(new Card(suit, face));
		
	}
	
	public void removeCard(int index) {
		
		blackjackHand.remove(index);
		
	}
	
	public int getTotal() {
		
		int total = 0;
		
		for (Card card : blackjackHand) {
			total = total + card.getCardValue();
		}
		
		return total;
	}
	
	public int getCardCount() {
		
		return blackjackHand.size();
		
	}
	
	public void showHand() {
		
		for (Card card : blackjackHand) {
			System.out.println(card.toString());
		}
	}
	
}
