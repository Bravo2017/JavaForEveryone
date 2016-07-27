package com.nationwide.blackjack.walker;

public class Dealer extends Player {

	public Dealer() {
		playerNumber = 0;
	}

	public void takeTurn(Deck deck) {

		for (Card card : playerHand) {
			if (card.isFaceDown()) {
				card.setFaceDown(false);
			}
		}

		while ((handValue < 17) && (handValue != -1)) {
			addCard(deck.getTopCard());

		}

		System.out.println("Dealer's turn:");
		System.out.println("------------------------------------");
		printHand();

	}

	public void shuffleDeck(Deck deck) {

		deck = new Deck();

	}

	public void printHand() {

		boolean hasFaceDownCard = false;

		System.out.print("*Dealer*:     ");

		for (Card card : playerHand) {

			String format;

			if (!card.isFaceDown()) {
				format = card.getValue() + " of " + card.getSuit();
			} else {
				hasFaceDownCard = true;
				format = "*Face Down*";
			}
			while (format.length() <= 18) {
				format = format + " ";
			}
			System.out.print(format);
		}

		System.out.println("");

		if (hasFaceDownCard) {
			System.out.println("");
		}

		else {
			if (handValue != -1) {
				System.out.println("Hand Value:   " + handValue);
			} else {
				System.out.println("Hand Value: BUST");
			}

			System.out.println("");
		}

	}

}
