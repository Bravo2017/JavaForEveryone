package com.nationwide.blackjack2.defenbaugh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

	private ArrayList<Card> deckOfCards;
	private int numberOfCards;

	public Deck() {
		this(1, false);
	}

	public Deck(int numberOfDecks, boolean shuffle) {

		this.numberOfCards = numberOfDecks * 52;
		this.deckOfCards = new ArrayList<Card>();

		for (int d = 0; d < numberOfDecks; d++) {
			for (Suit cardSuit : Suit.values()) {
				for (int cardRank = 1; cardRank <= 13; cardRank++) {
					deckOfCards.add(new Card(cardSuit, cardRank));
				}
			}
		}

		if (shuffle) {
			this.Shuffle();

		}
	}

	// public Deck(boolean shuffle){

	// if (shuffle) {
	// Collections.shuffle(deckOfCards);
	// }

	// }

	public int GetTotalCards() {
		return deckOfCards.size();
	}

	public void Shuffle() {
		Collections.shuffle(deckOfCards);
	}

	public Card DrawFromDeck() {
		Random generator = new Random();
		int index = generator.nextInt(deckOfCards.size());
		return deckOfCards.remove(index);
	}

	public Card DrawFromDeck(int i) {
		// return deckOfCards.get(i);
		return deckOfCards.get(i);
	}

	public void RemoveFromDeck(int i) {
		deckOfCards.remove(i);
	}

	public Card DealCard() {
		Card nextCard = deckOfCards.get(0);
		RemoveFromDeck(0);
		return nextCard;
		// numberOfCards--;
	}

	public void PrintHand(int numToPrint) {

		for (int c = 0; c < numToPrint; c++) {
			System.out.println(numberOfCards + " "
					+ deckOfCards.get(c).toString());
		}
		System.out.print(numberOfCards - numberOfCards);
	}

}
