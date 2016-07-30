package com.nationwide.blackjack2.defenbaugh;

public class PlayBlackjack {

	/**
	 * Phase 1 Requirements: 2 players (one dealer) Create a hand for each
	 * player A hand is two cards 52 card deck Evaluate winner
	 * 
	 * Phase 2 Requirements: Add suit Add options to hit and stay The dealer
	 * must draw on 16 and stay on 17 Add the Ace value determination
	 */
	public static void main(String[] args) {

		int numDecks = 1;

		// Create deck
		Deck deck = new Deck();

		deck.PrintHand(24);

		/* Shuffle the deck of cards */
		// deck.shuffle();
		// int currentPosition = 0;

		// System.out.println(deck.GetTotalDecks());

		// int i = 0;
		// int totalCards = deck.GetTotalCards();
		// while (i < totalCards) {
		// Card C = deck.DrawFromDeck(i);
		// System.out.println(C.toString());
		// //deck.RemoveFromDeck(i);
		// i++;
		// }

		// Card shuffledDeck = deck.shuffle();

		// while (deck.getTotalCards() != 0) {
		// Card C = deck.drawFromDeck();
		// System.out.println(C.toString());
		// }
	}

}
