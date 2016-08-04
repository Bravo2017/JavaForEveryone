package com.nationwide.blackjack3.williams;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class BlackJackDeckTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] suits = {"hearts","clubs","spades","diamonds"};
		Map<String, Integer> blackJackValues = new TreeMap<String, Integer>();
		blackJackValues.put("Ace", 1);
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
		int x;
		BlackJackDeck deck = new BlackJackDeck();
		for (suit = 0;suit < suits.length;suit++){
			Set<String> keySet = blackJackValues.keySet();
			for (String key : keySet){
				BlackJackCard card = new BlackJackCard();
				card.setSuit(suits[suit]);
				card.setFaceValue(key);
				card.setNumericValue(blackJackValues.get(key));
				deck.addCard(card);
			}
		}
		for(x = 0;x < 52;x++){
			BlackJackCard displayCard = deck.getCard(x);
			System.out.println("Your deck contains a card that is a(n) " + displayCard.getFaceValue() + " of " + displayCard.getSuit() + " and has a numeric value of " + displayCard.getNumericValue());
		}

	}

}
