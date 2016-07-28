package com.nationwide.blackjack2.thurston;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BlackJack2 {

	// Author: Nathan Thurston
	// static Random randomGenerator;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random randomGenerator = new Random();

		ArrayList<String> decksuits = new ArrayList<String>();

		// add clubs

		String c2 = "Two of Clubs";
		decksuits.add(c2);

		String c3 = "Three of Clubs";
		decksuits.add(c3);

		String c4 = "Four of Clubs";
		decksuits.add(c4);

		String c5 = "Five of Clubs";
		decksuits.add(c5);

		String c6 = "Six of Clubs";
		decksuits.add(c6);

		String c7 = "Seven of Clubs";
		decksuits.add(c7);

		String c8 = "Eight of Clubs";
		decksuits.add(c8);

		String c9 = "Nine of Clubs";
		decksuits.add(c9);

		String c10 = "Ten of Clubs";
		decksuits.add(c10);

		String cJ = "Jack of Clubs";
		decksuits.add(cJ);

		String cQ = "Queens of Clubs";
		decksuits.add(cQ);

		String cK = "King of Clubs";
		decksuits.add(cK);

		String cA = "Aces of Clubs";
		decksuits.add(cA);

		// add diamonds

		String d2 = "Two of Diamonds";
		decksuits.add(d2);

		String d3 = "Three of Diamonds";
		decksuits.add(d3);

		String d4 = "Four of Diamonds";
		decksuits.add(d4);

		String d5 = "Five of Diamonds";
		decksuits.add(d5);

		String d6 = "Six of Diamonds";
		decksuits.add(d6);

		String d7 = "Seven of Diamonds";
		decksuits.add(d7);

		String d8 = "Eight of Diamonds";
		decksuits.add(d8);

		String d9 = "Nine of Diamonds";
		decksuits.add(d9);

		String d10 = "Ten of Diamonds";
		decksuits.add(d10);

		String dJ = "Jack of Diamonds";
		decksuits.add(dJ);

		String dQ = "Queen of Diamonds";
		decksuits.add(dQ);

		String dK = "King of Diamonds";
		decksuits.add(dK);

		String dA = "Ace of Diamonds";
		decksuits.add(dA);

		// add hearts

		String h2 = "Two of Hearts";
		decksuits.add(h2);

		String h3 = "Three of Hearts";
		decksuits.add(h3);

		String h4 = "Four of Hearts";
		decksuits.add(h4);

		String h5 = "Five of Hearts";
		decksuits.add(h5);

		String h6 = "Six of Hearts";
		decksuits.add(h6);

		String h7 = "Seven of Hearts";
		decksuits.add(h7);

		String h8 = "Eight of Hearts";
		decksuits.add(h8);

		String h9 = "Nine of Hearts";
		decksuits.add(h9);

		String h10 = "Ten of Hearts";
		decksuits.add(h10);

		String hJ = "Jack of Hearts";
		decksuits.add(hJ);

		String hQ = "Queen of Hearts";
		decksuits.add(hQ);

		String hK = "King of Hearts";
		decksuits.add(hK);

		String hA = "Ace of Hearts";
		decksuits.add(hA);

		// add spades

		String s2 = "Two of Spades";
		decksuits.add(s2);

		String s3 = "Three of Spades";
		decksuits.add(s3);

		String s4 = "Four of Spades";
		decksuits.add(s4);

		String s5 = "Five of Spades";
		decksuits.add(s5);

		String s6 = "Six of Spades";
		decksuits.add(s6);

		String s7 = "Seven of Spades";
		decksuits.add(s7);

		String s8 = "Eight of Spades";
		decksuits.add(s8);

		String s9 = "Nine of Spades";
		decksuits.add(s9);

		String s10 = "Ten of Spades";
		decksuits.add(s10);

		String sJ = "Jack of Spades";
		decksuits.add(sJ);

		String sQ = "Queen of Spades";
		decksuits.add(sQ);

		String sK = "King of Spades";
		decksuits.add(sK);

		String sA = "Ace of Spades";
		decksuits.add(sA);

		ArrayList<Integer> deck = new ArrayList<Integer>();
		Scanner playerhit = new Scanner(System.in);

		// add clubs

		int c21 = 2;
		deck.add(c21);

		int c31 = 3;
		deck.add(c31);

		int c41 = 4;
		deck.add(c41);

		int c51 = 5;
		deck.add(c51);

		int c61 = 6;
		deck.add(c61);

		int c71 = 7;
		deck.add(c71);

		int c81 = 8;
		deck.add(c81);

		int c91 = 9;
		deck.add(c91);

		int c101 = 10;
		deck.add(c101);

		int cJ1 = 10;
		deck.add(cJ1);

		int cQ1 = 10;
		deck.add(cQ1);

		int cK1 = 10;
		deck.add(cK1);

		int cA1 = 11;
		deck.add(cA1);

		// add diamonds

		int d21 = 2;
		deck.add(d21);

		int d31 = 3;
		deck.add(d31);

		int d41 = 4;
		deck.add(d41);

		int d51 = 5;
		deck.add(d51);

		int d61 = 6;
		deck.add(d61);

		int d71 = 7;
		deck.add(d71);

		int d81 = 8;
		deck.add(d81);

		int d91 = 9;
		deck.add(d91);

		int d101 = 10;
		deck.add(d101);

		int dJ1 = 10;
		deck.add(dJ1);

		int dQ1 = 10;
		deck.add(dQ1);

		int dK1 = 10;
		deck.add(dK1);

		int dA1 = 11;
		deck.add(dA1);

		// add hearts

		int h21 = 2;
		deck.add(h21);

		int h31 = 3;
		deck.add(h31);

		int h41 = 4;
		deck.add(h41);

		int h51 = 5;
		deck.add(h51);

		int h61 = 6;
		deck.add(h61);

		int h71 = 7;
		deck.add(h71);

		int h81 = 8;
		deck.add(h81);

		int h91 = 9;
		deck.add(h91);

		int h101 = 10;
		deck.add(h101);

		int hJ1 = 10;
		deck.add(hJ1);

		int hQ1 = 10;
		deck.add(hQ1);

		int hK1 = 10;
		deck.add(hK1);

		int hA1 = 11;
		deck.add(hA1);

		// add spades

		int s21 = 2;
		deck.add(s21);

		int s31 = 3;
		deck.add(s31);

		int s41 = 4;
		deck.add(s41);

		int s51 = 5;
		deck.add(s51);

		int s61 = 6;
		deck.add(s61);

		int s71 = 7;
		deck.add(s71);

		int s81 = 8;
		deck.add(s81);

		int s91 = 9;
		deck.add(s91);

		int s101 = 10;
		deck.add(s101);

		int sJ1 = 10;
		deck.add(sJ1);

		int sQ1 = 10;
		deck.add(sQ1);

		int sK1 = 10;
		deck.add(sK1);

		int sA1 = 11;
		deck.add(sA1);

		// deck arrayList assembled

		int dealerHand = 0;
		int playerHand = 0;
		int index = 0;
		int nextcard = 0;
		int dealerAces = 0;
		int playerAces = 0;
		String pHit = "n";

		// hands and index variables initialized

		index = randomGenerator.nextInt(deck.size());
		nextcard = deck.get(index);

		// generate random numbers within the size of the arrayList, and then
		// use them to pick index points and extract the values to the hand
		if (nextcard == 11) {
			dealerAces++;
		}
		dealerHand = dealerHand + nextcard;
		// System.out.println("index" + index);
		deck.remove(index);
		System.out.println("Dealers first card " + decksuits.get(index));
		decksuits.remove(index);
		// draw a card, evaluate for ACE (dealer), add to hand, remove card from
		// deck

		index = randomGenerator.nextInt(deck.size());
		nextcard = deck.get(index);
		if (nextcard == 11) {
			playerAces++;
		}
		playerHand = playerHand + nextcard;
		deck.remove(index);
		System.out.println("Players first card " + decksuits.get(index));
		decksuits.remove(index);

		// draw a card, evaluate for ACE (player), add to hand, remove card from
		// deck

		index = randomGenerator.nextInt(deck.size());
		nextcard = deck.get(index);
		if (nextcard == 11) {
			dealerAces++;
		}
		dealerHand = dealerHand + nextcard;
		deck.remove(index);
		decksuits.remove(index);
		if (dealerHand > 21 && dealerAces > 0) {
			dealerHand = dealerHand - 10;
			dealerAces--;
		}

		// draw a card, evaluate for ACE (dealer), add to hand, remove card from
		// deck
		// adjust dealer hand for ACE if applicable

		index = randomGenerator.nextInt(deck.size());
		nextcard = deck.get(index);
		System.out.println("Players next card " + decksuits.get(index));
		if (nextcard == 11) {
			playerAces++;
		}
		playerHand = playerHand + nextcard;
		deck.remove(index);
		decksuits.remove(index);
		if (playerHand > 21 && playerAces > 0) {
			playerHand = playerHand - 10;
			playerAces--;
		}

		System.out.println("Players Hand " + playerHand);

		System.out.println();
		System.out.println("Player, do you wish to hit?");
		System.out.println("Enter Y to hit");
		pHit = playerhit.next();
		pHit = pHit.toLowerCase();
		if (pHit.equals("y")) {
			index = randomGenerator.nextInt(deck.size());
			nextcard = deck.get(index);
			System.out.println("Players next card " + decksuits.get(index));
			if (nextcard == 11) {
				playerAces++;
			}
			playerHand = playerHand + nextcard;
			deck.remove(index);
			decksuits.remove(index);
			if (playerHand > 21 && playerAces > 0) {
				playerHand = playerHand - 10;
				playerAces--;
			}
			System.out.println(playerHand);
			if (playerHand > 21) {
				System.out.println("Player Busts");
			}

			pHit = "n";
			System.out.println();
			System.out.println("Player, do you wish to hit again?");
			System.out.println("Enter Y to hit");
			pHit = playerhit.next();
			pHit = pHit.toLowerCase();
			if (pHit.equals("y")) {
				index = randomGenerator.nextInt(deck.size());
				nextcard = deck.get(index);
				System.out.println("Players next card " + decksuits.get(index));
				if (nextcard == 11) {
					playerAces++;
				}
				playerHand = playerHand + nextcard;
				deck.remove(index);
				decksuits.remove(index);
				if (playerHand > 21 && playerAces > 0) {
					playerHand = playerHand - 10;
					playerAces--;
				}
				System.out.println(playerHand);
				if (playerHand > 21) {
					System.out.println("Player Busts");
				}

				pHit = "n";
				System.out.println();
				System.out.println("Player, do you wish to hit again?");
				System.out.println("Enter Y to hit");
				pHit = playerhit.next();
				pHit = pHit.toLowerCase();
				if (pHit.equals("y")) {
					index = randomGenerator.nextInt(deck.size());
					nextcard = deck.get(index);
					System.out.println("Players next card "
							+ decksuits.get(index));
					if (nextcard == 11) {
						playerAces++;
					}
					playerHand = playerHand + nextcard;
					deck.remove(index);
					decksuits.remove(index);
					if (playerHand > 21 && playerAces > 0) {
						playerHand = playerHand - 10;
						playerAces--;
					}
					System.out.println(playerHand);
					if (playerHand > 21) {
						System.out.println("Player Busts");

					}
				}
			}

		}

		while (playerHand < 22 && dealerHand < 17) {

			index = randomGenerator.nextInt(deck.size());
			nextcard = deck.get(index);
			if (nextcard == 11) {
				dealerAces++;
			}
			dealerHand = dealerHand + nextcard;
			deck.remove(index);
			decksuits.remove(index);
			if (dealerHand > 21 && dealerAces > 0) {
				dealerHand = dealerHand - 10;
				dealerAces--;
			}
			if (dealerHand > 21) {
				System.out.println("Dealer Busts");
			}
		}

		// draw a card, evaluate for ACE (player), add to hand, remove card from
		// deck
		// adjust player hand for ACE if applicable

		if (playerHand > 21) {
			System.out.println(" Player Busts, Dealer wins!");
		} else {

			if (dealerHand > 21) {
				System.out.println(" Dealer Busts, Player wins!");
			} else {

				System.out.println("Dealers Score " + dealerHand);
				System.out.println("Players Score " + playerHand);

				if (playerHand > dealerHand) {
					System.out.println("Player Wins");
					;
				} else
					System.out.println("Dealer Wins");
			}
		}

		dealerHand = 0;
		playerHand = 0;

	}

}
