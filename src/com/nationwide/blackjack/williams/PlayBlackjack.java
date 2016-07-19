package com.nationwide.blackjack.williams;

import java.util.ArrayList;

public class PlayBlackjack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int card;
		int i;
		int x;
		int playerOneTotal = 0;
		int dealerTotal = 0;
		ArrayList<Integer> newSuit = new ArrayList<Integer>();
		for (i = 0; i < 13; i++) {
			newSuit.add(i);
		}
		Deck roundOne = new Deck();
		Player dealer = new Player();
		Player playerOne = new Player();
		roundOne.setHearts(newSuit);
		for (x = 0; x < 4; x++) {
			card = roundOne.getHeart();
			if ((x % 2) == 0) {
				playerOne.setPlayersCard(card);
			} else {
				dealer.setPlayersCard(card);
			}
			roundOne.deleteHeart(card);
		}
		for (Integer individualCard : playerOne.getPlayersHand()) {
			playerOneTotal = playerOneTotal + individualCard;
			System.out.println("Player One card:" + individualCard);
		}
		for (Integer individualCard : dealer.getPlayersHand()) {
			dealerTotal = dealerTotal + individualCard;
			System.out.println("Dealer card:" + individualCard);
		}
		if (playerOneTotal > 21) {
			System.out.println("Player One busted!");
		} else if (dealerTotal > 21) {
			System.out.println("Dealer busted!");
		} else if (dealerTotal > playerOneTotal) {
			System.out.println("Dealer Won!");
		} else if (playerOneTotal > dealerTotal) {
			System.out.println("Player Won!");
		} else {
			System.out.println("Push!");
		}
	}

}
