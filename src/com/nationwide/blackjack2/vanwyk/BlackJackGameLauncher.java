package com.nationwide.blackjack2.vanwyk;

import java.util.Scanner;

public class BlackJackGameLauncher {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Deck theDeck = new Deck(1, true);

		Player user = new Player("Player");
		Player dealer = new Player("Dealer");

		user.addCard(theDeck.dealNextCard());
		dealer.addCard(theDeck.dealNextCard());
		user.addCard(theDeck.dealNextCard());
		dealer.addCard(theDeck.dealNextCard());

		// print hands out
		System.out.println("Cards are dealt\n");
		user.printHand();
		System.out.println("\n");
		dealer.printHand();
		System.out.println("\n");

		// flags for when each player is finished hitting

		boolean userDone = false;
		boolean dealerDone = false;
		String userInput;

		while (!userDone || !dealerDone) {

			// player turn
			if (!userDone) {
				System.out.println("hit or Stay (Enter H or S): ");
				userInput = in.next();
				System.out.println();

				// if the player hits
				if (userInput.compareToIgnoreCase("H") == 0) { // ***Fix add
																// error
																// exception

					// add next card in deck and store if player busted
					userDone = !user.addCard(theDeck.dealNextCard());
					user.printHand();
				} else {
					userDone = true;
				}
			}

			// dealers turn
			if (!dealerDone) {
				// rule that dealer will only hit if he is less than 17
				if (dealer.gethandTotal() < 17) {
					System.out.println("\nThe Dealer hits\n");
					dealerDone = !dealer.addCard(theDeck.dealNextCard());
					dealer.printHand();
				} else {
					System.out.println("\nThe Dealer stays\n");
					dealerDone = true;
				}
			}
			System.out.println();
		}

		// close scanner
		in.close();

		// print final hands

		System.out.println("The Final Hands Are...\n");
		user.printHand();
		System.out.println("\n");
		dealer.printHand();

		int userTotal = user.gethandTotal();
		int dealerTotal = dealer.gethandTotal();

		// if(userTotal == dealerTotal){
		// System.out.println("Push no one wins"); ***FIX
		// }

		if (userTotal > dealerTotal && userTotal <= 21 || dealerTotal > 21) {
			System.out.println("\n---->Player wins :)");
		} else {
			System.out.println("\n---->Dealer wins :(");
		}
	}
}