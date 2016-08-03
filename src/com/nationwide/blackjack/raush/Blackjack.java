package com.nationwide.blackjackFinal1;

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
 Ace = 11
 * 
 * * @author D.Raush
 */

public class Blackjack {

	private Deck newDeck;
	private Players dealer;
	private Players player1;

	public static void main(String[] args) {

		new Blackjack();

	}

	Blackjack() {

		// Create Deck of Cards
		this.newDeck = new Deck();
		

		// Create Players 
		player1 = new Players("Player1");
		dealer = new Players("Dealer");

		this.dealTheGame();

	}

	// Deal the game
	private void dealTheGame() {

		boolean blackjack = false;

		// players start with empty hands
		player1.emptyHand();
		dealer.emptyHand();

		// Deal 2 cards to each player - Dealer and player
		System.out.println("\n---Dealing cards---\n");
		
		player1.addCardToPlayersHand(newDeck.dealingNextCard());
		dealer.addCardToPlayersHand(newDeck.dealingNextCard());
		
		player1.addCardToPlayersHand(newDeck.dealingNextCard());
		dealer.addCardToPlayersHand(newDeck.dealingNextCard());

		// Print the Cards Dealt
		dealer.printCardsInHand();
		player1.printCardsInHand();

		System.out.printf("Player1's Score:%d\t", player1.getPlayersHandTotal());
		System.out.printf("Dealer's Score:%d\n\n", dealer.getPlayersHandTotal());
		

		blackjack = this.checkIfBlackJack();

		if (!blackjack) {

			this.evaluateWinner();
		}
	}

	// 21 check on initial cards dealt
	private boolean checkIfBlackJack() {

		boolean blackJack = false;

		if (player1.getPlayersHandTotal() == 21) {								//Player has 21

			blackJack = true;
			if (player1.getPlayersHandTotal() > dealer.getPlayersHandTotal()	//Player has 21, Dealer not 21
					|| dealer.getPlayersHandTotal() > 21) {

				System.out.println("\t--- Player Blackjack, YOU WON ---");

			} else  {														//Player has 21, Dealer has 21

				System.out.println("\t--- PUSH ---");

			}
		} else if (dealer.getPlayersHandTotal() == 21) {					//Dealer has 21, player does not

			System.out.println("\t--- Dealer's Blackjack, YOU LOST ---");

			blackJack = true;
		}

		return blackJack;
	}

	// evaluate winner
	private void evaluateWinner() {

		int player1Sum = player1.getPlayersHandTotal();
		int dealerSum = dealer.getPlayersHandTotal();

		if (player1Sum > dealerSum && player1Sum <= 21 || dealerSum > 21) {

			System.out.println("\t--- YOU WON ---");

		} else if (player1Sum == dealerSum) {

			System.out.println("\t--- PUSH ---");
		} else {

			System.out.println("\t--- YOU LOST ---");
		}
	}

}