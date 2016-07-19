package com.nationwide.blackjack.thurston;

import java.util.ArrayList;
import java.util.Random;

public class BlackJack {

	// static Random randomGenerator;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random randomGenerator = new Random();

		ArrayList<Integer> deck = new ArrayList<Integer>();

		// add clubs

		int c2 = 2;
		deck.add(c2);

		int c3 = 3;
		deck.add(c3);

		int c4 = 4;
		deck.add(c4);

		int c5 = 5;
		deck.add(c5);

		int c6 = 6;
		deck.add(c6);

		int c7 = 7;
		deck.add(c7);

		int c8 = 8;
		deck.add(c8);

		int c9 = 9;
		deck.add(c9);

		int c10 = 10;
		deck.add(c10);

		int cJ = 10;
		deck.add(cJ);

		int cQ = 10;
		deck.add(cQ);

		int cK = 10;
		deck.add(cK);

		int cA = 11;
		deck.add(cA);

		// add diamonds

		int d2 = 2;
		deck.add(d2);

		int d3 = 3;
		deck.add(d3);

		int d4 = 4;
		deck.add(d4);

		int d5 = 5;
		deck.add(d5);

		int d6 = 6;
		deck.add(d6);

		int d7 = 7;
		deck.add(d7);

		int d8 = 8;
		deck.add(d8);

		int d9 = 9;
		deck.add(d9);

		int d10 = 10;
		deck.add(d10);

		int dJ = 10;
		deck.add(dJ);

		int dQ = 10;
		deck.add(dQ);

		int dK = 10;
		deck.add(dK);

		int dA = 11;
		deck.add(dA);

		// add hearts

		int h2 = 2;
		deck.add(h2);

		int h3 = 3;
		deck.add(h3);

		int h4 = 4;
		deck.add(h4);

		int h5 = 5;
		deck.add(h5);

		int h6 = 6;
		deck.add(h6);

		int h7 = 7;
		deck.add(h7);

		int h8 = 8;
		deck.add(h8);

		int h9 = 9;
		deck.add(h9);

		int h10 = 10;
		deck.add(h10);

		int hJ = 10;
		deck.add(hJ);

		int hQ = 10;
		deck.add(hQ);

		int hK = 10;
		deck.add(hK);

		int hA = 11;
		deck.add(hA);

		// add spades

		int s2 = 2;
		deck.add(s2);

		int s3 = 3;
		deck.add(s3);

		int s4 = 4;
		deck.add(s4);

		int s5 = 5;
		deck.add(s5);

		int s6 = 6;
		deck.add(s6);

		int s7 = 7;
		deck.add(s7);

		int s8 = 8;
		deck.add(s8);

		int s9 = 9;
		deck.add(s9);

		int s10 = 10;
		deck.add(s10);

		int sJ = 10;
		deck.add(sJ);

		int sQ = 10;
		deck.add(sQ);

		int sK = 10;
		deck.add(sK);

		int sA = 11;
		deck.add(sA);

		// deck arrayList assembled

		int dealerHand = 0;
		int playerHand = 0;
		int index = 0;

		// hands and index variables initialized

		index = randomGenerator.nextInt(deck.size());
		dealerHand = dealerHand + deck.get(index);
		deck.remove(index);

		index = randomGenerator.nextInt(deck.size());
		playerHand = dealerHand + deck.get(index);
		deck.remove(index);

		index = randomGenerator.nextInt(deck.size());
		dealerHand = dealerHand + deck.get(index);
		deck.remove(index);

		index = randomGenerator.nextInt(deck.size());
		playerHand = dealerHand + deck.get(index);
		deck.remove(index);

		// generate random numbers within the size of the arrayList, and then
		// use them to pick index points and extract the values to the hand

		System.out.println("Dealer " + dealerHand);
		System.out.println("Player " + playerHand);

		if (playerHand > dealerHand) {
			System.out.println("Player Wins");
			;
		} else
			System.out.println("Dealer Wins");

		dealerHand = 0;
		playerHand = 0;

	}

}
