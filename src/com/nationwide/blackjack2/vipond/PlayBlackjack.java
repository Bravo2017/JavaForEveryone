package com.nationwide.blackjack2.vipond;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayBlackjack {

	public static void main(String[] args) {

		System.out.println("Welcome!!!   Let's play some blackjack!");
		Scanner in = new Scanner(System.in);

		/* Create a deck of cards */
		Deck deck1 = new Deck();
		ArrayList<String> currentDeck = new ArrayList<String>();
		currentDeck = deck1.createDeck();

		/* Shuffle the deck of cards */
		deck1.shuffle(currentDeck);

		/* Deal 2 cards to the player and the dealer */
		Hand dealer = new Hand();
		ArrayList<String> dealerHand = new ArrayList<String>();
		dealerHand = dealer.createHand();
		Hand player = new Hand();
		ArrayList<String> playerHand = new ArrayList<String>();
		playerHand = dealer.createHand();

		for (int i = 1; i <= 2; i++) {
			String nextCard = deck1.dealCard(currentDeck);
			playerHand.add(nextCard);
			String newnextCard = deck1.dealCard(currentDeck);
			dealerHand.add(newnextCard);
		}

		/* Determine the hand value */
		int playerTotalofHand = player.HandTotal(playerHand, deck1, "Player",
				false);
		int dealerTotalofHand = dealer.HandTotal(dealerHand, deck1, "Dealer",
				false);

		/* hit or stand */
		boolean contplay = true;
		boolean blackjack = false;
		if (playerTotalofHand == 21) {
			System.out.print("BLACKJACK.....you win!!");
			blackjack = true;
			contplay = false;
		} else {
			if (dealerTotalofHand == 21 && blackjack == false) {
				System.out.print("BLACKJACK.....dealer wins!!");
				blackjack = true;
				contplay = false;
			}

		}
		while ((contplay == true) && (playerTotalofHand < 21)) {
			System.out.print("Hit (H) or Stand (S)??? ");
			char HitStand;
			String userinput = in.toString();
			HitStand = userinput.charAt(0);
			do {
				HitStand = Character.toUpperCase(in.next().charAt(0));
				if (HitStand != 'H' && HitStand != 'S') {
					System.out.print("Please respond H or S:  ");
				}
			} while (HitStand != 'H' && HitStand != 'S');
			if (HitStand == 'S') {
				contplay = false;
			} else {
				String nextCard = deck1.dealCard(currentDeck);
				playerHand.add(nextCard);
				playerTotalofHand = player.HandTotal(playerHand, deck1,
						"Player", false);
				if (playerTotalofHand > 21) {
					System.out.println("Busted....sorry, you lose");
					contplay = false;
				}
			}
		}
		/* see if dealer needs to get more cards */
		if (dealerTotalofHand < 17 && playerTotalofHand <= 21
				&& blackjack == false) {
			boolean conthit = true;
			do {
				System.out.println("Dealer total of " + dealerTotalofHand
						+ " is less than 17 so they must hit.");
				String nextCard = deck1.dealCard(currentDeck);
				dealerHand.add(nextCard);
				dealerTotalofHand = dealer.HandTotal(dealerHand, deck1,
						"dealer", false);
				if (dealerTotalofHand > 21) {
					System.out.println("Dealer is Busted....player wins!");
					conthit = false;
				}
			} while (dealerTotalofHand < 17);
			System.out.println();
		} else {
			dealerTotalofHand = dealer.HandTotal(dealerHand, deck1, "dealer",
					true);
		}

		/* Determine who wins */
		if (playerTotalofHand <= 21 && dealerTotalofHand <= 21
				&& blackjack == false) {
			if (dealerTotalofHand > playerTotalofHand) {
				System.out.println("DEALER WINS!");
			} else {
				if (dealerTotalofHand == playerTotalofHand) {
					System.out
							.println("IT IS A PUSH....NO ONE WINS (OR LOSES)!");
				} else {
					System.out.println("YOU WIN!");
				}
			}
		}
		System.out.println("Your hand = " + playerTotalofHand
				+ " and Dealer hand = " + dealerTotalofHand);

	}
}
