package com.nationwide.blackjackFinal2;

/* this class contains main function
 * @author Diana Raush
 *
 */

/*	Requirements
 2 players (one dealer)
 Create a hand for each
 hand is two cards
 52 card deck
 Evaluate winner

 Add suit
 Add options to hit and stay
 The dealer must draw on 16 and stay on 17
 Add the Ace value determination

 * 
 */

import java.util.Scanner;

public class Blackjack {

	private Deck newDeck;
	private boolean playerDone;
	private boolean dealerDone;
	private Players dealer;
	private Players player;
	private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		new Blackjack();
	}

	Blackjack() {

		// Create Deck of cards
		this.newDeck = new Deck();
		
		// Create Players
		player = new Players("Player1");
		dealer = new Players("Dealer");

		this.dealTheGame();

		System.out.println("\n Game ended ");

		// To play again
		System.out.println("\n Do you want to play again [Y or N]?");
		String Y = sc.next();
		if (Y.compareToIgnoreCase("Y") == 0) {

			new Blackjack();
		} else {
			System.out.println("\n Have a good day ");

		}

		// closing scanner
		sc.close();

	}

	// Deal the game
	private void dealTheGame() {

		boolean blackjack = false;

		// players start with empty hands
		player.emptyHand();
		dealer.emptyHand();

		this.playerDone = false;
		this.dealerDone = false;

		// Deal 2 cards to each player - Dealer and player
		System.out.println("\n---Dealing Cards---\n");
		
		player.addCardToPlayersHand(newDeck.dealingNextCard());
		dealer.addCardToPlayersHand(newDeck.dealingNextCard());

		player.addCardToPlayersHand(newDeck.dealingNextCard());
		dealer.addCardToPlayersHand(newDeck.dealingNextCard());

		// Print the Cards Dealt
		dealer.printCardsInHand(false);
		player.printCardsInHand(true);

		System.out.printf("Your Score:%d\t", player.getPlayersHandTotal());

		// checking for Blackjack on initial dealt hand
		blackjack = this.checkIfBlackJack();

		while (!this.playerDone || !this.dealerDone) {

			if (!this.playerDone) {

				this.playerPlay();

			} else if (!this.dealerDone) {

				this.dealersPlay();
			}

			System.out.println();
		}

		if (!blackjack) {

			this.evaluateWinner();
		}
	}

	// check for 21 on initial dealt cards
	private boolean checkIfBlackJack() {

		boolean blackJack = false;

		if (player.getPlayersHandTotal() == 21) { 									// Player has 21

			this.playerDone = true;
			this.dealerDone = true;

			blackJack = true;
			
			if (player.getPlayersHandTotal() > dealer.getPlayersHandTotal()		//player has 21, dealer does not 
			|| dealer.getPlayersHandTotal() > 21) {
			{
				System.out.println("\t--- Blackjack - YOU WON ---");

				dealer.printCardsInHand(true);

				System.out.printf("Dealer's Score:%d\n\n",
						dealer.getPlayersHandTotal());

			}	
			} else {															//player has 21, dealer has 21 

				dealer.printCardsInHand(true);

				System.out.printf("Dealer's Score:%d\n\n",
						dealer.getPlayersHandTotal());
				System.out.println("\t--- PUSH ---");


			}
			
		} else if (dealer.getPlayersHandTotal() == 21) {						//Dealer has 21, player does not

			this.playerDone = true;
			this.dealerDone = true;

			dealer.printCardsInHand(true);
			System.out.printf("Dealer's Score:%d\n\n",
					dealer.getPlayersHandTotal());

			System.out.println("\t--- Dealer's blackjack - YOU LOST ---");

			blackJack = true;
		}

		return blackJack;
	}

	// Player's Play Turn
	private void playerPlay() {

		String answer;
		
		System.out.print("Hit [H} or Stay [S]?");

		answer = sc.next();
		System.out.println();

		if (answer.compareToIgnoreCase("H") == 0) {
			this.hit();
		} else {
			this.stay();
		}
	}

	// Player's Hit
	private void hit() {

		System.out.println("\tYou Chose to Hit.\n");
		playerDone = !player.addCardToPlayersHand(newDeck.dealingNextCard());
		player.printCardsInHand(true);
		System.out.printf("Player1 Score:%d\t", player.getPlayersHandTotal());

		if (player.getPlayersHandTotal() > 21) {
			System.out.println("\t--- You busted ---");
			dealer.printCardsInHand(true);
			System.out.printf("Dealer's Score:%d\n\n",
					dealer.getPlayersHandTotal());
			playerDone = true;
			dealerDone = true;
		}

	}

	// Player's Stay
	private void stay() {

		System.out.println("\tYou Chose to Stay, Dealer's turn \n");
		playerDone = true;
	}

	// Dealer's Play Turn
	private void dealersPlay() {

		if (dealer.getPlayersHandTotal() < 17) {

			dealer.printCardsInHand(true);
			System.out.printf("Dealer's Score:%d\n\n",
					dealer.getPlayersHandTotal());
			System.out.println("\tDealer Hits \n");
			dealerDone = !dealer
					.addCardToPlayersHand(newDeck.dealingNextCard());

			if (dealer.getPlayersHandTotal() > 21) {

				dealer.printCardsInHand(true);
				System.out.printf("Dealer's Score:%d\n\n",
						dealer.getPlayersHandTotal());
				System.out.println("\t--- Dealer busted ---");
				dealerDone = true;
			}
		} else {

			dealer.printCardsInHand(true);
			System.out.printf("Dealer's Score:%d\n\n",
					dealer.getPlayersHandTotal());
			System.out.println("\tDealer Stays \n");
			dealerDone = true;
		}
	}

	// Deciding a Winner
	private void evaluateWinner() {

		int playerSum = player.getPlayersHandTotal();
		int dealerSum = dealer.getPlayersHandTotal();

		if (playerSum > dealerSum && playerSum <= 21 || dealerSum > 21) {
			System.out.println("\t--- YOU WON ---");
		} else if (playerSum == dealerSum) {
			System.out.println("\t--- PUSH ---");
		} else {
			System.out.println("\t--- YOU LOST ---");
		}
	}

}