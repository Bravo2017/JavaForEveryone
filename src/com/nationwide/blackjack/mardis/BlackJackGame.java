package com.nationwide.blackjack.mardis;

import java.util.ArrayList;
import java.util.Random;

public class BlackJackGame {

	public DeckofCards newDeck;
	public Player dealer;
	public Player player1;

	public void PlayBlackJack() {
		shuffleDeck();
		assignPlayers();
		dealHand();
		// check hand for winner
		boolean dealerWins = compareHands(dealer.hand, player1.hand);
		if (dealerWins == true) {
			System.out.println("Dealer wins");
		} else {
			System.out.println("Player wins");
		}

	}

	public void startGame() {

		// assignPlayers;
	}

	public void shuffleDeck() {
		newDeck = new DeckofCards();

	}

	public void assignPlayers() {
		// create a dealer and a player
		dealer = new Player();
		player1 = new Player();

		dealer.setName("dealer");
		player1.setName("Brad");
	}

	public void dealHand() {

		// deal deck of cards
		// dealer.name = "Dealer";
		Card firstCard = new Card();
		Random randomNumber = new Random();
		// System.out.println("Size of deck " + newDeck.deck.size());
		int rn = randomNumber.nextInt(newDeck.deck.size() - 1);
		// System.out.println(rn);
		firstCard = newDeck.deck.get(rn);
		dealer.hand.add(firstCard);
		Card secondCard = new Card();
		rn = randomNumber.nextInt(newDeck.deck.size() - 1);
		// System.out.println(rn);
		secondCard = newDeck.deck.get(rn);
		dealer.hand.add(secondCard);
		System.out
				.println("Dealer hand is " + dealer.hand.get(0).cardNumber
						+ " " + dealer.hand.get(0).suit + " and "
						+ dealer.hand.get(1).cardNumber + " "
						+ dealer.hand.get(1).suit);

		// deal deck of cards to player1
		player1.name = "Bradley";
		Card firstCardP1 = new Card();
		rn = randomNumber.nextInt(51);
		// System.out.println(rn);
		firstCardP1 = newDeck.deck.get(rn);
		player1.hand.add(firstCardP1);

		Card secondCardP1 = new Card();
		rn = randomNumber.nextInt(51);
		// System.out.println(rn);
		secondCardP1 = newDeck.deck.get(rn);
		player1.hand.add(secondCardP1);
		System.out.println("Player1 hand is " + player1.hand.get(0).cardNumber
				+ " " + player1.hand.get(0).suit + " and "
				+ player1.hand.get(1).cardNumber + " "
				+ player1.hand.get(1).suit);
	}

	public boolean compareHands(ArrayList<Card> dealerHand,
			ArrayList<Card> playerHand) {
		int dealerTotal = dealerHand.get(0).cardValue
				+ dealerHand.get(1).cardValue;
		System.out.println("Dealer total is " + dealerTotal);
		int playerTotal = playerHand.get(0).cardValue
				+ playerHand.get(1).cardValue;
		System.out.println("Player1 total is " + playerTotal);

		if (dealerTotal > playerTotal) {
			return true;
		}
		return false;

	}
}
