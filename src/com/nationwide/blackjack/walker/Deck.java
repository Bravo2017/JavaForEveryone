package com.nationwide.blackjack.walker;
import java.util.ArrayList;
import java.util.Collections;


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
		topCard.setNumValue(cards.get(0).getNumValue());
		
		cards.remove(0);
		cards.trimToSize();
		
		return topCard;
	}
	
	Card getTopCard(boolean isFaceDown){

		Card topCard = new Card();
		topCard.setValue(cards.get(0).getValue());
		topCard.setSuit(cards.get(0).getSuit());
		topCard.setNumValue(cards.get(0).getNumValue());
		topCard.setFaceDown(isFaceDown);
		
		cards.remove(0);
		cards.trimToSize();
		
		return topCard;
		
	}
	
	/* Fix original date assignment
	  void shuffleDeck(){
	 
		cards.equals(cardsOriginalState);
		Collections.shuffle(cards);
	}
	*/
	

}