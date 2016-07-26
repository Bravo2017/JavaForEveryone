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
			return determineTotalWithAce(total, blackjackHand);
		} else {
			return total;
		}
	}
	
	private int determineTotalWithAce(int total, ArrayList<Card> blackjackHand) {
		
		for (Card card : blackjackHand) {
			if (card.getFace().equals(CardFace.ACE) && total > 10) {
				total = total + 1;
			} else {
				total = total + 11;
			}
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
	
	public void showTopCards() {

		for (Card card : blackjackHand) {
			if (blackjackHand.indexOf(card) == 0) {
				System.out.println("Card is face down");
			} else {
				System.out.println(card.toString());
			}
		}
	}
	
}
