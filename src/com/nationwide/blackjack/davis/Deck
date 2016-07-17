package com.nationwide;

import java.util.ArrayList;
import java.util.Random;

public class Deck implements Cards {

	public static int playerOneTotal = 0;
	public static int dealerTotal = 0;
	public static int dealCard = 0;
	public static int rn = 0;
	public static int cardDrawn = 0;

	static ArrayList deckCards = new ArrayList();

	public static void dealBlackJackCards() {
		dealCard();
		System.out.println("Player 1 Card 1 = " + dealCard);
		playerOneTotal = playerOneTotal + dealCard;
		dealCard();
		System.out.println("Dealer Card 1 = " + dealCard);
		dealerTotal = dealerTotal + dealCard;
		dealCard();
		System.out.println("Player 1 Card 2 = " + dealCard);
		playerOneTotal = playerOneTotal + dealCard;
		dealCard();
		System.out.println("Dealer Card 2 = " + dealCard);
		dealerTotal = dealerTotal + dealCard;
	}

	private static void dealCard() {
		Random rn = new Random();
		cardDrawn = rn.nextInt(deckCards.size() - 1);
		dealCard = (int) deckCards.get(cardDrawn);
		deckCards.remove(cardDrawn);

	}

	public static void soWhoWinsBlackJack() {
		System.out.println(" ");
		System.out.println("Player 1 total = " + playerOneTotal);
		System.out.println("Dealer   total = " + dealerTotal);

		System.out.println(" ");
		if (dealerTotal >= playerOneTotal) {
			System.out.print("Dealer Wins");
		} else {
			System.out.print(" ******* Player Wins");
		}

	}

	public static void newDeck() {
		for (int x = 1; x <= 4; x++) {
			deckCards.add(ace);
			deckCards.add(king);
			deckCards.add(queen);
			deckCards.add(jack);
			deckCards.add(ten);
			deckCards.add(nine);
			deckCards.add(eight);
			deckCards.add(seven);
			deckCards.add(six);
			deckCards.add(five);
			deckCards.add(four);
			deckCards.add(three);
			deckCards.add(two);
		}

	}

}
