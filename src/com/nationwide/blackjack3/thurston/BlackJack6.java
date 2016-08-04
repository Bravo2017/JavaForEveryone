package com.nationwide.blackjack3.thurston;

import java.util.*;

public class BlackJack6 {

	// Author: Nathan Thurston

	/**
	 * @param args
	 */

	static int index = 0;
	static int nextcard = 0;
	static int dealerHand = 0;
	static int dealerAces = 0;
	static Random randomGenerator = new Random();
	static int numberOfPlayers;

	static ArrayList<Integer> deckvalues = new ArrayList<Integer>();
	static ArrayList<String> decksuits = new ArrayList<String>();
	static ArrayList<String> allPlayerNames = new ArrayList<String>();

	public static void removeCards(ArrayList<Integer> array,
			ArrayList<String> array2) {
		array.remove(index);
		array2.remove(index);
	}

	public static void addDecktoShoe(int x) {
		int y = 0;
		while (y < x) {
			deckvalues.addAll(DeckGenerators.CardValues());
			decksuits.addAll(DeckGenerators.Faces());
			y++;
		}
	}

	public static void enterBet(Player x) {
		Scanner betting = new Scanner(System.in);
		System.out.println(x.playerName + ", what is your bet? You have "
				+ x.playerMoney + " in your pocket.");
		x.playerBet = betting.nextInt();
		if (x.playerBet > x.playerMoney) {
			System.out
					.println("You can only bet what you have, but we'll be gladd to take it all. Your bet is "
							+ x.playerMoney);
			x.playerBet = x.playerMoney;
		}
		if (x.playerBet < 0){
			System.out.println("You have to bet something, so your bet is 1");
			x.playerBet = 1;
		}
			

	}

	public static void playerFirstCard(Player x) {
		index = randomGenerator.nextInt(deckvalues.size());
		nextcard = deckvalues.get(index);
		if (nextcard == 11) {
			x.playerAces++;
		}
		x.playerHand = x.playerHand + nextcard;
		System.out.println(x.playerName + "'s first card "
				+ decksuits.get(index));
		removeCards(deckvalues, decksuits);

	}

	public static void playerSecondCard(Player x) {

		index = randomGenerator.nextInt(deckvalues.size());
		nextcard = deckvalues.get(index);
		System.out.println(x.playerName + "'s next card "
				+ decksuits.get(index));
		if (nextcard == 11) {
			x.playerAces++;
		}
		x.playerHand = x.playerHand + nextcard;
		removeCards(deckvalues, decksuits);
		if (x.playerHand > 21 && x.playerAces > 0) {
			x.playerHand = x.playerHand - 10;
			x.playerAces--;
		}

		System.out.println("Players Hand " + x.playerHand);
	}

	public static void dealerFirstCard() {
		index = randomGenerator.nextInt(deckvalues.size());
		nextcard = deckvalues.get(index);

		if (nextcard == 11) {
			dealerAces++;
		}
		dealerHand = dealerHand + nextcard;
		System.out.println("Dealers first card " + decksuits.get(index));
		removeCards(deckvalues, decksuits);
	}

	public static void dealerSecondCard() {
		index = randomGenerator.nextInt(deckvalues.size());
		nextcard = deckvalues.get(index);
		if (nextcard == 11) {
			dealerAces++;
		}
		dealerHand = dealerHand + nextcard;
		removeCards(deckvalues, decksuits);
		if (dealerHand > 21 && dealerAces > 0) {
			dealerHand = dealerHand - 10;
			dealerAces--;
		}
		System.out.println();

	}

	public static void playerHit(Player x) {
		Scanner playerhit = new Scanner(System.in);
		// Random randomGeneratorHit = new Random();
		String pHit = "n";

		System.out.println();
		System.out.println(x.playerName + " do you wish to hit?");
		System.out.println("Enter Y to hit");
		pHit = playerhit.next();
		pHit = pHit.toLowerCase();
		if (pHit.equals("y")) {
			index = randomGenerator.nextInt(deckvalues.size());
			nextcard = deckvalues.get(index);
			System.out.println(x.playerName + "'s next card "
					+ decksuits.get(index));
			if (nextcard == 11) {
				x.playerAces++;
			}
			x.playerHand = x.playerHand + nextcard;
			removeCards(deckvalues, decksuits);
			if (x.playerHand > 21 && x.playerAces > 0) {
				x.playerHand = x.playerHand - 10;
				x.playerAces--;
			}
			System.out.println(x.playerHand);
			if (x.playerHand > 21) {
				System.out.println("Player Busts");
			}

			pHit = "n";
			System.out.println();
			System.out.println(x.playerName + ", do you wish to hit again?");
			System.out.println("Enter Y to hit");
			pHit = playerhit.next();
			pHit = pHit.toLowerCase();
			if (pHit.equals("y")) {
				index = randomGenerator.nextInt(deckvalues.size());
				nextcard = deckvalues.get(index);
				System.out.println(x.playerName + "'s next card "
						+ decksuits.get(index));
				if (nextcard == 11) {
					x.playerAces++;
				}
				x.playerHand = x.playerHand + nextcard;
				removeCards(deckvalues, decksuits);
				if (x.playerHand > 21 && x.playerAces > 0) {
					x.playerHand = x.playerHand - 10;
					x.playerAces--;
				}
				System.out.println(x.playerHand);
				if (x.playerHand > 21) {
					System.out.println("Player Busts");
				}

				pHit = "n";
				System.out.println();
				System.out
						.println(x.playerName + ", do you wish to hit again?");
				System.out.println("Enter Y to hit");
				pHit = playerhit.next();
				pHit = pHit.toLowerCase();
				if (pHit.equals("y")) {
					index = randomGenerator.nextInt(deckvalues.size());
					nextcard = deckvalues.get(index);
					System.out.println(x.playerName + "'s next card "
							+ decksuits.get(index));
					if (nextcard == 11) {
						x.playerAces++;
					}
					x.playerHand = x.playerHand + nextcard;
					removeCards(deckvalues, decksuits);
					if (x.playerHand > 21 && x.playerAces > 0) {
						x.playerHand = x.playerHand - 10;
						x.playerAces--;
					}
					System.out.println(x.playerHand);
					if (x.playerHand > 21) {
						System.out.println("Player Busts");
					pHit = "n";	

					}
				}
			}

		}

	//	playerhit.close();
	}

