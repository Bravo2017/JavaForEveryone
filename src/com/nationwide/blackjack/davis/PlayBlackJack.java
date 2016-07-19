package com.nationwide;

public class PlayBlackJack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Deck letsPlay = new Deck();
		letsPlay.newDeck();
		letsPlay.dealBlackJackCards();
		letsPlay.soWhoWinsBlackJack();

	}

}
