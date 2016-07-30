package com.nationwide.blackjack.williams;

import java.util.ArrayList;

public class BlackJackHand {
	private ArrayList<BlackJackCard> hand;
	private int handValue;

	public BlackJackHand() {
		hand = new ArrayList<BlackJackCard>();
	}

	public void addCard(BlackJackCard c) {
		hand.add(c);
		handValue = handValue + c.getNumericValue();
	}

	public BlackJackCard getCard(int index) {
		return hand.get(index);
	}

	public int getLength() {
		return hand.size();
	}

	public int gethandValue() {
		return handValue;
	}
}