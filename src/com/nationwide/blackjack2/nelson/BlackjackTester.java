package com.nationwide.blackjack2.nelson;

import java.util.Scanner;

public class BlackjackTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Deck myDeck = new Deck(1, false); // 1 deck with no shuffle
		// myDeck.printDeck(52); // print first deck pre shuffle
		Deck myDeck = new Deck(1, true); // 1 deck with shuffle
		// myDeck.printDeck(52); // print first deck post shuffle

		Player player1 = new Player("Player1");
		Player dealer = new Player("Dealer");

		// deal two cards to each player
		player1.addCard(myDeck.dealNextCard()); // deal first card to player1
		dealer.addCard(myDeck.dealNextCard()); // deal first card to dealer
		player1.addCard(myDeck.dealNextCard()); // deal second card to player1
		dealer.addCard(myDeck.dealNextCard()); // deal second card to dealer

		// print initial hands for each player
		System.out.println("Cards are dealt\n");
		player1.printHand(true); // show first card for player1
		dealer.printHand(false); // don't show first card for dealer
		System.out.println("  ");

		// set flags needed
		boolean player1Done = false; // flag for when player1 is finished
										// hitting
		boolean dealerDone = false; // flag for when dealer is finished hitting
		String answer;

		System.out.println("Player1's turn  ");
		// player's turn
		while (!player1Done) {
			System.out.println("Hit or Stay?  (Enter H or S): ");
			answer = sc.next();
			System.out.println();

			// if the player1 hits
			if (answer.compareToIgnoreCase("H") == 0) {
				// add next card in deck and store whether player1 is busted
				player1Done = !player1.addCard(myDeck.dealNextCard());
				player1.printHand(true); // print player1's hand
			} else {
				player1Done = true; // player1 entered S for stay so done
			}
		}

		System.out.println("Dealer's turn  ");
		// dealer's turn
		while (!dealerDone) {
			if (dealer.getHandSum() < 17) // dealer will draw card if sum 16 or
											// less
			{
				System.out.println("The Dealer hits\n");
				dealerDone = !dealer.addCard(myDeck.dealNextCard());
				dealer.printHand(true); // print dealer's hand
			} else {
				System.out.println("The Dealer stays\n");
				dealerDone = true;
			}
		}
		System.out.println(" ");

		// close scanner
		sc.close();

		// print final hand
		System.out.println("Final hands");
		player1.printHand(true);
		dealer.printHand(true);

		// get final sums of hands
		int player1Sum = player1.getHandSum();
		int dealerSum = dealer.getHandSum();

		// see who the winner is
		if (player1Sum > dealerSum && player1Sum <= 21 || dealerSum > 21) {
			System.out.println("Player1 wins with " + player1Sum
					+ " to Dealer's " + dealerSum);
		} else {
			System.out.println("Dealer wins with " + dealerSum
					+ " to Player1's " + player1Sum);
		}
	}
}
