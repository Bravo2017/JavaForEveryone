package com.nationwide.blackjack.feight;

import java.util.ArrayList;

/**
 * @author Suzanne Feight
 */

public class Deck {
	
	private final ArrayList<Card> deck;
	
	public Deck() {
		
		deck = new ArrayList<Card>();
		for (CardSuit suit : CardSuit.values()) {
			for (CardFace cardFace : CardFace.values()) {
				deck.add(new Card(suit, cardFace));
			}
		}
	}
	
	public void shuffleDeck(ArrayList<Card> gameDeck) {
		
		for ( int i = deck.size() -1; i > 0; i-- ) {
            int rand = (int)(Math.random()*(i+1));
            Card temp = deck.get(i);
            deck.set(i, deck.get(rand));
            deck.set(rand, temp);
        }
		
	}
	
	public ArrayList<Card> getNewDeck() {
		return deck;
	}


}
