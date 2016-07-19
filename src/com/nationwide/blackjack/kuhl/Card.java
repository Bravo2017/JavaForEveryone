package com.nationwide.blackjack.kuhl;

class Card {
	/*
	 * Creates a playing card.
	 */
	private int rank;
	private int suit;
	private int value;
	private static String[] ranks = { "Joker", "Ace", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen",
			"King" };
	private static String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };

	Card(int suit, int values) {
		this.rank = values;
		this.suit = suit;
	}

	public int getRank() {
		return rank;
	}

}
