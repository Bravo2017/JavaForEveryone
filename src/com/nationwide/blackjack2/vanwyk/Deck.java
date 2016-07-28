package com.nationwide.blackjack2.vanwyk;

import java.util.Random;

public class Deck {
	// Array of cards in the deck
	private Card[] myCards;
	// private ArrayList<Card> myCards;(not sure if I should use array list.
	// could be easier to modify later)

	// Number of cards currently in the deck
	private int numCards;

	// constructor call the other constructor, defining one deck without
	// shuffling
	public Deck() {
		this(1, false);
	}

	public Deck(int numDecks, boolean shuffle) {
		/*
		 * constructor that defines the number of decks and if it should be
		 * shuffled Parameters numDeck = now many decks Parameters shuffle is if
		 * deck should be shuffled
		 */
		this.numCards = numDecks * 52;
		this.myCards = new Card[this.numCards];

		// card index
		int c = 0;

		// for each deck
		for (int d = 0; d < numDecks; d++) {

			// for each suit
			for (int s = 0; s < 4; s++) {

				// for each number
				for (int n = 1; n <= 13; n++) {

					// add new card to deck
					this.myCards[c] = new Card(Suit.values()[s], n);
					c++;

				}
			}
		}

		// shuffle is selected
		if (shuffle) {
			this.shuffle();
		}
	}

	// shuffle deck by randomly swapping pairs of cards
	public void shuffle() {

		// initialize random number generator
		Random rando = new Random();

		Card temp;
		int j;
		for (int i = 0; i < this.numCards; i++) {
			// get a random card j to swap with
			j = rando.nextInt(this.numCards);

			// do swap
			temp = this.myCards[i];
			this.myCards[i] = this.myCards[j];
			this.myCards[j] = temp;

		}
	}

	public Card dealNextCard() {

		// get the top card
		Card top = this.myCards[0];

		// shift all cards to left by one index
		for (int c = 1; c < this.numCards; c++) {
			this.myCards[c - 1] = this.myCards[c];
		}
		this.myCards[this.numCards - 1] = null;

		// lower number of cards
		this.numCards--;

		return top;

	}

}
