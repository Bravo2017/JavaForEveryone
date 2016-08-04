package com.nationwide.blackjack3.williams;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> cards;
	
	public Deck(){
		cards = new ArrayList<Card>();
	}
	public void addCard(Card c){
		cards.add(c);
	}
	public Card getCard(int index){
		return cards.get(index);
	}
	public void shuffleDeck(){
		Collections.shuffle(cards);
	}
	public void removeCard(Card c){
		cards.remove(c);
	}
	public Card getNextCard(){
		return cards.get(1);
	}
}
