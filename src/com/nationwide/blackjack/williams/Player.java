package com.nationwide.blackjack.williams;

import java.util.ArrayList;

public class Player {
	private ArrayList<Integer> playersHand = new ArrayList<Integer>();

	/**
	 * @return the playersHand
	 */
	public ArrayList<Integer> getPlayersHand() {
		return playersHand;
	}

	/**
	 * @param playersHand
	 *            the playersHand to set
	 */
	public void setPlayersCard(Integer card) {
		playersHand.add(card);
	}

}