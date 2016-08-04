package com.nationwide.blackjack3.feight;

import java.util.ArrayList;

/**
 * @author Suzanne Feight
 */

public class BlackjackHand {
	
	private ArrayList<Card> blackjackHand;
	private boolean isBlackjack = false;
	private boolean isBust = false;
	
	public BlackjackHand() {
		
		blackjackHand = new ArrayList<Card>();
	}
	
	public void addCard(Card card) {
		
		blackjackHand.add(card);
		
	}
	
	public void removeCard(int index) {
		
		blackjackHand.remove(index);
		
	}
	
	public int getTotal() {

		int total = 0;
		boolean hasAce = false;

		for (Card card : blackjackHand) {
			if (card.getFace().equals(CardFace.ACE)) {
				hasAce = true;
			} else {
				total = total + card.getCardValue();
			}
		}

		if (hasAce) {
			total =  determineTotalWithAce(total, blackjackHand);
		}
		
		if (total > 21) {
			this.isBust = true;
		} else {
			this.isBust = false;
		}
		
		if (total == 21) {
			this.isBlackjack = true;
		} else {
			this.isBlackjack = false;
		}
		
		return total;
	}
	
	private int determineTotalWithAce(int total, ArrayList<Card> blackjackHand) {

		for (Card card : blackjackHand) {
			if (card.getFace().equals(CardFace.ACE)) {
				if (total > 10) {
					total = total + 1;
					card.setCardDescription("... played as 1");
				} else {
					total = total + 11;
					card.setCardDescription("... played as 11");
				}
			}
		}

		return total;
	}
	
	public boolean getIsBust() {
		return this.isBust;
	}
	
	public boolean getIsBlackjack() {
		return this.isBlackjack;
	}
	
	public int getCardCount() {
		
		return blackjackHand.size();
		
	}
	
	public void showHand() {
		
		for (Card card : blackjackHand) {
			System.out.println(card.toString());
		}
	}
	
	public void showTopCards() {

		for (Card card : blackjackHand) {
			if (blackjackHand.indexOf(card) == 0) {
				System.out.println("Card is face down");
			} else {
				System.out.println(card.toString());
			}
		}
	}
	
	public void reset() {
		blackjackHand = new ArrayList<Card>();
		isBlackjack = false;
		isBust = false;
	}
	
}

