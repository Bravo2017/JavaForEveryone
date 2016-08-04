package com.nationwide.blackjack3.williams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class BlackJackDeck{
	private ArrayList<BlackJackCard> cards;
	
	public BlackJackDeck(){
		cards = new ArrayList<BlackJackCard>();
		String[] suits = {"hearts","clubs","spades","diamonds"};
		Map<String, Integer> blackJackValues = new TreeMap<String, Integer>();
		blackJackValues.put("Ace", 11);
		blackJackValues.put("Two", 2);
		blackJackValues.put("Three", 3);
		blackJackValues.put("Four", 4);
		blackJackValues.put("Five", 5);
		blackJackValues.put("Six", 6);
		blackJackValues.put("Seven", 7);
		blackJackValues.put("Eight", 8);
		blackJackValues.put("Nine", 9);
		blackJackValues.put("Ten", 10);
		blackJackValues.put("Jack", 10);
		blackJackValues.put("Queen", 10);
		blackJackValues.put("King", 10);
		int suit;
		for (suit = 0;suit < suits.length;suit++){
			Set<String> keySet = blackJackValues.keySet();
			for (String key : keySet){
				BlackJackCard card = new BlackJackCard();
				card.setSuit(suits[suit]);
				card.setFaceValue(key);
				card.setNumericValue(blackJackValues.get(key));
				addCard(card);
			}
		}
	}
	public void addCard(BlackJackCard c){
		cards.add(c);
	}
	public BlackJackCard getCard(int index){
		return cards.get(index);
	}
	public void shuffleDeck(){
		Collections.shuffle(cards);
	}
	public void removeCard(BlackJackCard c){
		cards.remove(c);
	}
	public BlackJackCard getNextCard(){
		return cards.get(1);
	}
}
