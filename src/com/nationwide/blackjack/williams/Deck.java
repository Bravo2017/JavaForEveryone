package com.nationwide.blackjack.williams;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

	private ArrayList<Integer> hearts = new ArrayList<Integer>();
	private ArrayList<Integer> diamonds = new ArrayList<Integer>();
	private ArrayList<Integer> spades = new ArrayList<Integer>();
	private ArrayList<Integer> clubs = new ArrayList<Integer>();;

	/**
	 * @return the hearts
	 */
	public int getHeart() {
		Random randomHeart = new Random();
		int heartValue = randomHeart.nextInt(hearts.size()) + 1;
		return heartValue;
	}

	/**
	 * @param hearts
	 *            the hearts to set
	 */
	public void setHearts(ArrayList<Integer> hearts) {
		this.hearts = hearts;
	}

	/**
	 * @param the
	 *            heart to remove from the array
	 */
	public void deleteHeart(Integer heart) {
		int index;
		index = hearts.indexOf(heart);
		hearts.remove(index);
	}
}
