package com.nationwide.blackjack.samudrala;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by SAMUDRS1 on 7/17/2016.
 */
public class BlackJack {
	Dealer dealerInstance = new Dealer();

	public void beginTheGame(Map<String, Hand> currentHands,
			ArrayList<Card> deckArray) {
		int playersScore = getTheCurrentScore(currentHands.get("playersHand").currentHand);
		System.out.println("Players Score: " + playersScore);
		int dealersScore = getTheCurrentScore(currentHands.get("dealersHand").currentHand);
		System.out.println("Dealers Score: " + dealersScore);

		if (checkIfBusted(playersScore)) {
			System.out.println("Player BUSTED, Dealer Wins!");
		} else if (checkIfWashed(playersScore, dealersScore)) {
			System.out
					.println("Player and Dealer scored 21, the game is a WASH!");
		} else if (checkIfBlackJack(playersScore)) {
			System.out.println("Player Wins BlackJack!");
		} else if (checkIfBlackJack(dealersScore)) {
			System.out.println("Dealer Wins BlackJack!");
		} else if (playerStays(playersScore)) {
			System.out.println();
			System.out
					.println("Player decided to stay. Dealer continues playing until Busted or blackjack...");
			int updatedDealersScore = continueDrawingCardsAndCountScore(
					dealersScore, deckArray, "dealersHand", currentHands);
			compareTheScores(playersScore, updatedDealersScore);
		} else {
			System.out.println();
			System.out
					.println("Player continues playing until safe 17 or blackjack...");
			int updatedPlayersScore = continueDrawingCardsAndCountScore(
					playersScore, deckArray, "playersHand", currentHands);
			compareTheScores(updatedPlayersScore, dealersScore);
		}
	}

	public int continueDrawingCardsAndCountScore(int score,
			ArrayList<Card> deckArray, String hand,
			Map<String, Hand> currentHands) {
		while ((hand.contains("playersHand") && !playerStays(score))
				|| theGameContinues(score)) {
			Card newCard = dealerInstance.pickARandomCardFromTheDeck(deckArray);
			System.out.println(newCard.cardName + "; card value->"
					+ newCard.cardValue);
			currentHands.get(hand).currentHand.add(newCard);
			score = getTheCurrentScore(currentHands.get(hand).currentHand);
		}

		return score;
	}

	public boolean playerStays(int playersScore) {
		// need to add criteria that decides when the player stays
		if (playersScore < 17) {
			return false;
		}
		return true;
	}

	public boolean theGameContinues(int score) {
		// need to add more complex criteria here
		if (score < 21) {
			return true;
		}
		return false;
	}

	public void compareTheScores(int playersScore, int dealersScore) {
		System.out.println();
		System.out.println("Players Final Score: " + playersScore);
		System.out.println("Dealers Final Score: " + dealersScore);
		System.out.println();

		if (checkIfBusted(dealersScore)) {
			System.out.println("Dealer BUSTED, Player Wins!");
		} else if (checkIfBusted(playersScore)) {
			System.out.println("Player BUSTED, Dealer Wins!");
		} else if (dealersScore > playersScore) {
			System.out.println("Dealer Wins!");
		} else if (dealersScore == playersScore) {
			System.out.println("Both Win!");
		} else {
			System.out.println("Player Wins!");
		}
	}

	public int getTheCurrentScore(ArrayList<Card> currentHand) {
		int score = 0;
		for (Card card : currentHand) {
			score = score + card.cardValue;
		}

		return score;
	}

	public boolean checkIfBlackJack(int score) {
		if (score == 21) {
			return true;
		}

		return false;
	}

	public boolean checkIfBusted(int score) {
		// if the score is > 21, BUSTED
		if (score > 21) {
			return true;
		}

		return false;
	}

	public boolean checkIfWashed(int playersScore, int dealersScore) {
		// if the scores of player and dealer is 21, WASHED
		if (checkIfBlackJack(playersScore) && checkIfBlackJack(dealersScore)) {
			return true;
		}
		return false;
	}

}
