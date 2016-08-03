package com.nationwide.blackjackFinal2;

import java.util.Random;

/**
 * Deck of cards-- 1 Pack = 52 cards;
 * 
 * @author Diana Raush
 * 
 */
public class Deck {

	private Cards[] cardsInDeck;
	private int numOfCardsInDeck;

	/**
	 * 
	 * Deck constructor
	 */

	public Deck() {

		this.numOfCardsInDeck = 52;
		this.cardsInDeck = new Cards[this.numOfCardsInDeck];

		int c = 0;

		// for each deck
		for (int d = 0; d < 1; d++) {

			// for each suit
			for (int s = 0; s < 4; s++) {

				// for each number
				for (int n = 1; n <= 13; n++) {

					this.cardsInDeck[c] = new Cards(Suits.values()[s], n);
					c++;
				}
			}
		}

		// shuffle
		this.shuffleDeck();
		
	}

	// custom shuffle function--if <list> was used, it has a shuffle method
	// build in
	public void shuffleDeck() {

		Random rng = new Random();

		Cards temp;

		// swapping

		int j;
		for (int i = 0; i < this.numOfCardsInDeck; i++) {

			j = rng.nextInt(this.numOfCardsInDeck);

			temp = this.cardsInDeck[i];
			this.cardsInDeck[i] = this.cardsInDeck[j];
			this.cardsInDeck[j] = temp;
		}
	}

	// dealing a card from deck
	public Cards dealingNextCard() {

		Cards topCard = this.cardsInDeck[0];

		// remove this card

		for (int c = 1; c < this.numOfCardsInDeck; c++) {

			this.cardsInDeck[c - 1] = this.cardsInDeck[c];
		}

		this.cardsInDeck[this.numOfCardsInDeck - 1] = null;
		this.numOfCardsInDeck--;

		return topCard;
	}

	public void printDeckCards(int num) {

		for (int c = 0; c < num; c++) {

			System.out.printf("% 3d/%d %s\n", c + 1, this.numOfCardsInDeck,
					this.cardsInDeck[c].toString());
		}

		System.out.printf("\t\t[%d other]\n", this.numOfCardsInDeck - num);
	}
}