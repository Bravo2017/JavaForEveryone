package com.nationwide.blackjack.vipond;

import java.util.ArrayList;

public class PlayBlackjack {

	public static void main(String[] args) {

		System.out.println("Welcome!!!   Let's play some blackjack!");

		/* Create a deck of cards */
		Deck deck1 = new Deck();
		ArrayList<String> currentDeck = new ArrayList<String>();
		currentDeck = deck1.createDeck();

		/* Shuffle the deck of cards */
		deck1.shuffle(currentDeck);
		int currentPosition = 0;

		/* Deal 2 cards to the player and the dealer */
		ArrayList<String> dealerHand = new ArrayList<String>();
		ArrayList<String> userHand = new ArrayList<String>();

		for (int i = 1; i <= 2; i++) {
			String nextCard = deck1.dealCard(currentDeck);
			userHand.add(nextCard);
		}

		for (int i = 1; i <= 2; i++) {
			String nextCard = deck1.dealCard(currentDeck);
			dealerHand.add(nextCard);
		}

		/* Determine the hand value */
		System.out.println();
		int TotalValue = 0;
		System.out.println("Your Hand:");
		for (int i = 0; i <= userHand.size() - 1; i++) {
			String x = userHand.get(i);
			int cardTotal = deck1.evaluateCardValue(x);
			TotalValue = TotalValue + cardTotal;
			System.out.println(x);
		}
		System.out.println("Total value = " + TotalValue);
		System.out.println();
		int TotalValuedealer = 0;
		System.out.println("Dealer Hand:");
		for (int i = 0; i <= dealerHand.size() - 1; i++) {
			String x = dealerHand.get(i);
			int cardTotal = deck1.evaluateCardValue(x);
			TotalValuedealer = TotalValuedealer + cardTotal;
			System.out.println(x);
		}
		System.out.println("Total value = " + TotalValuedealer);
		System.out.println();

		/* Determine who wins */

		if (TotalValuedealer > TotalValue) {
			System.out.println("DEALER WINS!");
		} else {
			if (TotalValuedealer == TotalValue) {
				System.out.println("IT IS A PUSH....NO ONE WINS (OR LOSES)!");
			} else {
				System.out.println("YOU WIN!");
			}

		}

	}
}
