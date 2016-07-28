package com.nationwide;

//    this doesn't work
public class PlayBlackJack {

	public static void main(String[] args) {
		Deck letsPlay = new Deck();
		letsPlay.newDeck();
		letsPlay.dealBlackJackCards();
		letsPlay.hitOrStay();
		letsPlay.soWhoWinsBlackJack();

	}
}
