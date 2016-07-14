package com.nationwide.blackjack.feight;

import java.util.ArrayList;

/**
 * 
 * @author Suzanne Feight
 *
 */

public class BlackjackGame {

	public static void main(String[] args) {
		Deck deck = new Deck();
		ArrayList<Card> gameDeck = deck.getNewDeck();
		
		int i = 0;
		for (Card card : gameDeck) {
			i++;
			System.out.println(i + " " + card.getSuitValue() + " " + card.getFace() + "(" + card.getCardValue() + ")" );
		}

	} 

}
