package com.nationwide.walker.blackjack;
import java.util.ArrayList;
import java.util.Collections;

/*
 * Requirements:
 * 2 players (One dealer)
 * Create two card hand for each player
 * 52 card deck
 * Evaluate winner
 */

public class Deck {
	
	ArrayList<Card> cards = new ArrayList<Card>();
	ArrayList<Card> cardsOriginalState = new ArrayList<Card>();
	String[] value = {"Ace", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	
	public Deck(){
		
		for (String cardValue : value){
			cards.add(new Card(cardValue, "Hearts"));
			cards.add(new Card(cardValue, "Spades"));
			cards.add(new Card(cardValue, "Diamonds"));
			cards.add(new Card(cardValue, "Clubs"));
		}
		
		Collections.shuffle(cards);
		cardsOriginalState.equals(cards);
	}
		
	
	Card getTopCard(){
		Card topCard = new Card();
		topCard.setValue(cards.get(0).getValue());
		topCard.setSuit(cards.get(0).getSuit());
		cards.remove(0);
		cards.trimToSize();
		return topCard;
	}
	
	void shuffleDeck(){
		cards.equals(cardsOriginalState);
		Collections.shuffle(cards);
	}
	
	/*void printDeck(){
		for (Card printCard : cards){
			System.out.println(printCard.getValue() + " " + printCard.getSuit());
		}
	}*/
	
	
	
	/*	ArrayList<Card> getCardList (){
	return cards;
}
*/
}