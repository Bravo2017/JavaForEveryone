package com.nationwide.blackjack.williams;

import java.util.ArrayList;
import java.util.Collections;

public class BlackJackDeck {
	private ArrayList<BlackJackCard> cards;

	public BlackJackDeck() {
		cards = new ArrayList<BlackJackCard>();
	}

	public void addCard(BlackJackCard c) {
		cards.add(c);
	}

	public BlackJackCard getCard(int index) {
		return cards.get(index);
	}

	public void shuffleDeck() {
		Collections.shuffle(cards);
	}

	public void removeCard(BlackJackCard c) {
		cards.remove(c);
	}
}
