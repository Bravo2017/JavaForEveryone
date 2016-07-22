package com.nationwide.blackjack.walker;

import java.util.ArrayList;
import java.util.Scanner;

public class Gameplay {

	static Deck deck = new Deck();
	static Dealer dealer = new Dealer();
	static ArrayList<Player> players = new ArrayList<Player>();
	static int playerCount;
	static Scanner input = new Scanner(System.in);

	static void addPlayers() {

		for (int i = 1; i <= playerCount; i++) {
			players.add(new Player(i));
		}

	}

	static void dealHands() {

		boolean isFaceDown = true;

		for (Player p : players) {
			p.addCard(deck.getTopCard());
		}

		dealer.addCard(deck.getTopCard());

		for (Player p : players) {
			p.addCard(deck.getTopCard());
		}

		dealer.addCard(deck.getTopCard(isFaceDown));

	}

	static void placeBets() {

		for (Player p : players) {
			System.out.print("Player " + p.getPlayerNumber() + " enter bet: ");
			p.setBet(input.nextDouble());

			while ((p.getBet() < 1) || (p.getBet() > p.getChipValue())) {
				System.out.print("Invalid bet. Please re-enter: ");
				p.setBet(input.nextDouble());
			}

		}
	}

	static void startTurns() {

		for (Player p : players) {

			p.takeTurn(deck);

			if (p.getHandValue() > 21) {
				System.out.println("Player " + p.getPlayerNumber() + "has gone bust.");
				p.lostHand();
			}

		}

		dealer.takeTurn(deck);

	}

	static void checkForBlackjack() {

		for (Player p : players) {

			if (p.getHandValue() == 21) {
				double winnings = p.getBet() * 1.5;
				p.addWinnings(winnings);
				p.setOutOfRound(true);
				System.out.println("Player " + p.getPlayerNumber() + " has a blackjack and has won " + winnings + ".");

			}

		}

	}

	static void settleBets() {

		for (Player p : players) {

			if (p.outOfRound) {

			} else if (p.getHandValue() > dealer.getHandValue()) {
				p.addWinnings(p.getBet());
				System.out.println("Player " + p.getPlayerNumber() + " has won " + p.getBet() + ". Total chip value: "
						+ p.getChipValue());
			} else if (p.getHandValue() < dealer.getHandValue()) {
				p.lostHand();
				System.out.println("Player " + p.getPlayerNumber() + " has lost " + p.getBet() + ". Total chip value: "
						+ p.getChipValue());
			} else if (p.getHandValue() == dealer.getHandValue()) {
				System.out.println("Player " + p.getPlayerNumber() + " has tied the dealer. Total chip value: "
						+ p.getChipValue());
			}

		}

	}

	static void printAllHands() {

		dealer.printHand();

		for (Player p : players) {

			p.printHand();

			if (p.getHandValue() == -1) {
				System.out.println("Player " + p.getPlayerNumber() + " has gone bust.");
				System.out.println("");
			}
		}

	}

	static void inputPlayerCount() {

		System.out.print("How many players (1-6)? ");

		playerCount = input.nextInt();

		while ((playerCount < 1) || (playerCount > 6)) {
			System.out.print("Invalid player count. Please re-enter (1-6): ");
			playerCount = input.nextInt();
		}

		System.out.println("");

	}

	static void resetTable() {

		for (Player p : players) {
			p.resetHand();
		}

		dealer.resetHand();

		dealer.shuffleDeck(deck);

	}

}
