package com.nationwide.blackjack2.walker;

import java.util.ArrayList;

public class Player {

	ArrayList<Card> playerHand = new ArrayList<Card>();

	int handValue;
	double bet;
	double chipValue = 200;
	int playerNumber;
	boolean outOfRound = false;

	public Player() {

	}

	public Player(int playerNumber) {
		this.playerNumber = playerNumber;
	}

	public void addCard(Card topCard) {

		playerHand.add(topCard);
		handValue = handValue + topCard.getNumValue();

		if ((handValue > 21) && topCard.getValue() == "Ace") {
			handValue = handValue - 10;
		}
		if (handValue > 21) {
			handValue = -1;
		}

	}

	public void takeTurn(Deck deck) {

		int playerAction = 0;

		System.out.println("Player " + playerNumber + "'s turn");
		System.out.println("------------------------------------");

		while (playerAction != 2 && handValue != 21) {

			System.out.print("You are at " + handValue + ". 1. Hit 2. Stand: ");
			playerAction = Gameplay.input.nextInt();
			System.out.println("");

			while ((playerAction < 1) || (playerAction > 2)) {
				System.out.print("Invalid action. Please re-enter: ");
				playerAction = Gameplay.input.nextInt();
			}

			if (playerAction == 1) {
				addCard(deck.getTopCard());
				printHand();
			}

			if ((handValue == 21) || (handValue == -1)) {
				playerAction = 2;
			}

			System.out.println("");

		}

	}

	public void printHand() {

		System.out.print("Player " + getPlayerNumber() + ":     ");

		for (Card card : playerHand) {
			String format = (card.getValue() + " of " + card.getSuit());

			while (format.length() <= 18) {
				format = format + " ";
			}

			System.out.print(format);
		}

		System.out.println("");

		if (handValue != -1) {
			System.out.println("Hand Value:   " + handValue);
		} else {
			System.out.println("Hand Value: BUST");
		}

		System.out.println("");

	}

	public void addWinnings(double winnings) {
		chipValue = chipValue + winnings;
	}

	public void lostHand() {
		chipValue = chipValue - bet;
	}

	public int getHandValue() {
		return handValue;
	}

	public double getChipValue() {
		return chipValue;
	}

	public void setChipValue(double chipValue) {
		this.chipValue = chipValue;
	}

	public double getBet() {
		return bet;
	}

	public void setBet(double bet) {
		this.bet = bet;
	}

	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}

	public int getPlayerNumber() {
		return playerNumber;
	}

	public boolean isOutOfRound() {
		return outOfRound;
	}

	public void setOutOfRound(boolean outOfRound) {
		this.outOfRound = outOfRound;
	}

	public void resetHand() {
		playerHand = new ArrayList<Card>();
		outOfRound = false;
		handValue = 0;
		bet = 0;
	}

}