	public static void dealerHit() {
		while (dealerHand < 17) {

			index = randomGenerator.nextInt(deckvalues.size());
			nextcard = deckvalues.get(index);
			if (nextcard == 11) {
				dealerAces++;
			}
			dealerHand = dealerHand + nextcard;
			removeCards(deckvalues, decksuits);
			if (dealerHand > 21 && dealerAces > 0) {
				dealerHand = dealerHand - 10;
				dealerAces--;
			}

		}
	}

	public static void evaluateWinners(Player x) {

		if (x.playerHand > 21) {
			System.out.println(x.playerName + " Busts, Dealer wins!");
			x.playerMoney = x.playerMoney - x.playerBet;
		} else {

			if (dealerHand > 21) {
				System.out.println(" Dealer Busts, " + x.playerName + " wins!");
				x.playerMoney = x.playerMoney + x.playerBet;
			} else {

				System.out.println("Dealers Score " + dealerHand);
				System.out.println(x.playerName + "'s Score " + x.playerHand);

				if (x.playerHand > dealerHand) {
					System.out.println(x.playerName + " Wins");
					x.playerMoney = x.playerMoney + x.playerBet;
					;
				} else
					System.out.println("Dealer Wins");
				x.playerMoney = x.playerMoney - x.playerBet;
			}
		}
		System.out.println(x.playerName + ", you now have " + x.playerMoney + " in your pocket.");

	}

	public static void main(String[] args) {

		Player player1 = new Player();
		player1.playerName = "Player 1";
		Player player2 = new Player();
		player2.playerName = "Player 2";
		Player player3 = new Player();
		player3.playerName = "Player 3";
		Player player4 = new Player();
		player4.playerName = "Player 4";

		Scanner entries = new Scanner(System.in);
		System.out.println("New Game");
		System.out.println("How many players? Please enter a number 1 to 4");
		numberOfPlayers = entries.nextInt();
		if (numberOfPlayers > 4)
			numberOfPlayers = 4;
		if (numberOfPlayers < 0)
			numberOfPlayers = 1;

		// Player.createPlayers(numberOfPlayers);

		BlackJack6.addDecktoShoe(3);
		
		enterBet(player1);
		if (numberOfPlayers >= 2)
			enterBet(player2);
		if (numberOfPlayers >= 3)
			enterBet(player3);
		if (numberOfPlayers >= 4)
			enterBet(player4);
		

		// DEALERS FIRST CARD
		dealerFirstCard();
		System.out.println();

		playerFirstCard(player1);
		if (numberOfPlayers >= 2)
			playerFirstCard(player2);
		if (numberOfPlayers >= 3)
			playerFirstCard(player3);
		if (numberOfPlayers >= 4)
			playerFirstCard(player4);
		System.out.println();

		dealerSecondCard();

		playerSecondCard(player1);
		if (numberOfPlayers >= 2)
			playerSecondCard(player2);
		if (numberOfPlayers >= 3)
			playerSecondCard(player3);
		if (numberOfPlayers >= 4)
			playerSecondCard(player4);

		playerHit(player1);
		if (numberOfPlayers >= 2)
			playerHit(player2);
		if (numberOfPlayers >= 3)
			playerHit(player3);
		if (numberOfPlayers >= 4)
			playerHit(player4);
		// turn this into some sort of loop to iterate through all players

		dealerHit();

		evaluateWinners(player1);
		if (numberOfPlayers >= 2)
			evaluateWinners(player2);
		if (numberOfPlayers >= 3)
			evaluateWinners(player3);
		if (numberOfPlayers >= 4)
			evaluateWinners(player4);

	}
}
