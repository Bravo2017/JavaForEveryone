package com.nationwide.blackjack.watson;

import java.util.Scanner;

public class GameMain {

	private Deck newDeck;
	private String playerName;
	private float balance;
	private static boolean youDone = true;
	private static boolean dealerDone = true;
	private Players dealer;
	private Players you;
	private Scanner sc = new Scanner(System.in);

	GameMain(String pName) {

		this.balance = 100;
		this.newDeck = new Deck(1, true);
		boolean gameOver = false;
		this.playerName = pName;

		// // Players init
		you = new Players(this.playerName);
		dealer = new Players("Dealer");

		// Game Starts here --->
		while (this.balance > 0 && !gameOver) {

			System.out.println("\n" + this.playerName
					+ ", Do you want to DEAL or END the game [D or E]??");
			String gameInit = sc.next();

			if (gameInit.compareToIgnoreCase("D") == 0) {

				this.dealTheGame();
			} else {

				gameOver = true;
			}
		}

		System.out.println("\n" + this.playerName + " has left the game.");

		// To play again
		// System.out.println("\n" + this.playerName
		// + ", Do you want to play again [Y or N]");
		// String Y = sc.next();
		// if (Y.compareToIgnoreCase("Y") == 0) {
		//
		// new GameMain(this.playerName);
		// }

		// closing scanner
		sc.close();

	}

	// Deal the game
	private void dealTheGame() {

		// players start with empty hands
		you.emptyHand();
		dealer.emptyHand();

		boolean blackjack = false;

		you.addCardToPlayersHand(newDeck.dealingNextCard());
		dealer.addCardToPlayersHand(newDeck.dealingNextCard());
		you.addCardToPlayersHand(newDeck.dealingNextCard());
		dealer.addCardToPlayersHand(newDeck.dealingNextCard());

		// Cards Dealt
		System.out.println("\n########## CARDS DEALT ##########\n");
		dealer.printCardsInHand(false);
		System.out.println();
		System.out.printf("Dealer's Score:%d\t", dealer.getPlayersHandTotal());
		System.out.println();
		System.out.println();
		you.printCardsInHand(true);
		System.out.println();
		System.out.printf("Your Score:%d\t", you.getPlayersHandTotal());
		blackjack = this.checkIfBlackJack();

		if (!blackjack) {

			this.decideWinner();
		}
	}

	// Natural 21 check on initial cards
	private boolean checkIfBlackJack() {

		boolean blackJack = false;

		if (you.getPlayersHandTotal() == 21) {

			GameMain.youDone = true;
			GameMain.dealerDone = true;

			if (you.getPlayersHandTotal() > dealer.getPlayersHandTotal()
					|| dealer.getPlayersHandTotal() > 21) {

				System.out.println();
				System.out.println("\t\t\t\t#################################");
				System.out.println("\t\t\t\t#                               #");
				System.out.println("\t\t\t\t# HURRAY!!...BLACKJACK, YOU WON #");
				System.out.println("\t\t\t\t#                               #");
				System.out
						.println("\t\t\t\t#################################\n");

				dealer.printCardsInHand(true);

				System.out.printf("Dealer's Score:%d\n\n",
						dealer.getPlayersHandTotal());
				blackJack = true;
			} else {

				System.out
						.println("\tIt could have been a BlackJack for you...\n");
				dealer.printCardsInHand(true);

				System.out.printf("Dealer's Score:%d\n\n",
						dealer.getPlayersHandTotal());
				blackJack = false;
			}
		} else if (dealer.getPlayersHandTotal() == 21) {

			dealer.printCardsInHand(true);
			System.out.printf("Dealer's Score:%d\n\n",
					dealer.getPlayersHandTotal());

			System.out.println("\t\t\t\t#################################");
			System.out.println("\t\t\t\t#                               #");
			System.out.println("\t\t\t\t# DEALER's BLACKJACK, YOU LOST  #");
			System.out.println("\t\t\t\t#                               #");
			System.out.println("\t\t\t\t#################################\n");

			GameMain.dealerDone = true;
			blackJack = false;
		}

		return blackJack;
	}

	// Deciding a Winner
	private void decideWinner() {

		int youSum = you.getPlayersHandTotal();
		int dealerSum = dealer.getPlayersHandTotal();

		if (youSum > dealerSum && youSum <= 21 || dealerSum > 21) {

			System.out.println();
			System.out.println("\t\t\t\t############");
			System.out.println("\t\t\t\t#          #");
			System.out.println("\t\t\t\t# YOU WON  #");
			System.out.println("\t\t\t\t#          #");
			System.out.println("\t\t\t\t############\n");

		} else if (youSum == dealerSum) {

			System.out.println();
			System.out.println("\t\t\t\t############");
			System.out.println("\t\t\t\t#          #");
			System.out.println("\t\t\t\t#   PUSH   #");
			System.out.println("\t\t\t\t#          #");
			System.out.println("\t\t\t\t############\n");

		} else {

			System.out.println();
			System.out.println("\t\t\t\t############");
			System.out.println("\t\t\t\t#          #");
			System.out.println("\t\t\t\t# YOU LOST #");
			System.out.println("\t\t\t\t#          #");
			System.out.println("\t\t\t\t############\n");
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String playerName;

		System.out.println("Enter Your Name:\n");
		playerName = scanner.nextLine();

		new GameMain(playerName);

		scanner.close();
	}

}
