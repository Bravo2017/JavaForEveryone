package com.nationwide.blackjack.samudrala;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by SAMUDRS1 on 7/16/2016.
 */
public class BlackJackTester {
	private static Deck deckInstance = new Deck();
	private static Dealer dealerInstance = new Dealer();
	private static BlackJack gameInstance = new BlackJack();

	public static void main(String[] args) {
		System.out.println("The BlackJack game is about to begin...");
		System.out
				.println("--------------------------------------------------");

		// prepare the Deck
		ArrayList<Card> finalDeck = deckInstance.getTheDeckReady();

		// shuffle the deck
		dealerInstance.shuffleTheCards(finalDeck);

		// distribute the card to each player
		Map<String, Hand> currentHands = dealerInstance
				.distributeTheCards(finalDeck);

		// show players cards
		System.out.println("Players hand: ");
		printHands(currentHands, "playersHand");

		// show dealers cards(although dealer doesnt show all his cards in the
		// first go, this is added for convenience)
		System.out.println("Dealers hand: ");
		printHands(currentHands, "dealersHand");
		// System.out.println("Dealers first card: " +
		// currentHands.get("dealersHand").currentHand.get(0).cardName);

		// Begin the game
		gameInstance.beginTheGame(currentHands, finalDeck);
	}

	public static void printHands(Map<String, Hand> currentHands, String hand) {
		int i = 1;
		for (Card card : currentHands.get(hand).currentHand) {
			System.out.println(i + ": " + card.cardName + "; card value->"
					+ card.cardValue);
			i++;
		}
		System.out.println();
	}
}
