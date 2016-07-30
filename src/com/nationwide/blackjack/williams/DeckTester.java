package com.nationwide.blackjack.williams;

public class DeckTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] suits = { "hearts", "clubs", "spades", "diamonds" };
		String[] faceValues = { "Ace", "Two", "Three", "Four", "Five", "Six",
				"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
		int suit;
		int x;
		Deck deck = new Deck();
		for (suit = 0; suit < suits.length; suit++) {
			int i;
			for (i = 0; i < faceValues.length; i++) {
				Card card = new Card();
				card.setSuit(suits[suit]);
				card.setFaceValue(faceValues[i]);
				deck.addCard(card);
			}
		}
		for (x = 0; x < 52; x++) {
			Card displayCard = deck.getCard(x);
			System.out.println("Your deck contains a card that is a(n) "
					+ displayCard.getFaceValue() + " of "
					+ displayCard.getSuit());
		}
	}
}
