package com.nationwide.blackjack.williams;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class BlackJackHandTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] suits = { "hearts", "clubs", "spades", "diamonds" };
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
		for (suit = 0; suit < suits.length; suit++) {
			Set<String> keySet = blackJackValues.keySet();
			for (String key : keySet) {
				BlackJackCard card = new BlackJackCard();
				card.setSuit(suits[suit]);
				card.setFaceValue(key);
				card.setNumericValue(blackJackValues.get(key));
				deck.addCard(card);
			}
		}
		deck.shuffleDeck();
		BlackJackHand playersHand = new BlackJackHand();
		BlackJackHand dealersHand = new BlackJackHand();
		for (x = 0; x < 4; x++) {
			BlackJackCard dealtCard = deck.getCard(x);
			if ((x % 2) == 0) {
				playersHand.addCard(dealtCard);
			} else {
				dealersHand.addCard(dealtCard);
			}
			deck.removeCard(dealtCard);
		}
		for (x = 0; x < playersHand.getLength(); x++) {
			BlackJackCard displayCard = playersHand.getCard(x);
			System.out.println("Your hand contains a card that is a(n) "
					+ displayCard.getFaceValue() + " of "
					+ displayCard.getSuit() + " and has a numeric value of "
					+ displayCard.getNumericValue());
		}
		for (x = 0; x < dealersHand.getLength(); x++) {
			BlackJackCard displayCard = dealersHand.getCard(x);
			System.out
					.println("The dealer's hand contains a card that is a(n) "
							+ displayCard.getFaceValue() + " of "
							+ displayCard.getSuit()
							+ " and has a numeric value of "
							+ displayCard.getNumericValue());
		}

		if (playersHand.gethandValue() > 21) {
			System.out.println("You busted!");
		} else if (dealersHand.gethandValue() > 21) {
			System.out.println("Dealer busted!");
		} else if (dealersHand.gethandValue() > playersHand.gethandValue()) {
			System.out.println("Dealer Won!");
		} else if (playersHand.gethandValue() > dealersHand.gethandValue()) {
			System.out.println("You Won!");
		} else {
			System.out.println("Push!");
		}
	}

}
