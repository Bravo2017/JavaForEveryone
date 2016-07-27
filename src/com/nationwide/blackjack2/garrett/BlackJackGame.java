package com.nationwide.blackjack2.garrett;

import java.util.Scanner;

/**
 * The BlackJackGame is a program that will allow a user to play one round of
 * blackjack.
 */
public class BlackJackGame {

	public static void main(String[] args) {

		// Let the user play one game of Blackjack.

		Scanner in = new Scanner(System.in);
		Deck deck; // A deck of cards. A new deck for each game.
		BlackJackHand dealerHand; // The dealer's hand.
		BlackJackHand userHand; // The user's hand.
		boolean keepPlaying = true;
		boolean busted = false;

		deck = new Deck(); // True will include Jokers.
		dealerHand = new BlackJackHand();
		userHand = new BlackJackHand();

		/* Shuffle the deck, then deal two cards to each player. */

		deck.shuffle();
		dealerHand.addCard(deck.dealCard());
		dealerHand.addCard(deck.dealCard());
		userHand.addCard(deck.dealCard());
		userHand.addCard(deck.dealCard());

		/*
		 * Check if one of the players has Blackjack (two cards totaling to 21).
		 * The player with Blackjack wins the game. Dealer wins ties.
		 */
		while (keepPlaying) {
			if (dealerHand.getBlackJackValue() == 21) {
				System.out.println("Dealer has the " + dealerHand.getCard(0)
						+ " and the " + dealerHand.getCard(1) + ".");
				System.out.println("User has the " + userHand.getCard(0)
						+ " and the " + userHand.getCard(1) + ".");
				System.out.println();
				System.out.println("Dealer has Blackjack.  Dealer wins.");
				keepPlaying = false;
				break;
			}

			if (userHand.getBlackJackValue() == 21) {
				System.out.println("Dealer has the " + dealerHand.getCard(0)
						+ " and the " + dealerHand.getCard(1) + ".");
				System.out.println("User has the " + userHand.getCard(0)
						+ " and the " + userHand.getCard(1) + ".");
				System.out.println();
				System.out.println("You have Blackjack. Congrats! You win!");
				keepPlaying = false;
				break;
			}

			/*
			 * If neither player has Blackjack, play the game. First the user
			 * gets a chance to draw cards (i.e., to "Hit"). The while loop ends
			 * when the user chooses to "Stand". If the user goes over 21, the
			 * user loses immediately.
			 */

			while (true) {
				/* Display user's cards, and let user decide to Hit or Stand. */
				System.out.println();
				System.out.println("Your cards are:");
				for (int i = 0; i < userHand.getCardCount(); i++)
					System.out.println("    " + userHand.getCard(i));
				System.out.println("Your total is "
						+ userHand.getBlackJackValue() + ".");
				System.out.println();
				System.out.println("Dealer is showing the "
						+ dealerHand.getCard(0) + ".");
				System.out.println();
				System.out.println("Would you like to Hit (H) or Stand (S)? ");
				String userAction = in.next(); // User's response, 'H' or 'S'.
				userAction = userAction.toUpperCase();
				char response = userAction.charAt(0);

				/*
				 * If the user Hits, the user gets a card. If the user Stands,
				 * the loop ends (and it's the dealer's turn to draw cards).
				 */

				if (response == 'S') {
					// Loop ends; user is done taking cards.
					break;
				} else { // userAction is 'H'. Give the user a card.
					// If the user goes over 21, the user loses.
					Card newCard = deck.dealCard();
					userHand.addCard(newCard);
					System.out.println();
					System.out.println("User hits.");
					System.out.println("Your card is the " + newCard + ".");
					System.out.println("Your total is now "
							+ userHand.getBlackJackValue() + ".");
					if (userHand.getBlackJackValue() > 21) {
						System.out.println();
						System.out
								.println("You busted by going over 21.  Sorry. You lose.");
						System.out.println("Dealer's other card was the "
								+ dealerHand.getCard(1) + ".");
						keepPlaying = false;
						busted = true;
						break;
					}
				}
			} // end while loop

			/*
			 * If we get to this point, the user has Stood with 21 or less. Now,
			 * it's the dealer's chance to draw. Dealer draws cards until the
			 * dealer's total is > 16. If dealer goes over 21, the dealer loses.
			 */
			if (busted) {
				keepPlaying = false;
				break;
			} else {
				System.out.println();
				System.out.println("User stands.");
				System.out.println("Dealer's cards are");
				System.out.println("    " + dealerHand.getCard(0));
				System.out.println("    " + dealerHand.getCard(1));
				while (dealerHand.getBlackJackValue() <= 16) {
					Card newCard = deck.dealCard();
					System.out.println("Dealer hits and gets the " + newCard);
					dealerHand.addCard(newCard);
					if (dealerHand.getBlackJackValue() > 21) {
						System.out.println();
						System.out
								.println("Dealer busted by going over 21.  Congrats! You win!");
						keepPlaying = false;
						busted = true;
						break;
					}
				}
				System.out.println("Dealer's total is "
						+ dealerHand.getBlackJackValue());

				/*
				 * If we get to this point, both players have 21 or less. We can
				 * determine the winner by comparing the values of their hands.
				 */

				System.out.println();
				if (dealerHand.getBlackJackValue() == userHand
						.getBlackJackValue()) {
					System.out
							.println("Dealer wins on a tie.  Sorry! You lose.");
					keepPlaying = false;
					break;
				} else if (dealerHand.getBlackJackValue() > userHand
						.getBlackJackValue()) {
					System.out.println("Dealer wins, "
							+ dealerHand.getBlackJackValue() + " points to "
							+ userHand.getBlackJackValue() + ".");
					keepPlaying = false;
					break;
				} else {
					System.out.println("Congrats! You win, "
							+ userHand.getBlackJackValue() + " points to "
							+ dealerHand.getBlackJackValue() + "!");
					keepPlaying = false;
					break;
				}
			}
		}
	}
} // end playBlackjack()
